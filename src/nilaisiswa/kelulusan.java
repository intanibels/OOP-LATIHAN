package nilaisiswa;
public class kelulusan {
    public static void main(String[] args) { 
        //object
        siswa pelajar = new siswa();
        //pengisian atribut
        pelajar.nama = "Anya";
        pelajar.nilai = 80;
        //menjalankan method
        pelajar.cetaknilai();
        //menentukan lulus
        if(pelajar.nilai >= 75){
            System.out.println("selamat anda lulus");
        }else if(pelajar.nilai < 75){
            System.out.println("anda harus belajar lebih giat lagi");
        }
    }
}