/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan41_massajenis;

/**
 *
 * @author syhar
 */
public class Kubus {
    
    public int sisi;
    public int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
 
    
    public int hitungVolume (int parSisi){
        return sisi*sisi*sisi;
        
    }
    public int massaJenis (int parMassa, int volume){
        return massa/hitungVolume(sisi);
    }
    
   public void hasilPerhitungan (){
       System.out.println("=====Hasil Perhitungan=====");
       System.out.println("Volume = "+hitungVolume(sisi));
       System.out.println("Massa Jenis = "+massaJenis(massa, sisi));
   }
}
