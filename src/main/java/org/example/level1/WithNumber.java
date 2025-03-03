package org.example.level1;

public class WithNumber {
    void checkSortArrayLength(int[] array) {
        int count = -1, maxCount = 0, previous = -1;
        for (int a : array) {
            if (previous <= a){
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            previous = a;
            maxCount = Math.max(count, maxCount);
        }
        System.out.println(maxCount+1);
    }

    public static void main(String[] args) {
        WithNumber withNumber = new WithNumber();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        withNumber.checkSortArrayLength(array);
    }
}


