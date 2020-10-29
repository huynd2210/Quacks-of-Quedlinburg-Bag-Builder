package algorithm;

import algorithm.perfectsum.ObjectWithInteger;
import algorithm.perfectsum.SubsetSumSolver;
import controller.BuyController;
import data.AvailableChips;
import data.ChipSets;
import data.ChipWithCost;
import data.StateData;
import org.javatuples.Pair;
import pojo.Bag;
import pojo.Chip;
import pojo.ChipType;
import pojo.ShoppingList;
import simulator.Simulator;
import util.FilterDuplicatedElement;

import javax.swing.plaf.nimbus.State;
import java.util.*;

public class BagOptimizer {

    private static List<ChipWithCost> getSet(int currentRound){
        List<ChipWithCost> result = new ArrayList<>(ChipSets.set1);
        if (currentRound == 2){
            result.addAll(ChipSets.set1yellow);
        }
        if (currentRound == 3){
            result.addAll(ChipSets.set1yellow);
            result.add(ChipSets.set1purple);
        }
        return result;
    }

    public static List<List<ObjectWithInteger>> getShoppingLists(int budget, int currentRound){
        System.out.println("budget: " + budget);

        List<ObjectWithInteger> chipList = new ArrayList<>(getSet(currentRound));
        List<List<ObjectWithInteger>> allPossibleBuyingOption = new ArrayList<>();
        for (int i = budget; i >= budget - 2; i--){
            SubsetSumSolver subsetSumSolver = new SubsetSumSolver(chipList, i);
            allPossibleBuyingOption.addAll(new ArrayList<>(subsetSumSolver.getSolution()));
        }
        FilterDuplicatedElement.filter(allPossibleBuyingOption);
        return allPossibleBuyingOption;
    }

    private static List<ChipWithCost> cast(List<ObjectWithInteger> list){
        List<ChipWithCost> tmp = new ArrayList<>();
        for (ObjectWithInteger object : list){
            tmp.add((ChipWithCost) object);
        }
        return tmp;
    }

    private static List<ObjectWithInteger> findBestShoppingList(List<Pair<List<ObjectWithInteger>, Integer>> shoppingListResults){
        if (shoppingListResults.isEmpty()){
            return new ArrayList<>();
        }

        int max = 0;
        int returnIndex = 0;
        for (int i = 0; i < shoppingListResults.size(); i++){
            if (shoppingListResults.get(i).getValue1() > max){
                max = shoppingListResults.get(i).getValue1();
                returnIndex = i;
            }
        }
        return shoppingListResults.get(returnIndex).getValue0();
    }

    public static StateData optimizeBagForNextRound(StateData stateData, int budget, int currentRound){
        AvailableChips availableChips = new AvailableChips();
        List<List<ObjectWithInteger>> shoppingList = getShoppingLists(budget, currentRound);

        StateData copy = new StateData(stateData);
        List<Pair<List<ObjectWithInteger>, Integer>> shoppingListResult = new ArrayList<>();

        for (List<ObjectWithInteger> c : shoppingList){
            if (BuyController.buyShoppingList(availableChips, cast(c), copy)){
                shoppingListResult.add(new Pair<>(c, Simulator.getStatisticMode(new StateData(copy), 10000)));
                copy = new StateData(stateData);
            }else{
                copy = new StateData(stateData);
            }
        }

        List<ObjectWithInteger> bestShoppingList = findBestShoppingList(shoppingListResult);
        StateData resultState = new StateData(stateData);
        for (int i = 0; i < bestShoppingList.size(); i++){
            ChipWithCost chip = (ChipWithCost)bestShoppingList.get(i);
            resultState.getBag().addChipWithoutShuffle(chip.getChip());
        }
        return resultState;
    }
}
