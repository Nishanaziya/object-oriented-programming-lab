package arithmetic;
import java.util.*;

interface Mul{
    void mltiplication(float a, float b);
}

public class Multiplication implements Mul{
    public void multiplication(float a, float b){
        System.out.println("The product of two numbers is: "+(a*b));
    }
}