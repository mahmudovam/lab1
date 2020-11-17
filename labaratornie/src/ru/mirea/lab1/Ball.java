package ru.mirea.lab1;

public class Ball {
    private String color ;
    private int radius;

    public Ball (String c,int r)
    {
        color  = c;
        radius = r;
    }
    public Ball(String c){
        color = c;
        radius = 0;

    }
    public Ball (){
    color = "different";
        radius = 0;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void intoRadius(){
        System.out.println( color +" ball with square  "+ 4*3.14*Math.pow(radius,3));
    }
}
