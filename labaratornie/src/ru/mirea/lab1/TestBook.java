package ru.mirea.lab1;
import java.lang.*;
public class TestBook {
        public static void main(String[] args) {

            Book b1 = new Book("Erih Maria Remark", 17);
            Book b2 = new Book("Sara Dzio", 23);
            Book b3 = new Book("Jojo Moes", 19);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            b1.intoSalePrice();
            b2.intoSalePrice();
            b3.intoSalePrice();

        }
    }
