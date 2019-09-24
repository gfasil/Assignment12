/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L12HW;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class StudentsGrade {
    
    public static void main(String args[]){
          Scanner input=new Scanner(System.in);
      
    
    
        try{
        
         System.out.println("please insert your grade from zero to hundered");
                Double grade=input.nextDouble();
                if(grade>100 || grade<0) throw new IndexOutOfBoundsException();
                
                        
      }
        catch(InputMismatchException  x){
            System.out.println("This is Not a number. Please input a number");
               Scanner input1=new Scanner(System.in);
      
    
               Double grade=input1.nextDouble();
               if(grade>100 || grade<0) throw new IndexOutOfBoundsException();
              
        }
        catch(IndexOutOfBoundsException x){
        
            System.out.println("the input should be between 0-100");
            System.out.println("please insert your grade from zero to hundered");
               Scanner input1=new Scanner(System.in);
      
                   Double grade=input1.nextDouble();
                if(grade>100 || grade<0) throw new IndexOutOfBoundsException();
             
        
        
        }
    }
}
    
    

