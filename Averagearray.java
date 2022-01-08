package lab;
//collect marks from n students and print average using arrays concept
//7-01-2022 Question 6
import java.util.*;
public class Averagearray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=s.nextInt();
        int m=3*n;        
        int sum=0;
        int av;
        int a[]=new int[m];
        int i;
        for(i=0;i<m;i++)
        {
            a[i]=s.nextInt();
            sum=sum+a[i];
            
        }
        av=sum/m;
       System.out.println("Class average:"+av);
    }
}
