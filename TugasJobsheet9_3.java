import java.util.Scanner;

public class TugasJobsheet9_3 {

    public static void main(String[] args) {
        
        String menu21[] = {"Nasi Goreng", "Mie Ayam", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        Scanner input21 = new Scanner(System.in);
        System.out.println("Daftar Menu Makanan:");
        
        for (String makanan21 : menu21) {
            System.out.println(makanan21);
        }
        
        System.out.print("Masukkan nama makanan yang dicari: ");
        String cari21 = input21.nextLine();

        boolean ditemukan21 = false;
        for (String makanan21 : menu21) {
            if (makanan21.equalsIgnoreCase(cari21)) {
                ditemukan21 = true;
                break;
            }
        }
        if (ditemukan21) {
            System.out.println(cari21 + " Makanan tersedia di menu");
        } else {
            System.out.println(cari21 + " Makanan tidak ada di menu");
        }
    }
}
