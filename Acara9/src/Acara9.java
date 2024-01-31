import java.util.Scanner;
public class Acara9 {
public static void main(String[] args){
    
    
int angka1, angka2, angka3, terbesar;
Scanner scan = new Scanner(System.in);

    System.out.print (" masukan angka1 = " );
    angka1 = scan.nextInt();
    System.out.print (" masukan angka2 = " );
    angka2 = scan.nextInt();
    System.out.print (" masukan angka3 = " );
    angka3 = scan.nextInt();
    
    if (angka1>angka2 && angka1>angka3){
    terbesar = angka1;
    }else{
    if(angka2>angka3){
    terbesar = angka2;
    }else{
    terbesar = angka3;
    }
    }
 System.out.println (" angka terbesar adalah "+ terbesar);
    }
}
    
