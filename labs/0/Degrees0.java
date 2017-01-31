import java.util.Scanner;

public class Degrees0 {
  public static void main(String[] args){
  //Cassie Schaaf, SD1, January 31
  //Convert celcius to farenheit

  //declare variables
  double celsius;
  double fahrenheit;

  System.out.println("Enter a degree in Celsius: ");
  Scanner input = new Scanner(System.in);
  celsius = input.nextDouble();
  fahrenheit = (1.8 * celsius) + 32;
  System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}
