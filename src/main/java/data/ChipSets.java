package data;

import org.javatuples.Pair;
import pojo.Chip;
import pojo.ChipType;

import java.util.Arrays;
import java.util.List;

public class ChipSets {

    public static final List<ChipWithCost> set1 =
            Arrays.asList(new ChipWithCost(ChipType.orangeChip, 3), new ChipWithCost(ChipType.blackChip,10),
                    new ChipWithCost(ChipType.greenChip1, 6), new ChipWithCost(ChipType.greenChip2, 11),
                    new ChipWithCost(ChipType.greenChip4, 21), new ChipWithCost(ChipType.redChip1, 6),
                    new ChipWithCost(ChipType.redChip2, 10), new ChipWithCost(ChipType.redChip4, 16),
                    new ChipWithCost(ChipType.blueChip1, 5), new ChipWithCost(ChipType.blueChip2, 10),
                    new ChipWithCost(ChipType.blueChip4, 19));

    public static final List<ChipWithCost> set1yellow = Arrays.asList(new ChipWithCost(ChipType.yellowChip1, 8), new ChipWithCost(ChipType.yellowChip2,12),
            new ChipWithCost(ChipType.yellowChip4, 18));
    public static final ChipWithCost set1purple = new ChipWithCost(ChipType.purpleChip, 9);



}
