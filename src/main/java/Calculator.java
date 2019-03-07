import javax.script.ScriptException;

public class Calculator {
    public static void main(String[] args) throws ScriptException{

        temp();
        /*String expression;
        Scanner s = new Scanner(System.in);*/

        /*do while(true){
            System.out.println("Ange uttryck för beräkning:");
            expression=s.nextLine();
        };*/

        calculateExpression("1+2+3*2-4/2*2");

    }

    public static void temp()throws ScriptException{

    }

    public static String calculateExpression(String expression) throws ArithmeticException {
        if((expression.length()==0) || (expression.length()>=100)) {
            return "error";
        }


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
