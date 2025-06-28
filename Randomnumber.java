
package randomnumber;
import java.util.Scanner;

public class Randomnumber {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int num1,num2;
      num1 = (int)(Math.random()*100);
      num2 = (int)(Math.random()*100);
      double sub=num1-num2;
      
      System.out.println("What is the answer of "+num1+"-"+num2+"?");
      double userAnswer=input.nextDouble();
      if (sub==userAnswer){System.out.println("correct");
      
      }
      else {System.out.println("Wrong");
      
      }
    }
    
}
