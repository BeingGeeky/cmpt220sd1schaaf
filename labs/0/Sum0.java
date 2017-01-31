import java.util.Scanner;

public class Sum0  {
  public static void main(String[] args){
    //Cassie Schaaf, SD1, January 31
    //Read integer, add digits

    int number;
    int numberOne;
    int numberTwo;
    int numberThree;
    int digitOne;
    int digitTwo;
    int digitThree;
    int total;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number between 0 and 1000: ");
    number = input.nextInt();

    digitOne = number % 10;
    numberOne = number / 10;
    digitTwo = numberOne % 10;
    numberTwo = numberOne / 10;
    digitThree = numberTwo % 10;
    numberThree = numberTwo / 10;
    total = digitOne + digitTwo + digitThree;

    System.out.println("The sum of the digits is: " + total);
  }
}
