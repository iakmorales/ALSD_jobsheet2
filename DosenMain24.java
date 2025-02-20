public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dosen1 = new Dosen24();
        dosen1.idDosen = "21123456";
        dosen1.nama = "Zaskia Maulidina";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2020;
        dosen1.bidangKeahlian = "Algoritma Struktur Data";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2050);
        dosen1.ubahKeahlian("Pemrogaman");

        Dosen24 dosen2 = new Dosen24("22113546", "Sofiah", false, 2029, "Komputer dan Jaringan");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen1.hitungMasaKerja(2050);
    }
}
