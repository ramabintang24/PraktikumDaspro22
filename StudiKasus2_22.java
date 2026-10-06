import java.util.Scanner;
public class StudiKasus2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa, kegiatan;
        int peringkat, jumlahDokumen, dokumenKurang, statusDanaPenghargaan;

        System.out.print("Masukkan nama: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        kegiatan = input.nextLine();

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("Mandiri")) {
            
            System.out.print("Peringkat juara: ");
            peringkat = input.nextInt();

            if (peringkat > 0 && peringkat <= 3) {
                System.out.print("Jumlah dokumen: ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Memperoleh dana penghargaan");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + dokumenKurang + " dokumen)");
                    System.out.println("Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Peringkat tidak memenuhi syarat untuk mendapatkan dana penghargaan");
            }
        } else if (kegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status dana penghargaan (1: Diterima, 0: Ditolak): ");
            statusDanaPenghargaan = input.nextInt();
            
            if (statusDanaPenghargaan == 1) {
                System.out.print("Jumlah dokumen: ");
                jumlahDokumen = input.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Memperoleh dana penghargaan");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + dokumenKurang + " dokumen)");
                    System.out.println("Dana penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status dana penghargaan ditolak");
            }
        } else {
            System.out.println("Kegiatan tidak dapat mendapatkan dana penghargaan");
        }
        input.close();
    }
}
