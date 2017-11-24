public class RumusMatematika{

    double a, t;                                           //deklarasi variabel
    double l_segitiga;

    public static void main(String arg[]) {               //method main
        RumusMatematika rm = new RumusMatematika ();      //deklarasi object dengan nama rm
        rm.luasSegitiga();                                //memanggil method luassegitiga
    }

    void luasSegitiga(){
        a = 7;                                             // pemanggilan method luassegitiga harus dideklarasikan object class nya terlebih dahulu
        t = 10;                                            // karena method luasSegitiga tergolong method bukan static
        l_segitiga = 0.5 * 1 * t ;
        System.out.println("Luas segitiga = "+l_segitiga);
    }
}