package week10.zachary.id.ac.umn;

public class Handphone extends Barang {
    private String warna;

    public Handphone(String id, String nama, double harga, int stok, String warna) {
        super(id, nama, harga);
        this.warna = warna;
        this.setStok(stok);
    }

    public String getWarna() { return warna; }
}