package latihansoal4;

public class LatihanSoal4A {

    public static void main(String[] args) {
        
        int nilaiAwal, nilaiAkhir, selisih;
        nilaiAwal = 5;
        nilaiAkhir = 50;
        selisih = 5;
        
        for (int i=0; i<5 ;i++){
            for (int j=0; j<i ;j++){
                
                System.out.print(nilaiAwal+" ");
                
                nilaiAwal+=selisih;
            }
            System.out.println();
        }
    }
    
}
