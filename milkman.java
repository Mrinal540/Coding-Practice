/*
Your mother has sent you to the milkman with a cylindrical bottle. 
You have to pay the milkman the price for the bottle full of milk at a rate of ₹40 per litre of milk.
You are given the radius (r) and the height (h) of the bottle in centimetres. You can assume the value of π as 3.14.
Formula for volume of cylinder:
V=π r2h
Also, 1 litre = 1000 cm3.
Input Format:
1 line containing two space separated integers - the radius and the height of the bottle (in centimetres).
Output Format:
The amount you need to pay to the milkman in rupees, accurate upto exactly 2 decimal places.
*/
import java.util.Scanner;
public class milkman{
    public static void main(String args[]){
    double v,r,h;
    double pi=3.14;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter radius & height of cyllinder:");
    r=sc.nextDouble();
    h=sc.nextDouble();
    v=pi*r*r*h;
    double mkl=v/1000;
    double price=mkl*40;
    System.out.println("Price to be paid to milkman:"+price);
    sc.close();
    }
}