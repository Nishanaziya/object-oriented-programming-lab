package graphics;

public class Square implements Shape{

    public double side;

    public Square(double side){

        this.side = side;
    }

    public double area(){
        return(this.side*this.side);
    }
}