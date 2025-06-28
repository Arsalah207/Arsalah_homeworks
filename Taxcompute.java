
package taxcompute; 

import java.util.Scanner;
public class Taxcompute {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Please enter your inome amount");
        double income = input.nextDouble();
        System.out.println("Please enter type of filling" + "\n enter 1 for single" + "\n enter 2 for married" + " \n enter 3 for seprately " +"\n enter 4 for houshold filling");
        int status = input.nextInt();
        double tax;
        if (status == 1){
            if (income >= 0 && income<= 8350){
               tax = (income * 10)/(100);
                System.out.println("Your payable tax is " + tax);
            }else if (income >= 8351 && income <= 33950){
              tax =(income *20)/(100); 
                System.out.println("Your payabel tax is " + tax);
            }else if (income >=33952 && income <= 82250){
                tax = (income * 25)/(100);
                System.out.println("Your payabel tax is" + tax);
            }else if (income >=82251 && income <=171550){
              tax = (income * 28)/(100);
                System.out.println("Your payabel tax is" + tax);
            }else if (income >= 171551 && income <= 372950){
                tax = (income * 33)/(100);
                System.out.println("Your payabel tax is" + tax);
            }else if (income >= 372951){
                tax = (income * 35)/(100);
                System.out.println("Your payabel tax is" + tax);
            }
        }
            else if (status == 2){
                
                if (income >= 0 && income <= 16700 ){
                    tax = (income *10)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >= 16771 && income <= 67900){
                    tax = (income * 15)/(100);
                    System.out.println("Your payabel tax is" + tax);
                                       
                }else if (income >=67901 && income<= 137050){
                    tax = (income * 25)/(100);
                    System.out.println("Your payabel tax is" + tax);
                    
                }else if (income >= 137051 && income <= 208850){
                    tax = (income * 28)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >=208851 && income <= 372950){
                    tax = (income * 33)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >= 372951){
                    tax = (income * 35)/ (100);
                    System.out.println("Your payabel tax is" + tax);
                }
            }
            else if (status == 3){
                if (income >= 0 && income <= 8350){
                    tax = (income *10)/(100d);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >= 8351 && income <= 33850){
                    tax = (income * 15)/(100d);
                    System.out.println("Your payabel tax is" + tax);
                                       
                }else if (income >=33851 && income<= 68525){
                    tax = (income * 25)/(100);
                    System.out.println("Your payabel tax is" + tax);
                    
                }else if (income >= 68526 && income <= 104425){
                    tax = (income * 28)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >=104426 && income <= 186475){
                    tax = (income * 33)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >= 185476){
                    tax = (income * 35)/ (100);
                    System.out.println("Your payabel tax is" + tax);
                }
            }
            else if (status == 4){
                if (income >= 0 && income <= 11850 ){
                    tax = (income *10)/(100d);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >= 11951 && income <= 45500){
                    tax = (income * 15)/(100d);
                    System.out.println("Your payabel tax is" + tax);
                                       
                }else if (income >=45501 && income<= 117450){
                    tax = (income * 25)/(100);
                    System.out.println("Your payabel tax is" + tax);
                    
                }else if (income >= 117451 && income <= 190200){
                    tax = (income * 28)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >=190201 && income <= 372950){
                    tax = (income * 33)/(100);
                    System.out.println("Your payabel tax is" + tax);
                }else if (income >= 372951){
                    tax = (income * 35)/ (100);
                    System.out.println("Your payabel tax is" + tax);
                }
            }
                    
                    
                
            
                
                
                
                
                
                
            
            
            }
            
            
        }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    
    
}
