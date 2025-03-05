// package Pertemuan_3;

public class Sepeda2Tak extends SepedaMotor {
    
    @Override
    void cetakKeterangan() {
        System.out.println("Ini adalah sepeda motor 2 tak");
    }

    public static void main(String[] args) {
        Sepeda2Tak s2tak = new Sepeda2Tak();
        
        s2tak.cetakKeterangan();
        s2tak.setMesin("150cc");
        s2tak.setDataSepeda("Roda hard", "Honda Beat", 2013);

        System.out.println("Jenis roda : " + s2tak.getJenisRoda());
        System.out.println("Merk Sepeda : " + s2tak.getMerk());
        System.out.println("Tahun Pembuatan : " + s2tak.getTahunPembuatan());
    }
}
