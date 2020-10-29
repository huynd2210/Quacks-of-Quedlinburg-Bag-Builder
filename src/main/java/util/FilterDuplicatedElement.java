package util;

import algorithm.perfectsum.ObjectWithInteger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicatedElement {
    public static List<List<ObjectWithInteger>> filter(List<List<ObjectWithInteger>> list){
        Set<List<ObjectWithInteger>> set = new HashSet<>();
        list.forEach(i -> set.add(new ArrayList<>(i)));
        List<List<ObjectWithInteger>> result = new ArrayList<>();
        set.forEach(i -> result.add(new ArrayList<>(i)));
        return result;
    }
}
