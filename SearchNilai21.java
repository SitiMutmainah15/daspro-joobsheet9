import java.util.Scanner;

public class SearchNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari : ");
        int key = sc.nextInt();

        int indeks = -1;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                indeks = i;
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (indeks + 1));
                break;
            }
        }
    }
}
