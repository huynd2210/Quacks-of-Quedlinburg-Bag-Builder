package algorithm;

import com.google.common.collect.Lists;
import pojo.Chip;

import java.util.List;

public class CartesianProduct {
    public static List<List<Chip>> multiply(List<List<Chip>> lists){
        return Lists.cartesianProduct(lists);
    }
}
