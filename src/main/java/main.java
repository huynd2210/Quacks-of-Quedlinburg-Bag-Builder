import algorithm.BagOptimizer;
import algorithm.CartesianProduct;
import com.google.common.collect.Lists;
import controller.ActionController;
import data.AvailableChips;
import data.StateData;
import pojo.Bag;
import simulator.Simulator;
import util.FilterDuplicatedElement;

import javax.swing.plaf.nimbus.State;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {


    public static void main(String[] args) {
//        StateData sd = new StateData();
//        System.out.println(sd);
//        while(!sd.isExploded()){
//            sd = ActionController.pullChip(sd);
//            System.out.println(sd);
//        }
//        BagOptimizer.getShoppingLists(16);
//        Simulator.getStatistic(new StateData(), 20000);

        StateData stateData = new StateData();
        stateData.getBag().printBagWithoutWhiteChip();
        stateData = BagOptimizer.optimizeBagForNextRound(stateData, 8, 1);
        System.out.println("-----------------");
        stateData.getBag().printBagWithoutWhiteChip();
    }
}
