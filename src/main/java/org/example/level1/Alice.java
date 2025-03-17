package org.example.level1;

import java.util.*;

public class Alice {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int numbers : candyType) {
            set.add(numbers);
        }
        int half = candyType.length / 2;
        if (set.size() < half) return set.size();
        return half;
    }
}
