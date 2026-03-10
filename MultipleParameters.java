public class MultipleParameters {
    public void myfunction(String sname,int sage){
        System.out.println(" My name is: "+ sname + "\n age is  "+sage);
    }
    public static void main(String[] args) {
        MultipleParameters f1 = new MultipleParameters();
        f1.myfunction("Ripunjai Shuka", 20); 
        MultipleParameters f2 = new MultipleParameters();
        f2.myfunction("Nikhilesh Tiwari", 24); 
        MultipleParameters f3 = new MultipleParameters();
        f3.myfunction("Ashrut Shuka", 19); 
        MultipleParameters f4 = new MultipleParameters();
        f4.myfunction("Naveen Pandey", 21); 
    }
}
