import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args){
        double num1, num2, average;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number :");
        num1 = scan.nextDouble();
        System.out.print("Enter second number :");
        num2 = scan.nextDouble();
        average = (num1 + num2) /2;
        System.out.println("The average of the two numbers is "+average);
    }
}
