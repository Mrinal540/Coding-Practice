/*
You have a cube with each edge measuring length a. Find out the surface area and the volume of the cube.
A cube has 6 sides and the formulae for the area and volume are:
Surface Area = 6a2
Volume = a3
 */
import java.util.*;
public class cube {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of edge:");
int a=sc.nextInt();
int sa,v;
sa=6*a*a;
v=a*a*a;
System.out.println(sa+" "+v);
sc.close();
}    
}
