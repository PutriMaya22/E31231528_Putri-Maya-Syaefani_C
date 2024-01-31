import java.util.*;
public class empat {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       System.out.print("input a number: ");
       
       int n = in.nextInt();
       if (n % 2 == 0){
           System.out.println(1);
       }
       else {
           System.out.println(0);
       }
    }
    
}
