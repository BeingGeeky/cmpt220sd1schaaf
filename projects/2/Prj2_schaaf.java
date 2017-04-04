/*
file: Prj2_schaaf.java
author: Cassie Schaaf
course: CMPT 220
assignment: Project 2
due date: May 2, 2017
version: 1.0

This file contains the code to clean heart rate data
*/

import java.util.Scanner;

public class Prj2_schaaf {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /* This is the code for the Art Inspiration app. The app:
    - displays a drop-down list of art subject, techniques, and mediums
    - User selects n options from the lists
    - Once selected, the user click "Inspire Me" button
    - Button launches a random generator
    - The app then displays n terms or phrases within the selected lists

   For example,
     * user drops down the list and selects MEDIUM & ANIMAL
     * User clicks INSPIRE ME
     * App displays "Watercolor Rabbit"
     * If user clicks INSPIRE ME again, app displays "Fingerpaint Dolphin"

   Stage 2:
     - user create an "account" of name, username, password, & details
     - save favorite ideas
 */
    System.out.println("Would you like a random idea or would you like to select you ideas? Enter 0 for random or 1 to make a selection.");
    int select = input.nextInt();
    int list = 0;
    int idea = 0;
    int item = 0;
    String result;

	//Selections 
	String[][] ideas = {
	      		/*lists                    1         2            3              4             5 */ 
	      		/*0 Mediums*/            {"Pastel",  "Oil",       "Watercolor",  "Acrylic",    "Colored Pencils"},
	            /*1 Jungle*/             {"Canopy",  "Monkeys",   "Snakes",      "Jaguar",     "Insects"},
	      		/*2 Lanscape*/           {"Ocean",   "Sunset",    "Forest",      "Mountains",  "Beach"},
	      		/*3 Forest*/             {"Tree",    "Stream",    "Leaves",      "Creatures",  "Deer"},
	      		/*4 Country*/            {"Ireland", "Egypt",     "China",       "India",      "Russia"},
	      		/*5 Insect*/             {"Spider",  "Centipede", "Beetle",      "Fly",        "Roach"},
	      		/*6 Woodland Creatures*/ {"Squirrel","Hedgehog",  "Rabbit",      "Deer",       "Bear"},
	      		};
    
    if (select==0){
      list = (int)Math.random();
      item = (int)Math.random();  
      
      System.out.println ("Try this: " + randomIdeas(list, item));
    } else if (select==1){
      System.out.println("Enter a number between to select a list:\n 0 for Medium");
      list = input.nextInt();
      System.out.println("Enter a number to select an item:");
      item = input.nextInt();
      System.out.println("Try this: "+ ideas[list][item]);
    } else {
      System.out.println("Thanks for playing!");
    }

  }

  public static String[] randomIdeas(int[] list, int [] item) {
      result= ideas[list][item];

    return result;  
   }
  
 


}