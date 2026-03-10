// import java.util.Scanner;

// public class Exampleboolean {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the boolean value (true/false):");
//         boolean num = sc.nextBoolean();
//         System.out.println("you entered :"+ num);
//         //  boolean a = true;
//         System.out.println(num);
//     }
// }


import java.util.Scanner;

public class Exampleboolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the boolean value (true/false): ");
        boolean num = sc.nextBoolean();   // User must enter true or false

        System.out.println("You entered: " + num);

        sc.close();   // Scanner close karna good practice hota hai
    }
}
