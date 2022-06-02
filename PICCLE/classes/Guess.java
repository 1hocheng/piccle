/* Guessing object that takes a guess and compares it to a user-inputted word. Provides a comparison by showing an underscore
   if the letter does not exist in the word, a lowercase if the letter exists in the word but is in the incorrect placement,
   and uppercase if the letter exists and is in the right placement. Works for any word length.  
*/

import java.util.*;  
import java.io.*;  
import java.awt.*;

public class Guess {
   
   public static String result(String word, String guess) {
      int length = word.length();
      
      if (guess.length() < word.length()) {
         int i = word.length() - guess.length();
         for (int j = 0; j < i; j++) {
            guess += "_";
         }
      }
      
      String result = "";
      char[] resultarray = new char[length];
      char[] guessarray = new char[length];
      char[] wordarray = new char[length];
      
      for (int i = 0; i < length; i++) {
         guessarray[i] = guess.charAt(i);  
         wordarray[i] = word.charAt(i);
      }
      
      for (int i = 0; i < length; i++) {
         char currresult = '0';
         
         if (guessarray[i] == wordarray[i]) {
            currresult = guessarray[i];
            currresult = (char)(currresult - 32);
            resultarray[i] = currresult;
            guessarray[i] = '0';
            wordarray[i] = '0';
         }             
      }
      
      for (int i = 0; i < length; i++) {
         guess = "";
         word = "";
         
         for(int j = 0; j < length; j++) {
            guess += guessarray[j];  
            word += wordarray[j];
         }
         
         if (word.indexOf(guess.charAt(i)) != -1 && guess.charAt(i) != '0') {
            resultarray[i] = guess.charAt(i);
            guessarray[i] = '0';
            wordarray[word.indexOf(guess.charAt(i))] = '0';
         }
      }
      
      for (int i = 0; i < length; i++) {
         if (guessarray[i] != '0') {
            resultarray[i] = '_';
         }
      }
      
      for (int i = 0; i < length; i++) {    
         result += resultarray[i];
      }   
       /*
      result += "   ";
      for (int i = 0; i < length; i++) {    
         result += guessarray[i];
      }
      result += "   ";
      for (int i = 0; i < length; i++) {    
         result += wordarray[i];
      }
      */
      return result;  
   }    
}
 
   
