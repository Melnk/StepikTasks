package org.example.level1;

import java.util.*;
//Решение 1 - полностью пробежаться по строке всеми способами
public class Number1358 {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // Массив для подсчета количества 'a', 'b', 'c'
        int left = 0; // Левый указатель
        int result = 0; // Результат

        //Т.е. мы двигаем правый указатель, пока не найдем все 3 элемента
        //После чего прибавляяем 1 + (кол-во цифр справа)
        //Двигаем левый указатель

        for (int right = 0; right < s.length(); right++) {
            // Увеличиваем счетчик для текущего символа
            char currentChar = s.charAt(right);
            if (currentChar == 'a') count[0]++;
            else if (currentChar == 'b') count[1]++;
            else if (currentChar == 'c') count[2]++;

            // Пока все три символа присутствуют в текущем окне
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // Все подстроки, начинающиеся с left и заканчивающиеся на right или дальше, удовлетворяют условию
                result += s.length() - right;

                // Уменьшаем счетчик для символа, на который указывает left
                char leftChar = s.charAt(left);
                if (leftChar == 'a') count[0]--;
                else if (leftChar == 'b') count[1]--;
                else if (leftChar == 'c') count[2]--;

                // Двигаем левый указатель
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Number1358 number1358 = new Number1358();
        System.out.println(number1358.numberOfSubstrings("abcabc")); // Вывод: 10
    }
}