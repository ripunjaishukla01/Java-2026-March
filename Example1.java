// Vote dene ki age check karo (18+).


import java.util.*;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        try {
            double age = sc.nextDouble();
            if (age>=18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not eligible to vote");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("Exceptional Error :");
        }
    }
}
