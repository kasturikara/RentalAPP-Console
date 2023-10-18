import java.util.Scanner;

class Pelanggan {
  private String nama;

  public Pelanggan(String nama) {
    this.nama = nama;
  }
  public String getNama() {
    return nama;
  }
  @Override
  public String toString() {
    return nama;
  }
}

class Pegawai {
  private String nama;

  public Pegawai(String nama) {
    this.nama = nama;
  }
  public String getNama() {
    return nama;
  }
  @Override
  public String toString() {
    return nama;
  }
}

class PlayStation {
  private String kode;
  private String tipe;
  private double harga;
  public PlayStation(String kode, String tipe, double harga) {
    this.kode = kode;
    this.tipe = tipe;
    this.harga = harga;
  }
  public String getKode() {
    return kode;
  }
  public String getTipe() {
    return tipe;
  }
  public double getHarga() {
    return harga;
  }
  @Override
  public String toString() {
    return tipe;
  }
}

class Sewa {
  private Pelanggan pelanggan;
  private Pegawai pegawai;
  private PlayStation ps;
  private String tanggalSewa;
  private String tanggalKembali;
  private int durasi;
  public Sewa(Pelanggan pelanggan, Pegawai pegawai, PlayStation ps, String tanggalSewa, String tanggalKembali, int durasi) {
    this.pelanggan = pelanggan;
    this.pegawai = pegawai;
    this.ps = ps;
    this.tanggalSewa = tanggalSewa;
    this.tanggalKembali = tanggalKembali;
    this.durasi = durasi;
  }
  public Pelanggan getPelanggan() {
    return pelanggan;
  }
  public Pegawai getPegawai() {
    return pegawai;
  }
  public PlayStation getPs() {
    return ps;
  }
  public String getTanggalSewa() {
    return tanggalSewa;
  }
  public String getTanggalKembali() {
    return tanggalKembali;
  }
  public int getDurasi() {
    return durasi;
  }
  public double getTotalBiaya() {
    return ps.getHarga() * durasi;
  }
  @Override
  public String toString() {
    return "Nota\n" +
            "\nNama Pelanggan: " + pelanggan.getNama() +
            "\nNama Pegawai: " + pegawai.getNama() +
            "\nTipe PS: " + ps.getTipe() +
            "\nTanggal Sewa: " + getTanggalSewa() +
            "\nTanggal Kembali: " + getTanggalKembali() +
            "\nDurasi: " + getDurasi() + " hari" +
            "\nTotal Biaya: RP." + getTotalBiaya();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //pelanggan
    System.out.print("Masukkan nama pelanggan: ");
    String namaPelanggan = input.nextLine();
    Pelanggan pelanggan = new Pelanggan(namaPelanggan);
    //pegawai
    System.out.print("Masukkan nama pegawai: ");
    String namaPegawai = input.nextLine();
    Pegawai pegawai = new Pegawai(namaPegawai);
    //ps
    System.out.print("Masukkan kode PS: ");
    String kodePS = input.nextLine();
    System.out.print("Masukkan tipe PS: ");
    String tipePS = input.nextLine();
    System.out.print("Masukkan harga(per hari): ");
    double harga = input.nextDouble();
    //enter masuk sini
    input.nextLine();
    PlayStation ps = new PlayStation(kodePS, tipePS, harga);
    //sewa
    System.out.print("Masukkan tanggal sewa: ");
    String tanggalSewa = input.nextLine();
    System.out.print("Masukkan tanggal kembali: ");
    String tanggalKembali = input.nextLine();
    System.out.print("Masukkan durasi sewa (hari): ");
    int durasi = input.nextInt();
    Sewa sewa = new Sewa(pelanggan, pegawai, ps, tanggalSewa, tanggalKembali, durasi);

    System.out.println(sewa);
    input.close();
  }
}