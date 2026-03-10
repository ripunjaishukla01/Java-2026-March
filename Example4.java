import java.util.Scanner;

public class Example4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age :");
    int age = sc.nextInt();
    System.out.println("enter the weight :");
    int weight = sc.nextInt();
    if((age >=18 && age<=65) && (weight>=50 && weight<=85) ){
        System.out.println("you can donate blood");
    }else{
        System.out.println("you can't donate blood");
    }
   } 
}