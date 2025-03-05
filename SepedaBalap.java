// package Pertemuan_3;

public class SepedaBalap extends Sepeda {

    void cetakKeterangan() {
        System.out.println("Ini adalah sepeda balap");
    }

    public static void main(String[] args) {
        SepedaBalap s1 = new SepedaBalap();

        s1.cetakKeterangan();
        s1.setDataSepeda("Roda medium", "Sepeda balaps", 2015);
        
        System.out.println("Jenis roda : " + s1.getJenisRoda());
        System.out.println("Merk Sepeda : " + s1.getMerk());
        System.out.println("Tahun Pembuatan : " + s1.getTahunPembuatan());
    }
}
