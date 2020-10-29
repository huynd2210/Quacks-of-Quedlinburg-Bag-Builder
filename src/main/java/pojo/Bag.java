package pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
@ToString
public class Bag {
    private List<Chip> chips;

    public Bag(){
        this.chips = new ArrayList<>();
        initBag();
        Collections.shuffle(this.chips);
    }

    public Bag(Bag bag){
        this.chips = new ArrayList<>();
        for (Chip c : bag.chips){
            this.chips.add(new Chip(c));
        }
        Collections.shuffle(this.chips);
    }

    public void addChip(Chip chip){
        this.chips.add(chip);
        Collections.shuffle(this.chips);
    }

    public void addChipWithoutShuffle(Chip chip){
        this.chips.add(chip);
    }

    public Chip popChip(){
        Chip chip = this.chips.get(0);
        this.chips.remove(0);
        return chip;
    }

    //initial chips in bag: 1 green, 1 orange, 1 white4, 2 white2, 4 white1
    private void initBag(){
        addChip(ChipType.greenChip1);
        addChip(ChipType.orangeChip);
        addChip(ChipType.whiteChip3);
        addChip(ChipType.whiteChip2);
        addChip(ChipType.whiteChip2);
        for (int i = 0; i < 4; i++){
            addChip(ChipType.whiteChip1);
        }
    }

    public void shuffle(){
        Collections.shuffle(this.chips);
    }

    public void printBagWithoutWhiteChip(){
        for (Chip c : chips){
            if (!c.getColor().equalsIgnoreCase("white")){
                System.out.println(c);
            }
        }
    }

}
