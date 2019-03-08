import javax.script.ScriptException;

public class Calculator {
    public static void mainn(String[] args) throws ScriptException {


        //calculateExpression("1+2");

    }

    public String calculateExpression(String expression) throws ArithmeticException {

        int operatorPos=0;
        double leftNumber;
        double rightNumber;
        String operation;
        String res="";

        if ((expression.length() == 0) || (expression.length() >= 100)) {
            return "error";
        } else if (!expression.matches("^[0-9\\+\\-\\/\\*]*$")) {
            return "error";
        } else if (!expression.matches("^.*[\\+\\-\\/\\*]*$")) {
            return "error";
        }

        if(expression.indexOf("+")>0){
            operatorPos = expression.indexOf("+");
            leftNumber=Double.parseDouble(expression.substring(0,operatorPos));
            rightNumber=Double.parseDouble(expression.substring(operatorPos+1,expression.length()));
            return Double.toString(this.add(leftNumber,rightNumber));
        }
        if(expression.indexOf("-")>0){
            operatorPos = expression.indexOf("-");
            leftNumber=Double.parseDouble(expression.substring(0,operatorPos));
            rightNumber=Double.parseDouble(expression.substring(operatorPos+1,expression.length()));
            return Double.toString(this.sub(leftNumber,rightNumber));
        }
        if(expression.indexOf("*")>0){
            operatorPos = expression.indexOf("*");
            leftNumber=Double.parseDouble(expression.substring(0,operatorPos));
            rightNumber=Double.parseDouble(expression.substring(operatorPos+1,expression.length()));
            return Double.toString(this.mult(leftNumber,rightNumber));
        }
        if(expression.indexOf("/")>0){
            operatorPos = expression.indexOf("/");
            leftNumber=Double.parseDouble(expression.substring(0,operatorPos));
            rightNumber=Double.parseDouble(expression.substring(operatorPos+1,expression.length()));
            return Double.toString(this.divide(leftNumber,rightNumber));
        }
        return "error";
    }





    public double add(double d1, double d2) {
        return d1 + d2;
    }

    public double sub(double d1, double d2) {
        return d1 - d2;
    }

    public double divide(double d1, double d2) throws ArithmeticException {
        if (d2 != 0) {
            return d1 / d2;
        } else {
            throw new ArithmeticException();
        }
    }

    public double mult(double d1, double d2){
        return d1*d2;
    }
}