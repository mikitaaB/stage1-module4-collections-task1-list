package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for (Integer listEl : sourceList) {
            if (listEl % 2 == 0) {
                res.addLast(listEl);
            } else {
                res.addFirst(listEl);
            }
        }
        return res;
    }
}
