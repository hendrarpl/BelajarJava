/* Tipe data
Ada 2 jenis tipe data secara umum, yaitu tipe data number (bilangan bulat dan pecahan) dan tipe data character

    tipe data NUMBER

        bilangan bulat :
        - byte = -128 hingga 127
        - short = -32768 hingga 32767
        - int = -2147483648 hingga 2147483647
        - long = -9223372036854775808 hingga 9223372036854775807

        bilangan pecahan :
        float = 3.4 * 10-38 hingga 3.4 * 1038
        double = 1.7 * 10-308 hingga 1.7 * 10308


    tipe data CHARACTER
        char = untuk menampung 1 digit karakter, baik itu berupa huruf, angka maupun karakter lain seperti ^, %, dan #.
        String = untuk menampung kumpulan karakter seperti "aku anak nomer 1"

        Note : dari semua tipe data yang ada diatas yang paling banyak digunakan dan disarankan adalah :
        -tipe data int untuk pengunaan angka desimal
        -tipe data double untuk penggunaan angka dengan koma
        -tipe data String untuk penggunaan kumpulan karakter angka dan character


 */

public class TipeDataDanVariabel {
    public static void main(String[] args) {
        byte variabelByte = 127;
        short variabelShort = 32000;
        int variabelInt = 2000000;
        long variabelLong = 3_000_000L; // bisa menggunakan tanda pemisah underscore _ agar enak dibaca

        float variabelFloat = 3.14f; // variabel float harus diberikan huruf f dibelakang angkanya
        double variabelDouble = 22.222;


        System.out.println(variabelLong);
        System.out.println(variabelFloat);

        // penulisan variabel bisa juga di deklarasikan dulu lalu kemudian variabel tersebut diisi
        // contoh:
        int a;
        a = 100;
        // atau bisa di deklarasikan dengan banyak variabel
        // contoh:
        int b, c, d, e;
        b = 1;
        c = 2;
        d = 3;
        System.out.println(b);


        // contoh tipe data dan variabel dari tipe data character dan String

        char iniChar1 = 'a'; // panjang data harus 1 character
        char iniChar2 = '*'; // panjang data harus 1 character

        String iniString1 = "Saya adalah";
        String iniString2 = "Anak nomer 2";

        System.out.println(iniString1+ " " + iniString2);
    }
}
