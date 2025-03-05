// package Pertemuan_3;

public class SepedaGunung extends Sepeda {
    
    void cetakKeterangan() {
        System.out.println("Ini adalah sepeda gunung");
    }

    public static void main(String[] args) {
        SepedaGunung s1 = new SepedaGunung();

        s1.cetakKeterangan();
        s1.setDataSepeda("Roda medium", "poligon", 2015);
        
        System.out.println("Jenis roda : " + s1.getJenisRoda());
        System.out.println("Merk Sepeda : " + s1.getMerk());
        System.out.println("Tahun Pembuatan : " + s1.getTahunPembuatan());
    }
}
