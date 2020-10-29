package data;

import lombok.Data;
import lombok.ToString;
import pojo.Bag;
import pojo.Chip;
import pojo.Pot;

@ToString
@Data
public class StateData {
    private int currentPosition;
    private int currentWhiteChipValue;
    private Chip previousChip;
    private Bag bag;
    private Pot pot;
    private boolean isExploded;

    public StateData(){
        this.currentPosition = 0;
        this.currentWhiteChipValue = 0;
        this.previousChip = null;
        this.bag = new Bag();
        this.pot = new Pot();
        this.isExploded = false;
    }

    public StateData(StateData sd){
        this.currentPosition = sd.currentPosition;
        this.currentWhiteChipValue = sd.currentWhiteChipValue;
        this.bag = new Bag(sd.bag);
        this.pot = new Pot(sd.pot);
        this.isExploded = sd.isExploded;
    }

    public int getShopValueFromPot(){
        return this.getPot().getTileList().get(this.getCurrentPosition()).getShopValue();
    }

    public void addToCurrentWhiteChipValue(int value){
        this.currentWhiteChipValue += value;
    }

    public void resetRound(){
        this.currentPosition = 0;
        this.currentWhiteChipValue = 0;
        this.previousChip = null;
        this.isExploded = false;
    }

}
