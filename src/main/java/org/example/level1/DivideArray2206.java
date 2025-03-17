package org.example.level1;

import java.util.*;

public class DivideArray2206 {
    public boolean divideArray(int[] nums) {
        int n = nums.length /2;
        Set count = new HashSet();
        int[] copy = new int[501];
        for (int num : nums) {
            copy[num] ++;
            count.add(num);
        }
        for (int num : copy) {
            if (num!=0 && num%2!=0)
                return false;
        }
        return true;

    }
}
