public class CetakSiswa1 {

    public static void main(String[] args) {
        Siswa1 sis = new Siswa1(12345, "jonowati") ;
        System.out.println("NIS : " + sis.getNis()) ;
        System.out.println("Nama : " + sis.getNama()) ;
    }
}

/**
* Pendeklarasian object pada baris 4 harus menggunakan parameter
* karena method konstruktor pada class Siswa1 memiliki parameter
* */