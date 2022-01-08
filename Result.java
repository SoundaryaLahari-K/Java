//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
//Print the decimal value of each fraction on a new line with 6 places after the decimal.
package practice_hackerrank;
import java.util.*;
public class Result {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int i;
        float countpos=0;
        float countneg=0;
        float countzero=0;
        float pos;
        float neg;
        float zero;
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            if(arr[i]>0) //pos
            {
                //countpos=0;
                countpos=countpos+1;
            }
            if(arr[i]<0) //neg
            {
                countneg=countneg+1;
            }
            if(arr[i]==0) //zero
            {
                countzero=countzero+1;
            }
        }            
            pos=countpos/n;
            neg=countneg/n;
            zero=countzero/n;
        System.out.println(+pos);
        System.out.println(+neg);
        System.out.println(+zero);
        
    }
}

