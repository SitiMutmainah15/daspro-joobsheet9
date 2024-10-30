import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs21 = input21.nextInt();
        int[] nilaiMhs21 = new int[jumlahMhs21];

        for (int i = 0; i < jumlahMhs21; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs21[i] = input21.nextInt();
        }

        double total21 = 0;
        int nilaiTertinggi21 = nilaiMhs21[0];
        int nilaiTerendah21 = nilaiMhs21[0];

        for (int i = 0; i < nilaiMhs21.length; i++) {
            total21 += nilaiMhs21[i];

            if (nilaiMhs21[i] > nilaiTertinggi21) {
                nilaiTertinggi21 = nilaiMhs21[i];
            }
            if (nilaiMhs21[i] < nilaiTerendah21) {
                nilaiTerendah21 = nilaiMhs21[i];
            }
        }

        double rataRata21 = total21 / jumlahMhs21;

        System.out.println("Rata-rata nilai: " + rataRata21);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi21);
        System.out.println("Nilai terendah: " + nilaiTerendah21);
        System.out.println("Semua nilai yang telah dimasukkan:");

        for (int i = 0; i < nilaiMhs21.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs21[i]);
        }
    }
}
