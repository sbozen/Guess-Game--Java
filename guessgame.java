/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sbozen
 */
public class GuessGame {

public static void main(String[] args) {
  Random rnd=new Random();
  int generatedNumber=rnd.nextInt(89)+10;
  int tenner,unity;
  unity=generatedNumber%10;
  tenner=(generatedNumber-unity)/10;
  //System.out.println(generatedNumber);
  int reverseNumber =unity*10+tenner; 
  int estimatedNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the estimated number "));
  if(estimatedNumber<100 && estimatedNumber>9){
    int unityEstimated=estimatedNumber%10;
    int tennerEstimated=(estimatedNumber-unityEstimated)/10;
    if(estimatedNumber==generatedNumber)
    {
      JOptionPane.showMessageDialog(null,"Great! You won $ 10.000" );
    }
    else if(estimatedNumber==reverseNumber){
      JOptionPane.showMessageDialog(null,"Great! You won $ 3.000" );
    }
    else if(unity==unityEstimated ||unity==tennerEstimated || tenner==unityEstimated || tenner==tennerEstimated){
      JOptionPane.showMessageDialog(null,"Great! You won $ 1.000" );
    }
    else
      JOptionPane.showMessageDialog(null,"Sorry! You lost");}
    else{
      JOptionPane.showMessageDialog(null,"You have not entered a two-digit number");
    }
  }

}
