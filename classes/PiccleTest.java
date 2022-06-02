//piccle test picture dispapearing go gone
import java.util.*;  

public class PiccleTest {
   public static void main(String[] args) {
      PicclePic jinx = new PicclePic("jinx.jpg");
      Scanner s = new Scanner(System.in);
      
      
      jinx.hideQuadrantOne();
      jinx.explore();
   }
   
   /*public static void hideAll(PicclePic meow) {
      meow.hideQuadrantOne();
      meow.hideQuadrantTwo();
      meow.hideQuadrantThree();
      meow.hideQuadrantFour();
      
      meow.explore();
   }*/
   
   
   /*public static void randomQuadrant(PicclePic meow) {
      int random = Math.round(Math.random * 3);
      
      if(random == 1) {
         meow.hideQuadrant
      }
   }*/
}