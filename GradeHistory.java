package lab;
//input based program to collect data and print name,cgpa,course,average,grade,age
//7-01-2022 Question 5(3+4+5)
import java.util.*;
public class GradeHistory {
     public static void main(String[] args){
         Scanner s= new Scanner(System.in);
         String name=s.next();
         float cgpa=s.nextFloat();
         String course=s.next();
         int age =s.nextInt();
         
         float marks1=s.nextFloat();
         float marks2=s.nextFloat();
         float marks3=s.nextFloat();
         float marks4=s.nextFloat();
         float marks5=s.nextFloat();
         float c=marks1+marks2+marks3+marks4+marks5;
         float d=c/5;
         float percentage=(c*100)/500;
    
         System.out.println("Name:"+name);
         System.out.println("cgpa:"+cgpa);
         System.out.println("course:"+course);
         System.out.println("age:"+age);
         System.out.println("total:"+c);
         System.out.println("average:"+d);
         System.out.println("percentage:"+percentage);
         
         if(percentage<100 && percentage>=90){
             System.out.println("S grade");
         }
         if(percentage<89 && percentage>80){
             System.out.println("A grade");
         }
         if(percentage<79 && percentage>70){
             System.out.println("B grade");
         }
         if(percentage<69 && percentage>60){
             System.out.println("C grade");
         }
         if(percentage<59 && percentage>50){
             System.out.println("D grade");
         }
         if(percentage<50){
             System.out.println("E grade");
         }
}
}
