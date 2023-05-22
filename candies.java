/*
You are having a get together at your house and your mother asks you to distribute candies equally amongst all your cousins.
You want to determine if the number of candies given by your mother can be equally distributed or not.
Input Format:
A single line with two space-separated integers representing the number of candies and the number of cousins repectively.
Output Format:
Print "YES" if you can equally distribute the candies and "NO" if you cannot.
 */
import java.util.Scanner;
 public class candies {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no. of candies & cousins:");
    int candies=sc.nextInt();
    int cousins=sc.nextInt();
    if(candies%cousins==0)
      System.out.println("YES");
      else
      System.out.println("NO");

    sc.close();  
    }
    
}
