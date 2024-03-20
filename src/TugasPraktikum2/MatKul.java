package TugasPraktikum2;

public class MatKul {
    public String kode;
    public String nama;
    public int sks;
    public String nilai;

    public MatKul(String kode, String nama, int sks, String nilai) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "[kode=" + kode + ", nama=" + nama + ", sks=" + sks + ", nilai=" + nilai + "]";
    }
}
