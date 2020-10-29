package controller;

import data.AvailableChips;
import data.ChipSets;
import data.ChipWithCost;
import data.StateData;
import org.javatuples.Pair;
import pojo.Chip;

import java.util.List;

public class BuyController {

    public static boolean checkIfAvailable(AvailableChips availableChips, ChipWithCost chip){
        if (availableChips.getAvailableChipsToBuy().contains(chip.getChip())){
            return true;
        }else{
            return false;
        }
    }

    private static boolean canBuyWholeShoppingList(AvailableChips availableChips, List<ChipWithCost> shoppingList){
        for (ChipWithCost c : shoppingList){
            if (!checkIfAvailable(availableChips, c)){
                return false;
            }
        }
        return true;
    }

    public static boolean buyShoppingList(AvailableChips availableChips, List<ChipWithCost> shoppingList, StateData stateData){
        if (canBuyWholeShoppingList(availableChips, shoppingList)){
            for (ChipWithCost c : shoppingList){
                stateData.getBag().addChipWithoutShuffle(c.getChip());
            }

            return true;
        }else{
            return false;
        }
    }
}
