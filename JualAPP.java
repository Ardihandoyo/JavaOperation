package Praktikum5.OperasiBil;
import java.util.Scanner;


class Penjualan {
  String kode, nama;
  int jumlah, harga;

  void setData(String bentukkode, String NamaBarang, int jumlahBarang, int hargaBarang) {
    this.nama = NamaBarang;
    this.jumlah = jumlahBarang;
    this.harga = hargaBarang;
    this.kode = bentukkode;
  }

  int getJumlah() {
    return jumlah * harga;
  }

  String getBonus() {
    String bonus;
    if (jumlah > 5 && harga > 500) {
      bonus = "Dapat setrika";
    } else if (jumlah > 3 && harga > 100) {
      bonus = " Dapat payung";
    } else if (jumlah > 2 && harga > 50) {
      bonus = " Dapat polpen";
    } else {
      bonus = "Tidak Dapat Bonus";
    }
    return bonus;
  }

  void cetakNota() {
    System.out.println("NOTA PEMBELIAN");
    System.out.println("Jumlah Semua Harga \t" + getJumlah());
    System.out.println("Bonus \t" + getBonus());
  }
}

public class JualAPP {
  public static void main(String[] args) {
    Penjualan kasir = new Penjualan();
    Scanner userinput = new Scanner(System.in);
    System.out.print("Nama Barang \t=");
    String nama = userinput.nextLine();
    System.out.print("Kode Barang \t=");
    String kode = userinput.nextLine();
    System.out.print("Jumlah Barang \t=");
    int jumlah = userinput.nextInt();
    System.out.print("Harga \t=");
    int harga = userinput.nextInt();
    kasir.setData(kode, nama, jumlah, harga);
    kasir.cetakNota();
    userinput.close();


  }
}
