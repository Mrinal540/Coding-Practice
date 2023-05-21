/*
Your father has given you some money and you are trying to decide what you want to do with that money.
Your friend gives you the idea of an investment that gives you simple interest for your money.
If you invest a sum of p for t years at a rate of r%, the formula for simple interest will be -> Interest = (p*r*t)/100
Given the rate of interest and the time you can invest for, calculate the interest you will recieve
 */
import java.util.*;
 public class simpleinterest {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter invest sum:");
    float p=sc.nextFloat();
    System.out.println("Enter rate:");
    float r=sc.nextFloat();
    System.out.println("Enter time:");
    float t=sc.nextFloat();
    float si;
    si=(p*r*t)/100;
    System.out.println("Interest earned will be:"+si);
    sc.close();
} 
}
