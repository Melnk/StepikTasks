package org.example.level1;

public class FruitOOP {
    void checkFruitCount(Object[] objects) {
        int b=0,a=0;
        for (Object fruit : objects) {
            if (fruit instanceof Apple) a++;
            if (fruit instanceof Banana) b++;
        }
        System.out.println("banana="+b+", apple="+a);
    }

    interface Apple {

    }

    interface Banana {

    }
}
