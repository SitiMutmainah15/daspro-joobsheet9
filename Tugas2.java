import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan21 = input21.nextInt();
        input21.nextLine();

        String[] namaPesanan21 = new String[jumlahPesanan21];
        double[] hargaPesanan21 = new double[jumlahPesanan21];
        double totalBiaya21 = 0;

        for (int i = 0; i < jumlahPesanan21; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan21[i] = input21.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan21[i] = input21.nextDouble();
            input21.nextLine();

            totalBiaya21 += hargaPesanan21[i];
        }

        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan21; i++) {
            System.out.println((i + 1) + ". " + namaPesanan21[i] + " = Rp" + hargaPesanan21[i]);
        }

        System.out.println("Total Biaya: Rp" + totalBiaya21);
    }
}
