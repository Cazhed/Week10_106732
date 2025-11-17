package week10.zachary.id.ac.umn;

public class Voucher extends Barang {
    private double pajak;
    private int nominal;

    public Voucher(String id, String nama, int nominal, int stok, double pajak) {
        super(id, nama, nominal + (nominal * pajak));
        this.nominal = nominal;
        this.pajak = pajak;
        this.setStok(stok);
    }

    public double getNominal() { return nominal; }
    public double getPajak() { return pajak; }

    public double getHargaJual() {
        return getHarga() + (getHarga() * pajak);
    }
}