/* Created by Samuel Lopez, Howard Cheng, and Thuy-Quynh Vu
   AP CS, Period 2
   Final Project: Piccle
   Description: This program provides the user a randomly generated image and allows them to guess what word is associated with it. 
*/

import java.util.*;  
import java.io.*;  
import java.awt.*;

public class piccle{
    public static void main(String[] args)
      throws FileNotFoundException {
      Scanner s = new Scanner(System.in); //Reads user word guesses
      ImagesArray images = new ImagesArray();
      
      System.out.print("Welcome to Piccle! To start a new game, press P. ");
      String game = s.next();
      System.out.println();
      
      while(game.equals("P") || game.equals("p")) { //Cycles through games until user no longer wishes to play
         PicclePic current = new PicclePic(images.randomize());
         guesser(current, s);
         System.out.print("To play again, press P. To quit, type Q. ");
         game = s.next();
      }
      
      System.out.println("Thank you for playing!");
    }
    
   //Main guessing function
   public static void guesser(PicclePic current, Scanner s)
      throws FileNotFoundException {
      RandomQuad q = new RandomQuad(current); //Helps determine random sequencing in which the image appears
      String word = current.getName();
      q.showBlank();
      System.out.println("The word is " + word.length() + " letters long.");

      String guess = s.next().toLowerCase();
      String piccle = Guess.result(word, guess);
      System.out.println(piccle);
      int turn = 1;
      
      while(!(guess.toUpperCase().equals(piccle)) && turn < 6) { //Cycles through guesses
         q.randomizeQ(turn);
         guess = s.next().toLowerCase();
         piccle = Guess.result(word, guess);
         System.out.println(piccle);
         turn++;
      }
      
      if(guess.toUpperCase().equals(piccle)) { //If user guessed correctly under 6 tries, prints winning message
         System.out.println();
         printWinner();
         System.out.println();
         System.out.println("You guessed the word in " + turn + " tries!");
         System.out.println();
      } 
      else if(turn >= 6) { //If user failed to guess correctly under 6 tries, ends game
         System.out.println("You lose! The word was " + word + ".");
         System.out.println();
      }
   }
   
   
   //Prints winner message if user guesses word correctly
   public static void printWinner() {
      System.out.println(" /$$      /$$ /$$$$$$ /$$   /$$ /$$   /$$ /$$$$$$$$ /$$$$$$$  /$$");
      System.out.println("| $$  /$ | $$|_  $$_/| $$$ | $$| $$$ | $$| $$_____/| $$__  $$| $$");
      System.out.println("| $$ /$$$| $$  | $$  | $$$$| $$| $$$$| $$| $$      | $$  \\ $$| $$");
      System.out.println("| $$/$$ $$ $$  | $$  | $$ $$ $$| $$ $$ $$| $$$$$   | $$$$$$$/| $$");
      System.out.println("| $$$$_  $$$$  | $$  | $$  $$$$| $$  $$$$| $$__/   | $$__  $$|__/");
      System.out.println("| $$$/ \\  $$$  | $$  | $$\\  $$$| $$\\  $$$| $$      | $$  \\ $$    ");
      System.out.println("| $$/   \\  $$ /$$$$$$| $$ \\  $$| $$ \\  $$| $$$$$$$$| $$  | $$ /$$");
      System.out.println("|__/     \\__/|______/|__/  \\__/|__/  \\__/|________/|__/  |__/|__/");
   }
}