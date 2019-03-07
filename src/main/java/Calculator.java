import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args){

        /*String expression;
        Scanner s = new Scanner(System.in);*/

        /*do while(true){
            System.out.println("Ange uttryck för beräkning:");
            expression=s.nextLine();
        };*/

        calculateExpression("4*4*5");

    }


    public static String calculateExpression(String expression){
        if(expression.length()==0) return "error";
        Pattern ptn = Pattern.compile("(\\+|\\-|\\*|\\/)");
        String[] parts = ptn.split(expression);

        /*for(String p:parts){
            System.out.println(p);
        }*/

        return "";
    }
    public double add(double d1, double d2){
        return d1+d2;
    }
    public double sub(double d1, double d2){
        return d1-d2;
    }
    public double divide(double d1, double d2) throws ArithmeticException{
        if(d2!=0){
            return d1/d2;
        } else {
            throw new ArithmeticException();
        }
    }
}
