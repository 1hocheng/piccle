/*
piccle game
puts the images in a text file and puts it in an array list
randomizer

Accesses a list of image filenames in text file (ImageList.txt). 
(constructor) Create a string arraylist that scans each image filename and appends it to the arraylist.
(method) Using the arraylist.size(), generates a random number and returns the filename at the arraylist index. 
*/

import java.util.*;
import java.io.*;

public class ImagesArray{
   private ArrayList<String> image;
   private String text;
   private File fileInput;
   private Scanner scanImage;
  
   public ImagesArray() throws FileNotFoundException{
      image = new ArrayList<String>();
      fileInput = new File("ImageList.txt");
      scanImage = new Scanner(fileInput);
      while(scanImage.hasNext()){
         image.add(scanImage.next());
         }
   }

   public String randomize(){
      return image.get((int)(Math.random()*image.size()));
   }
}