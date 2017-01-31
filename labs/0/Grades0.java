import java.util.Scanner;

public class Grades0 {
  public static void main(String[] args) {
  //Cassie Schaaf, SD1, January 31

    double homework;
    double midterm;
    double project;
    double finals;
    double total;
    double homeworkPercent = 0.4;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the grade for Homework & Labs: ");
    homework = input.nextDouble();

    System.out.println("Enter the grade for Projects: ");
    project = input.nextDouble();

    System.out.println("Enter the grade for the Midterm exam: ");
    midterm = input.nextDouble();

    System.out.println("Enter the grade for the Final exam: ");
    finals = input.nextDouble();

    total = (homework * 0.4) + (project * 0.2) + (midterm * 0.2) + (finals * 0.2);

    System.out.println("Final Grade for Software Development I: " + total);
  }
}
