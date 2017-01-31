import java.util.Scanner;

public class Tip0 {
  public static void main(String[] args) {
    //Cassie Schaaf, SD1, January 31
    //Calculate tip, compute gratuity and total
    double gratuity;
    double subtotal;
    double total;
    double tip;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the subtotal: ");

    subtotal = input.nextDouble();

    System.out.println("Enter the gratuity rate: ");

    gratuity = input.nextDouble();

    tip = subtotal * (gratuity/100);
    total = subtotal + tip;

    System.out.println("The gratuity is $" + tip + " and total is $" + total);
  }
}
