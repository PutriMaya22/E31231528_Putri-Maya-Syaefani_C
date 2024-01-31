import java.util.Scanner;
public class lima {
    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
        System.out.print("input number: ");
        int input = in.nextInt();
        
        if(input > 0)
        {
    System.out.println ("Number is positive");
}
    else if (input < 0 )
    {
System.out.println ("Number is negative");
    }    
else
{
System.out.println("Number is zero");
    }
    }
}

class wifi {
public static void main (String [] args) {

Scanner input = new Scanner (System.in);

System.out.println ("Pilih paket WIFI :");
System.out.println ("1. Paket Wifi A (10Mbps ) = 150.000/Perbulan");
System.out.println ("2. Paket Wifi B (20Mbps) = 200.000/Perbulan");
System.out.println ("3. Paket Wifi C (50 Mbps)= 300.000/Perbulan");

System.out.print ("Masukkan pilihan anda 1/2/3 :");
int choice =input.nextInt ();

switch (choice) {
    case 1 :
        System.out.println ("Anda memilih paket Wifi A (10 Mbps) = 150.000");
        break ;
    case 2 : 
        System.out.println ("Anda memilih paket Wifi B (20 Mbps)= 200.000");
        break ;
    case 3 :
        System.out.println ("Anda memilih paket Wifi C (50 Mbps)= 300.000");
        break ;
    default :
         System.out.println ("Pilihan tidak valid. Silahkan pilih 1, 2 ,3.");
        break ;   
}
input.close ();
}
} 