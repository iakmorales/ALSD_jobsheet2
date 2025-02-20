public class Dosen24 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen24(){

    }

    public Dosen24(String idDosen, String nm, boolean status, int thnGabung, String bidang){
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thnGabung;
        bidangKeahlian = bidang;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        if (statusAktif == true){
           System.out.println("Status Aktif");
        } else {
            System.out.println("Status Tidak Aktif");
        }
        System.out.println("Tahun Masuk : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
