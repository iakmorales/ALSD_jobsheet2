public class MataKuliah24 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahjam;

    public MataKuliah24(){

    }

    public MataKuliah24(String kodeMk, String nm, int sks, int jumlahjam){
        this.kodeMk = kodeMk;
        nama = nm;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMk);
        System.out.println("Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahjam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahjam += jam;
    }

    void kurangiJam(int jam){
        if (jam > jumlahjam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak  mencukupi ");
        } else {
            jumlahjam -= jam;
            System.out.println("Jumllah jam berhasil dikurangi. Sisa jam : " + jumlahjam);
        }
    }
}
