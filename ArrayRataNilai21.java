import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalNilaiLulus = 0, totalNilaiTidakLulus = 0, rataLulus = 0, rataTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMhs[i] > 70) {
                totalNilaiLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalNilaiTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        } if (jumlahLulus > 0) {
            rataLulus = totalNilaiLulus / jumlahLulus;
        } if (jumlahTidakLulus > 0) {
            rataTidakLulus = totalNilaiTidakLulus / jumlahTidakLulus;
        } 
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
