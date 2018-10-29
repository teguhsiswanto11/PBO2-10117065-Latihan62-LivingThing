public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Ctrl + O
    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    }
}
