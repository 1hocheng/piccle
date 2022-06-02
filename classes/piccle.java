import java.util.*;  
import java.io.*;  
import java.awt.*;

public class piccle{
    public static void main(String[] args)
      throws FileNotFoundException {
      
      ImagesArray images = new ImagesArray();
      
      Scanner s = new Scanner(System.in);
      Picture current = new Picture(images.randomize());
      current.explore();
      String word = current.getName();
      System.out.println("word is " + word.length() + " letters long.");
      
      for (int i = 1; i <= 6; i++) {
         String guess = s.next().toLowerCase();
         System.out.println(Guess.result(word, guess));
      }
    }
}