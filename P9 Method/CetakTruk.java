public class CetakTruk {

    public static void main(String arg[]) {
        Truk truk = new Truk(1000);
        System.out.println("Muatan Maksimal : " + truk.getMuatanMaks());
        truk.tambahanMuatan(500.0);
        System.out.println("tambahan muatan : 500");
        truk.tambahanMuatan(350.0);
        System.out.println("tambahan muatan : 350");
        truk.tambahanMuatan(100.0);
        System.out.println("tambahan muatan : 100");
        truk.tambahanMuatan(150.0);
        System.out.println("tambahan muatan : 150");
        System.out.println("tambahan sekarang : " + truk.getMuatan());
    }
}