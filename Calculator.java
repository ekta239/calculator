import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("####Calculator####");
System.out.println("u can perform + - * / ");
System.out.print("Please Enter the opration:");
char o=sc.next().charAt(0);
System.out.print("Enter the first number: ");
int num1=sc.nextInt();
System.out.print("Enter the second number: ");
int num2= sc.nextInt();
switch(o){
case '+':
System.out.println(num1+num2);
case '-':
System.out.println(num1-num2);
case '*':
System.out.println(num1*num2);
default:
System.out.println("invalid input");
}
}
}