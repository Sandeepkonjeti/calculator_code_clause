package calculator1;


import java.util.ArrayList;
import java.util.Scanner;

public class cal {
    public static void main(String args[]){
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<Character> operators = new ArrayList<Character>();
         
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.println("\nEnter a number: \n");
                numbers.add(scanner.nextDouble());
                System.out.println("\nEnter an operation sign such as, '+', '-', '*', or '/', '=': \n");
                char operator = scanner.next().charAt(0);
                if (operator == '=')
                    break;
                operators.add(operator);
            } while (true);
        } finally {
            scanner.close();
        }
        
        Double answer = numbers.remove(0);
        String resultText = "" + answer;
        
        for (int i=0; i<operators.size(); ++i) {
            char operator = operators.get(i);
            
            Double number = numbers.get(i);
            
            switch(operator) {

                case '+':
                    answer += number;
                    break;
    
                case '-':
                    answer -= number;
                    break;
    
                case '*':
                    answer *= number;
                    break;
    
                case '/':
                    answer /= number;
                    break;
    
                default:
                    System.out.println("Wrong choice for operator. ");
                    break;
            }
            resultText += " " + operator + " " + number;
        }
        
        System.out.println("\n" + resultText + " = " + answer);
    }
}