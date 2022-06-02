//An attempt at user interface
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PiccleFrame extends JFrame {
   private String word;
   private JList resultList;
   private DefaultListModel result;
      
   public PiccleFrame() {
      setTitle("PICCLE");
      
      // sets up list with comparison of the guess to the word
      resultList = new JList(result);
   }
}