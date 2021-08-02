package latihansoal4;

public class LatihanSoal4B {
    
    public static void main(String[] args) {
        
        int nilaiAwal, nilaiAkhir, selisih;
        nilaiAwal = 5;
        nilaiAkhir = 75;
        selisih = 5;
        
        for (int i=0; i<5 ;i++){
            for (int j=i; j<5 ;j++){
                
                System.out.print(nilaiAwal+" ");
                
                nilaiAwal+=selisih;
            }
            System.out.println();
        }
    }
}
