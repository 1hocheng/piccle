import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class PicclePic extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public PicclePic ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public PicclePic(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public PicclePic(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public PicclePic(PicclePic copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public PicclePic(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  //Erases top left quarter of image
   public void hideQuadrantOne() {
      Pixel[][] pixels = this.getPixels2D();
      for(int i = 0; i < pixels.length / 2; i++) {
         for(int j = 0; j < pixels[0].length / 2; j++) {
            Pixel pixelObj = pixels[i][j];
            pixelObj.setToWhite();
         }
      }
   }
   
   
   //Erases top right quarter of image
   public void hideQuadrantTwo() {
      Pixel[][] pixels = this.getPixels2D();
      for(int i = 0; i < pixels.length / 2; i++) {
         for(int j = 0; j < pixels[0].length / 2; j++) {
            Pixel pixelObj = pixels[i][j + pixels[0].length/2];
            pixelObj.setToWhite();
         }
      }
      
      if(pixels.length%2 != 0) {
         for(int i = 0; i < pixels.length/2; i++) {
            Pixel pixelObj = pixels[pixels.length/2 - (i + 1)][pixels[0].length - 1];
            pixelObj.setToWhite();
         }
      }
   }
   
   //Erases bottom left quarter of image
   public void hideQuadrantThree() {
      Pixel[][] pixels = this.getPixels2D();
      for(int i = 0; i < pixels.length / 2; i++) {
         for(int j = 0; j < pixels[0].length / 2; j++) {
            Pixel pixelObj = pixels[i + pixels.length/2][j];
            pixelObj.setToWhite();
         }
      }
      
      if(pixels[0].length%2 != 0) {
         for(int i = 0; i < pixels[0].length/2; i++) {
            Pixel pixelObj = pixels[pixels.length - 1][pixels[0].length/2 - (i + 1)];
            pixelObj.setToWhite();
         }
      }
   }
  
   //Erases bottom right quarter of image
   public void hideQuadrantFour() {
      Pixel[][] pixels = this.getPixels2D();
      for(int i = 0; i < pixels.length / 2; i++) {
         for(int j = 0; j < pixels[0].length / 2; j++) {
            Pixel pixelObj = pixels[i + pixels.length/2][j + pixels.length/2];
            pixelObj.setToWhite();
         }
      }
      
      if(pixels.length%2 != 0) {
         for(int i = 0; i < pixels.length/2; i++) {
            Pixel pixelObj = pixels[pixels.length - (i + 1)][pixels[0].length - 1];
            pixelObj.setToWhite();
         }
      }
      
      if(pixels[0].length%2 != 0) {
         for(int i = 0; i < pixels[0].length/2; i++) {
            Pixel pixelObj = pixels[pixels.length - 1][pixels[0].length - (i + 1)];
            pixelObj.setToWhite();
         }
         Pixel pixelObj = pixels[pixels.length - 1][pixels[0].length/2];
         pixelObj.setToWhite();
      }
      
   }
  
} // this } is the end of class Picture, put all new methods before this
