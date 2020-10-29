package simulator;

import controller.ActionController;
import data.StateData;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Simulator {

    public static int mode(List<Integer> a,int n) {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (a.get(j) == a.get(i))
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = a.get(i);
            }
        }
        return maxValue;
    }

    public static int simulateTillExplode(StateData stateData){
        StateData nextState = new StateData(stateData);
        while(!nextState.isExploded()){
            nextState = ActionController.pullChip(nextState);
        }
        return nextState.getShopValueFromPot();
    }
    //find best bag setup given money

    public static int getStatisticMode(StateData stateData, int numberOfSimulations){
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < numberOfSimulations; i++){
            int tmp = simulateTillExplode(stateData);
            data.add(tmp);
        }
        return mode(data, data.size());
    }

    public static void getStatistic(StateData stateData, int numberOFSimulations){
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < numberOFSimulations; i++){
            int tmp = simulateTillExplode(stateData);
            data.add(tmp);
        }



        System.out.println("mode: " + mode(data, data.size()));
        IntSummaryStatistics average = new IntSummaryStatistics();

        for (Integer i : data){
            average.accept(i);
        }
        System.out.println("average: " + average.getAverage());
    }

}
