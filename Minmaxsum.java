//Given five positive integers, find the minimum and maximum values 
//that can be calculated by summing exactly four of the five integers. 
//Then print the respective minimum and maximum values as a single line 
//of two space-separated long integers

package practice_hackerrank;
import java.util.*;

public class Minmaxsum {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a[]=new int[5];
        int i;
        int min=0,max=0;
        int j,t;
        for(i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=0;j<5-i-1;j++){
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            } 
        }
        for(i=0;i<4;i++){
            min=min+a[i];
        }
        for(i=1;i<5;i++){
            max=max+a[i];
        }
        System.out.println(+min);
        System.out.println(+max); 
    }
}
