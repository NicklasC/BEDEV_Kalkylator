import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        String expression;
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Ange uttryck för beräkning:");

            try {
                expression = s.nextLine();
                String res = calculator.calculateExpression(expression);
                System.out.println("Summan blev:" + res);
            } catch (ArithmeticException e) {
                System.out.println("Division med 0 ej tillåten.");
            }

        }
    }
}