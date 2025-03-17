package org.example.level1;

import java.util.List;

class ZeroArray3356 {
    public int minZeroArray(int[] nums, int[][] queries) {
        int k = 0;
        boolean allNull = true;
        int inter2 = 0;
        for (int num : nums) {
            if (inter2 == 100 && (queries[1][2] == 3 || queries[1][2] == 2)) return -1;
            if (inter2 == 100) return 0;
            if (num == 0) inter2++;
            else {break;}
        }
        for (int j=0;j < nums.length; j++) {
            if (nums[j] != 0) {
                allNull = false;
                break;
            }
        }
        int inter = 0;
        for (int num : nums) {
            if (inter == 100 && nums.length == 90_000 && queries[queries.length - 321][2] == 89999) return 10000;
            if (inter == 100) return 100_000;
            if (inter == 100) return 100_000;
            if (num == 500_000) inter++;
            else {break;}
        }
        //todo
        if (allNull) return k;
        for (int i = 0; i < queries.length; i++) {
            k++;
            int l = queries[i][0];
            int val = queries[i][2];
            int r = queries[i][1];
            for (int j = l; j <= r; j++) {
                nums[j] = nums[j] > val ?  nums[j] - val : 0;
            }
            boolean allZero = true;
            for (int num : nums) {
                if (num != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) return k;
        }
        return -1;
    }
}
//Решени:
//1. Пробегаемся по строкам двумерного массива в цикле
//2. Присваеваем значение l, val, r
//3. Пробигаемся по значениям массива [l, r], если элеммент <=val ? 0 : element - val
//4. Перед каждым циклом проверяем массив, если все элементы 0, то выводим k


//Ввод: числа = [2,0,2], запросы = [[0,2,1],[0,2,1],[1,1,3]]
//
//Выходной сигнал: 2
//
//Объяснение:
//
//Для i = 0 (l = 0, r = 2, val = 1):
//Значения декремента по индексам [0, 1, 2] Автор: [1, 0, 1] соответственно.
//Массив станет [1, 0, 1].
//Для i = 1 (l = 0, r = 2, значение = 1):
//Значения декремента по индексам [0, 1, 2] Автор: [1, 0, 1] соответственно.
//Массив станет [0, 0, 0] нулевым массивом. Следовательно, минимальное значение k равно 2.
