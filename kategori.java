package projek_kasir;

public class kategori {
    private int id_kategori;
    private String nama_kategori;

    public kategori(int id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }
    public int getId_kategori() {
        return id_kategori;
    }
    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }
    public String getNama_kategori() {
        return nama_kategori;
    }
    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    public void getProduk(Barang b, kategori k){
        System.out.println("Nama Barang: "+b.getNama_produk());
        System.out.println("Harga Barang: "+b.getHarga());
        System.out.println("Tanggal Barang Expired: "+b.getExpired());
        System.out.println("Kategori Barang: "+k.getNama_kategori());
        System.out.println("Id Kategori Barang: "+k.getId_kategori());
        System.out.print("Status Barang: ");b.isExpired();
    }
}
