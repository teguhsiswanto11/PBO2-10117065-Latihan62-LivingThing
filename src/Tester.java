/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Menggunakan konsep abstraksi untuk method yang kita belum tahu isinya
 *
 */
public class Tester {
    public static void main(String[] args) {
        Human human = new Human();

        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}
