//program to find if a number is even/odd
//7-01-2022 Question 1
package lab;
import java.util.*;
public class evenodd {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }     
    }
}
