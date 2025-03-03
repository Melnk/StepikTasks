package org.example.level1;

public class Fibonachi {
    public void fibonachiDecision(long n){
        if (n == 0) System.out.println(0);
        else if (n == 1) System.out.println(1);
        else {
            long lastPrevious = 0;
            long previous = 1;
            long show = 0;
            for (int i = 2; i <= n; i++){
                show = lastPrevious + previous;
                lastPrevious = previous;
                previous = show;
            }
            System.out.println(show);
        }
    }

    public void fibonachiDecisionSecond(long n) {
        long x = 0, y = 1;
        for (int i = 0; i < n; i++){
            long t = y;
            y = x + y;
            x = t;
        }
        System.out.println(x);
    }
}
