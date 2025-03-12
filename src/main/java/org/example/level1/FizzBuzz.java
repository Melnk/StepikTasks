package org.example.level1;

public class FizzBuzz {
    public void decisionFirst(int i){
        System.out.println(i % 15 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" :
                i % 3 == 0 ? "Fizz" : i);
    }

    public void decisionSecond(int i){
        if (i % 3 == 0) System.out.print("Fizz");
        if (i % 5 == 0) System.out.print("Buzz");
        if (i % 3 != 0 && i % 5 != 0) System.out.println(i);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.decisionFirst(3);
        fizzBuzz.decisionFirst(5);
        fizzBuzz.decisionFirst(30);
        fizzBuzz.decisionFirst(43);
        fizzBuzz.decisionSecond(35);
    }
}
