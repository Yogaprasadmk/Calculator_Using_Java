import java.util.Scanner;
public class Calculator{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scan.nextInt();
        System.out.print("Enter b:");
        int b = scan.nextInt();
        System.out.print("Enter the characters + - * / % ");
        char operator;
        operator = scan.next().charAt(0);
        switch(operator){
            case '+':
                System.out.print(a + " + " + b + " = " + a+b);
                break;
            case '-':           
                System.out.print(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.print(a + " * " + b + " = " + a*b);
                break;
            case '/':
                System.out.print(a + " / " + b + " = " + a/b);
                break;
            case '%':
                System.out.print(a + " % " + b + " = " + a%b);
                break;
            default:
                System.out.print("the entered character is not valid");
        }
    }
}