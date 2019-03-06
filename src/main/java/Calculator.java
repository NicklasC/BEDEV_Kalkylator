public class Calculator {
    public static void main(String[] args){
        System.out.println("Hepp");

    }


    public String calculateExpression(String expression){
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
