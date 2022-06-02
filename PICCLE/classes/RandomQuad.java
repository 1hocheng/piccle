//Gives a random sequence in which controls how the quadrants of the image appears as the user enters their guesses.
//Currently only has 4 sequences

public class RandomQuad {
   private PicclePic current;
   private int sequence;
   private String file;
   
   public RandomQuad(PicclePic current) {
      this.current = current;
      sequence = (int)(Math.random() * 4) + 1;
      this.file = current.getFileName();
   }
   
   //Erases entire image
   public void showBlank() {
      PicclePic p = new PicclePic(current.getFileName());
      p.hideQuadrantOne();
      p.hideQuadrantTwo();
      p.hideQuadrantThree();
      p.hideQuadrantFour();
      p.explore();
   }
   
   //Runs sequence corresponding to random number
   public void randomizeQ(int num) { //num helps determine what step the sequence is going through - precondition of num >= 1
      if(sequence == 1) {
         sequenceOne(num, file);
      } else if (sequence == 2) { 
         sequenceTwo(num, file);
      } else if (sequence == 3) {
         sequenceThree(num, file);
      } else if (sequence == 4) {
         sequenceFour(num, file);
      }
   }
   
   //Next few methods open image with blank quadrants. If 4 or more guesses have been made, entire picture is shown
   
   public void sequenceOne(int num, String tempFile) {
      PicclePic temp = new PicclePic(tempFile);
      if(num == 1) {
         temp.hideQuadrantTwo();
         temp.hideQuadrantThree();
         temp.hideQuadrantFour();
      } else if (num == 2) {
         temp.hideQuadrantThree();
         temp.hideQuadrantFour();
      } else if (num == 3) {
         temp.hideQuadrantFour();
      }
      
      temp.explore();
   }
   
   public void sequenceTwo(int num, String tempFile) {
      PicclePic temp = new PicclePic(tempFile);
      if(num == 1) {
         temp.hideQuadrantOne();
         temp.hideQuadrantThree();
         temp.hideQuadrantFour();
      } else if (num == 2) {
         temp.hideQuadrantOne();
         temp.hideQuadrantFour();
      } else if (num == 3) {
         temp.hideQuadrantOne();
      }
      
      temp.explore();
   }
   
   public void sequenceThree(int num, String tempFile) {
      PicclePic temp = new PicclePic(tempFile);
      if(num == 1) {
         temp.hideQuadrantOne();
         temp.hideQuadrantTwo();
         temp.hideQuadrantThree();
      } else if (num == 2) {
         temp.hideQuadrantTwo();
         temp.hideQuadrantThree();
      } else if (num == 3) {
         temp.hideQuadrantThree();
      }
      
      temp.explore();
   }
   
      public void sequenceFour(int num, String tempFile) {
      PicclePic temp = new PicclePic(tempFile); 
      if(num == 1) {
         temp.hideQuadrantOne();
         temp.hideQuadrantTwo();
         temp.hideQuadrantFour();
      } else if (num == 2) {
         temp.hideQuadrantOne();
         temp.hideQuadrantTwo();
      } else if (num == 3) {
         temp.hideQuadrantTwo();
      }
      
      temp.explore();
   }
}