import java.util.*;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the table: ");
        int num = sc.nextInt();
       for(int i= 1;i<=20;i++){
        // if ( i % 2 == 0) {
            System.out.println(num +" X " + i + " = " + num * i );
        }
    //    }
       
    }
}
