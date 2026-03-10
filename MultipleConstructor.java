import java.util.*;
public class MultipleConstructor {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
        MultipleConstructor(){
            num=5;
            System.out.println("Default Constructor "+num);
      }
       MultipleConstructor(int m){
        System.out.println("Enter the Second number :");
        num= m;
        System.out.println("Parameterized contructor "+ num);
     }
     public static void main(String[] args) {
       MultipleConstructor m1 = new MultipleConstructor();
       MultipleConstructor m2 = new MultipleConstructor(7);

     }
}
