import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    

    System.out.println("Enter two inputs : ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int sum = num1 + num2;

    System.out.println("The sum is -> "+sum);

    scanner.close();
  }
  
}