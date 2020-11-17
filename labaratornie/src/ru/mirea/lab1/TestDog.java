package ru.mirea.lab1;
import java.lang.*;
public class TestDog {
        public static void main(String[] args) {

            Dog d1 = new Dog("Pluto", 2);
            Dog d2 = new Dog("Hatiko", 7);
            Dog d3 = new Dog("Boby", 1);

            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);
            d1.intoHumanAge();
            d2.intoHumanAge();
            d3.intoHumanAge();

        }
    }



