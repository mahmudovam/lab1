package ru.mirea.lab1;

public class Book
{
    private String name;
    private int price;

   public Book (String n,int p)
    {
        name = n;
        price = p;
    }
    public Book(String n){
        name = n;
        price = 0;

    }
    public Book(){
        name = "Books";
        price = 0;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String toString(){
        return this.name+", price "+this.price ;
    }
    public void intoSalePrice(){
        System.out.println("the book" + name +" with a 10% discount costs  "+price*90/100+" $ ");
    }}
