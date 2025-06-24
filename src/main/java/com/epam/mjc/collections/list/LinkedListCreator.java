package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
    List<String> res = ArrayList<>();
    for (int i = 0; i < sourceList.size(); i++) {
        int listEl = sourceList.get(i);
        if (listEl % 2 == 0) {
            sourceList.add(0, listEl);
        } else {
            sourceList.add(listEl);
        }
    }
    return res;
    }
}
