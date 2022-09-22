package java209;
import java.io.*;
import java.util.Scanner;
  
 public class reverse {
    public static void main (String[] args) {
        
        String str= "rahul", nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("rahul");
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
  
