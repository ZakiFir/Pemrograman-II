package Praktikum5;
public class Rectangle extends Shape{
    private final Double length;
    private final Double width;

    public Rectangle(Double l,Double w){
        super("Rectangle");
        length = l;
        width = w;
    }

    public Double area(){return length*width;}
    public String toString(){return super.toString() + " of length " + length + " and width " + width;}
}
