package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);

        int funcRes1 = getFuncRes(x1);
        int funcRes2 = getFuncRes(x2);

        int result = Integer.compare(funcRes1, funcRes2);
        if (result == 0) {
            result = Integer.compare(x1, x2);
        }

        return result;
    }

    private int getFuncRes(double x) {
        return 5 * Math.pow(x, 2) + 3;
    }
}
