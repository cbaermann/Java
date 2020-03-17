import java.lang.Math;
public class Pythagorean{
    public String Hypotenuse(int A, int B){
        double squareA = A * A;
        double squareB = B * B;
        double hypot = Math.sqrt(squareA + squareB);
        return "The hypotenuse is " + hypot;
    }
}


