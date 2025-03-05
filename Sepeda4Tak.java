// package Pertemuan_3;

public class Sepeda4Tak extends SepedaMotor {

    @Override
    void cetakKeterangan() {
        System.out.println("Ini adalah sepeda motor 4 tak");
    }

    public static void main(String[] args) {
        Sepeda4Tak s4tak = new Sepeda4Tak();

        s4tak.cetakKeterangan();
        s4tak.setDataSepeda("Roda hard", "Yamaha vixion", 2013);
        s4tak.setMesin("500cc");
        
        System.out.println("Kapasitas mesin : " + s4tak.getMesin());
        System.out.println("Jenis roda : " + s4tak.getJenisRoda());
        System.out.println("Merk Sepeda : " + s4tak.getMerk());
        System.out.println("Tahun Pembuatan : " + s4tak.getTahunPembuatan());
    }
}
