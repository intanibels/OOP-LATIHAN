package nilaisiswa;
public class siswa {
    // mendifinisikan atribut 
    String nama;
    int nilai;
    //method cetak nilai 
    void cetaknilai(){
        System.out.println("Nilai Produktif RPL 5 "+nama+" adalah = " +nilai);
    }
    //method pengecekan     
    public boolean lulus(){ 
        return nilai>=75; 
    }
    public boolean tidaklulus(){ 
        return nilai<74; 
    }
}