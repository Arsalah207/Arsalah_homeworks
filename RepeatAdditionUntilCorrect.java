
package repeat.addition.until.correct;
import java.util.Scanner;

public class RepeatAdditionUntilCorrect {

   
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);    
        int num1 = (int) (Math.random()*100);
        int num2 = (int) (Math.random()*100);
        
        int sum = num1 + num2;
        
        System.out.println("What is the result of " +" "+num1 +"+"+ num2);
        
        int result = input.nextInt();
        
        while(result != sum){
           
                System.out.println("Wrong answere try again!");
                result = input.nextInt();
    
            }
            if (result == sum){
                System.out.println("Correct answere");
            
        
        
        
        
        
    }
    
}
