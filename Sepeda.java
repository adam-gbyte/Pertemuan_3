// package Pertemuan_3;

public class Sepeda {
    protected String jenis_roda;
    protected String merk;
    protected int tahun_pembuatan;

    public void setDataSepeda(String jroda, String merk, int tahun) {
        jenis_roda = jroda;
        this.merk = merk;
        tahun_pembuatan = tahun;
    }

    public String getJenisRoda() {
        return jenis_roda;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }
}
