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
import java.util.ArrayList;

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
    
//display directions
    System.out.println("Would you like a random idea or would you like to select you ideas? Enter 0 for random or 1 to make a selection.");
//make selection 
//APP: would be a button
    int select = input.nextInt();
    int list = 0;
    int idea = 0;
    int item = 0;
    String result;
//Set up selection arrays 
    String[][] ideas = {                   /*items*/
      		/*lists                    1                  2                     3                4                5 */ 
      		/*0 Mediums*/            {"Pastel",           "Oil",                "Watercolor",    "Acrylic",                 "Colored Pencils"},
      /*1 Jungle*/             {"Canopy",           "Monkeys",            "Snakes",        "Jaguar",                  "Insects"},
      		/*2 Landscape*/          {"Ocean",            "Sunset",             "Forest",        "Mountains",               "Beach"},
      		/*3 Forest*/             {"Tree",             "Stream",             "Leaves",        "Creatures",               "Deer"},
      		/*4 Country*/            {"Ireland",          "Egypt",              "China",         "India",                   "Russia"},
      		/*5 Insect*/             {"Spider",           "Centipede",          "Beetle",        "Fly",                     "Roach"},
      		/*6 Woodland Creatures*/ {"Squirrel",         "Hedgehog",           "Rabbit",        "Deer",                    "Bear"},
      		/*7 Big cats*/           {"Puma",             "Mountain Lion",      "Lion",          "Cougar",                  "Jaguar"},
      		/*8 Snakes*/             {"Cobra",            "Garter Snake",       "Anaconda",      "Rattle Snake",            "Green Tree Snake"},
      		/*9 Art Movements1*/     {"Impressionist",    "Abstract",           "Surrealist",    "Cubism",                  "Realism"},
      		/*10 Primary Colors*/    {"Blue",             "Red",                "Yellow",        "Green",                   "Orange"},
      		/*11 Texture*/           {"Fluffy",           "Brick",              "Linen",         "Satin",                   "Burlap"},
      		/*12 Fairy Tales*/       {"Snow White",       "Red Riding Hood",    "Cinderella",    "Pinocchio",               "Sleeping Beauty"},
      		/*13 Witches*/           {"Witches",          "Moonlight",          "Black Cat",     "Pentagram",               "Rule of Three"},
      		/*14 Fairies*/           {"Winter Fairy",     "Summer Fairy",       "Spring Fairy",  "Water Fairy",             "Autumn Fairy"},
      		/*15 Romance*/           {"Lace",             "Roses",              "Champagne",     "Kisses",                  "Music"},
      /*16 World Cities*/      {"Paris",            "Prague",             "London",        "New York",                "Florence"},
      /*17 Artists*/           {"Michaelangelo",    "Picasso",            "Dali",          "Kandinsky",               "Monet"},
      /*18 Candy*/             {"Gummies",          "Chocolate",          "Licorise",      "Hard Candy",              "Bubble Gum"},
      /*19 Art Movements2*/    {"Expressionism",    "Art Deco",           "Art Nouveau",   "Arts & Crafts Movement",  "Bauhaus"},
      /*20 Art Movements3*/    {"Constructivism",   "Dada",               "Fauvism",       "Futurism",                "Minimalism"},
      /*21 Art Movements4*/    {"Pop Art",          "Post-Impressionism", "Op Art",        "Minimalism",              ""},
      };

    int ideasLength = ideas.length;

//use directions to display either a completely random idea...
//APP: 2 buttons
    //APP: button #1
    if (select==0){
      System.out.println("Would you like 1, 2, or 3 random ideas? Enter 1, 2, or 3");
      int numIdeas = input.nextInt();
      System.out.println("Make something AWESOME out of this: ");
      for (int n=0; n<numIdeas; n++){
      totallyRandom(ideas, ideasLength, item);
      }

//..or a more specific selection  
    //APP: Drop down lists, then button #2 to submit
    } else if (select==1){
       kindaRandom(ideas, ideasLength, item, list, input);
       System.out.println("\nNow go on! Git creatin'!\n");
    } else {
      System.out.println("Thanks for playing! Try again.");
    }

//display the result to the screen
//PHASE 1: COMPLETE
    
//PHASE 2
  //break idea draw into randomIdeas method and selectedIdeas method
  //Add option to front/home page to select 1-3 idea
  //If/Else statements
    //totally random or selected
      //if 1 idea, run randomIdea/selectedIdea 1 time
      //if 2 ideas, run randomIdea/selectedIdea 2 times
      //if 3 ideas, run randomIdea/selectedIdea 3 times
      //display all results at once
//PHASE 2: COMPLETE
}
  
//method to generate completely random ideas
public static void totallyRandom(String[][] array, int arrayLength, int arrayItem){  
  int randomIdea = (int)(Math.random() * arrayLength);
  arrayItem = (int)(Math.random() * array[randomIdea].length);
  System.out.print (array[randomIdea][arrayItem]+ " ");
}

//method to select from certain lists
public static void kindaRandom(String[][] array, int arrayLength, int arrayItem,int arrayList, Scanner input){
    System.out.println("Enter a number between to select a list:\n 0 Medium\n 1 Jungle\n 2 Landscape\n 3 Forest\n 4 Country\n 5 Insect\n 6 Woodland Creatures\n 7 Big cats\n 8 Snakes\n 9 Art Movements1\n 10 Primary Colors\n 11 Texture\n 12 Fairy Tales\n 13 Witches\n 14 Fairies\n 15 Romance\n 16 World Cities\n 17 Artists\n 18 Candy\n 19 Art Movements2\n 20 Art Movements3\n 21 Art Movements4");
    System.out.println("Make something AWESOME out of this: ");
    arrayList = input.nextInt();
    arrayItem = (int)(Math.random() * array[arrayList].length);
    System.out.println(array[arrayList][arrayItem]);
  }
}