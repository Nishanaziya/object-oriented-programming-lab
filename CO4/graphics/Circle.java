package graphics;

public class Circle implements Shape {

    private double radius;

    public Circle( double radius){
        this.radius= radius;
    }

    public double area(){
        return(3.14*this.radius*radius);
    }
}