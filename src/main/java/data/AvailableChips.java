package data;

import lombok.AllArgsConstructor;
import lombok.Data;
import pojo.Chip;
import pojo.ChipType;

import java.util.ArrayList;
import java.util.List;

@Data
public class AvailableChips {
    private List<Chip> availableChipsToBuy;

    public AvailableChips(){
        initAvailableChip();
    }

    private void initAvailableChip(){
        this.availableChipsToBuy = new ArrayList<>();
        addChips(ChipType.orangeChip, 16);
        addChips(ChipType.greenChip1, 11);
        addChips(ChipType.greenChip2, 6);
        addChips(ChipType.greenChip4, 9);
        addChips(ChipType.blueChip1, 14);
        addChips(ChipType.blueChip2, 10);
        addChips(ChipType.blueChip4, 10);
        addChips(ChipType.redChip1, 12);
        addChips(ChipType.redChip2, 8);
        addChips(ChipType.redChip4, 10);
        addChips(ChipType.blackChip, 18);
    }

    public void addPurpleChip(){
        addChips(ChipType.purpleChip, 15);
    }

    public void addYellowChip(){
        addChips(ChipType.yellowChip1, 13);
        addChips(ChipType.yellowChip2, 6);
        addChips(ChipType.yellowChip4, 10);
    }


    private void addChips(Chip chip, int amount){
        for (int i = 0; i < amount; i++){
            this.availableChipsToBuy.add(chip);
        }
    }


}
