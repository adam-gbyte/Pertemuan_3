import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getGrade() {
        if(nilai >= 80 ) {
            return "A";
        } else if(nilai >= 70 ) {
            return "B";
        } else if(nilai >= 60 ) {
            return "C";
        } else if(nilai >= 50 ) {
            return "D";
        } else {
            return "E";
        }
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            System.out.print("Tambah mahasiswa lagi? (y/n): ");
            String tambahMahasiswa = scanner.nextLine();

            daftarMahasiswa.add(new Mahasiswa(nim, nama, nilai));

            if (tambahMahasiswa.equals("n")) {
                running = false;
            }
        }

        int jumlahA = 0, jumlahB = 0, jumlahC = 0, jumlahD = 0, jumlahE = 0;
        int totalNilai = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("==============================");
            System.out.println("NIM: " + m.nim);
            System.out.println("Nama: " + m.nama);
            System.out.println("Nilai: " + m.nilai);
            System.out.println("Grade: " + m.getGrade());

            switch (m.getGrade()) {
                case "A": jumlahA++; break;
                case "B": jumlahB++; break;
                case "C": jumlahC++; break;
                case "D": jumlahD++; break;
                case "E": jumlahE++; break;
            }

            totalNilai += m.nilai;
        }

        System.out.println("==============================");
        System.out.println("Jumlah Mahasiswa: " + daftarMahasiswa.size());
        System.out.println("Jumlah Mahasiswa yang lulus A: " + jumlahA);
        System.out.println("Jumlah Mahasiswa yang lulus B: " + jumlahB);
        System.out.println("Jumlah Mahasiswa yang lulus C: " + jumlahC);
        System.out.println("Jumlah Mahasiswa yang tidak lulus D: " + jumlahD);
        System.out.println("Jumlah Mahasiswa yang tidak lulus E: " + jumlahE);
        System.out.println("Rata-rata nilai mahasiswa: " + (double) totalNilai / daftarMahasiswa.size());

        scanner.close();
    }
}
