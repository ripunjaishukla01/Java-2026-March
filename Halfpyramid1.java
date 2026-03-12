import java.util.*;
public class Halfpyramid1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First number :");
    int m = sc.nextInt();
    for(int i=1; i<=m;i++){
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}