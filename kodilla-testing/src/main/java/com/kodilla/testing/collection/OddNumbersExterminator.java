package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> numbersNew = new ArrayList<>();
        for (Integer theNumbers : numbers) {
            int modulo = theNumbers % 2;
            if (modulo == 0) {
                numbersNew.add(theNumbers);
            }
        }
        return numbersNew;
    }
}
