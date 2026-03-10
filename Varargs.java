public class Varargs {
     public int sum(int...args){
     System.out.println("arguments length :"+ args.length);
     int s= 0;
     for(int x:args){
        s=s+x;
     }
     return s;
     }
     public static void main(String[] args) {
        Varargs V1 = new Varargs();
        int sum = V1.sum(2,4);
        System.out.println("sum with 2 arguments " +sum);

         int sum1 = V1.sum(2,4,6);
        System.out.println("sum with 3 arguments " +sum1);

         int sum2 = V1.sum(2,4,6,3);
        System.out.println("sum with 4 arguments " +sum2);
     }
    }
   

