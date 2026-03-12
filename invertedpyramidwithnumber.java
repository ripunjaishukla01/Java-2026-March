import java.util.Scanner;

// half pyramid With numbers


public class invertedpyramidwithnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 



        // inverted half pyramid With numbers
        System.out.println("Enter the second number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
