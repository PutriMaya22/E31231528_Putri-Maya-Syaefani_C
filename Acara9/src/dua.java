import java.util.Scanner;
public class dua {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        String ket;
        System.out.print("Masukan nilai : ");
        nilai = input.nextInt();
        if (nilai >= 90) {//jika nilai>=90
            ket = "A";
        }else if (nilai >= 80){//jika nilai>=80, 80-89
            ket = "B";
        }else if (nilai >= 70){//jika nilai >= 70, 70-79
            ket = "C";
        }else if (nilai >= 60){//jika nilai >=60, 60-69
            ket = "D";
        }else {//jika nilai < 60
            ket = "E";
        }
  System.out.println ( );
  System.out.println ("Total nilai = " + nilai);
  System.out.println ("Keterangan nilai = " +ket);
    }
    
}
