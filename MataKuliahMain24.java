public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 Mk1 = new MataKuliah24();
        Mk1.kodeMk = "IOF101";
        Mk1.nama = "Algoritma Struktur Data";
        Mk1.sks = 3;
        Mk1.jumlahjam = 6;

        Mk1.tampilInformasi();
        Mk1.ubahSKS(2);
        Mk1.tambahJam(1);
        Mk1.kurangiJam(3);

        MataKuliah24 Mk2 = new MataKuliah24("IOP201", "Basis Data",  2, 4);
        Mk2.tampilInformasi();
        Mk2.ubahSKS(3);
        Mk2.tambahJam(2);
        Mk2.kurangiJam(2);
    }
    
}
