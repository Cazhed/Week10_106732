package week10.zachary.id.ac.umn;
import java.util.Scanner;

public class MainAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Barang[] barangList = new Barang[10];
        int barangCount = 0;

        int pilihan;

        do {
            System.out.println("----------- Menu Toko Voucher & HP -----------");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Input Barang Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

            case 1:
                if (barangCount == 0) {
                    System.out.println("Belum ada barang.");
                    break;
                }

                System.out.println("\nDaftar Barang:");
                for (int i = 0; i < barangCount; i++) {
                    Barang b = barangList[i];
                    System.out.println("-------------------------------");
                    System.out.println("ID      : " + b.getId());
                    System.out.println("Nama    : " + b.getNama());
                    System.out.println("Stok    : " + b.getStok());
                    System.out.println("Harga   : " + b.getHarga());

                    if (b instanceof Handphone) {
                        Handphone hp = (Handphone) b;
                        System.out.println("Warna   : " + hp.getWarna());
                    }
                    if (b instanceof Voucher) {
                        Voucher v = (Voucher) b;
                        System.out.println("Nominal : " + v.getNominal());
                    }
                }

                System.out.print("Masukkan ID Barang: ");
                String idPesan = input.nextLine();

                Barang pilih = null;
                for (int i = 0; i < barangCount; i++) {
                    if (barangList[i].getId().equalsIgnoreCase(idPesan)) {
                        pilih = barangList[i];
                        break;
                    }
                }

                if (pilih == null) {
                    System.out.println("Barang tidak ditemukan!");
                    break;
                }

                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();
                System.out.print("Uang yang dibayar: ");
                double uang = input.nextDouble();

                double total = pilih.getHarga() * jumlah;

                if (pilih.getStok() >= jumlah && uang >= total) {
                    pilih.minusStok(jumlah);
                    System.out.println("Pesanan berhasil!");
                } else {
                    System.out.println("Pembayaran gagal.");
                }

                break;

            case 2:
                if (barangCount == 0) {
                    System.out.println("Belum ada barang.");
                } else {
                    for (int i = 0; i < barangCount; i++) {
                        Barang b = barangList[i];
                        System.out.println("-------------------------------");
                        System.out.println("ID      : " + b.getId());
                        System.out.println("Nama    : " + b.getNama());
                        System.out.println("Harga   : " + b.getHarga());
                        System.out.println("Stok    : " + b.getStok());

                        if (b instanceof Handphone) {
                            System.out.println("Jenis   : HANDPHONE");
                        } else if (b instanceof Voucher) {
                            System.out.println("Jenis   : VOUCHER");
                        }
                    }
                }
                break;

            case 3:
                System.out.print("Input (H = Handphone, V = Voucher): ");
                char type = input.nextLine().toLowerCase().charAt(0);

                if (type == 'h') {
                    System.out.print("ID: "); String id = input.nextLine();
                    System.out.print("Nama: "); String nama = input.nextLine();
                    System.out.print("Harga: "); double harga = input.nextDouble();
                    System.out.print("Stok: "); int stok = input.nextInt(); input.nextLine();
                    System.out.print("Warna: "); String warna = input.nextLine();

                    barangList[barangCount++] =
                            new Handphone(id, nama, harga, stok, warna);

                    System.out.println("Handphone ditambahkan.\n");

                } else if (type == 'v') {
                    System.out.print("ID: "); String id = input.nextLine();
                    System.out.print("Nama: "); String nama = input.nextLine();
                    System.out.print("Nominal: "); int nominal = input.nextInt();
                    System.out.print("Stok: "); int stok = input.nextInt();
                    System.out.print("Pajak (0.xx): "); double pajak = input.nextDouble();

                    barangList[barangCount++] =
                            new Voucher(id, nama, nominal, stok, pajak);

                    System.out.println("Voucher ditambahkan.\n");
                } else {
                    System.out.println("Pilihan salah.");
                }
                break;

            case 4:
                System.out.println("Terima kasih!");
                break;

            }
        } while (pilihan != 4);
    }
}
