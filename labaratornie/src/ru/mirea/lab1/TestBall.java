package ru.mirea.lab1;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball ("White", 3);
        Ball b2 = new Ball("Red", 2);
        Ball b3 = new Ball("Blue", 4);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.intoRadius();
        b2.intoRadius();
        b3.intoRadius();

    }
}

