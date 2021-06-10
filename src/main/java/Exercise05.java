import java.lang.Math;

public class Exercise05 {
    public String solveQuadraticEquation(int a, int b, int c){
        double delta = b*b - 4*a*c;

        if(delta < 0){
            return "no solution";
        }
        else if( delta == 0){
            return "x1 = x2 = " + -b/(2*a);
        }
        else{
            delta = Math.sqrt(delta);
            return "x1 = " + (-b + delta) / (2*a) + ", x2 = " + (-b - delta) / (2*a);
        }
    }
}
