public class Mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa24(){

    }

    public Mahasiswa24(String nm, String nim, double ipk, String kls ){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahkelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (0.0 <= ipkBaru && ipkBaru <= 4.0) {
        } else 
        ipk = ipkBaru;
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
     }
    
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "kinerja kurang";
        }
    }
}