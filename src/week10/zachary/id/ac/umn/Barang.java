package week10.zachary.id.ac.umn;

public class Barang {
    protected String id;
    protected double harga;
    protected String nama;
    protected int stok;

    public Barang(String id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    public String getId() { return this.id; }
    public String getNama() { return this.nama; }
    public double getHarga() { return this.harga; }
    public int getStok() { return this.stok; }

    public void setStok(int stok) { this.stok = stok; }

    public void minusStok(int jml) {
        if (stok >= jml) stok -= jml;
        else System.out.println("Stok habis.");
    }
}