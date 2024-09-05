/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Lenovo AMD3020E
 */
public class DemoNilai {
    public static void main(String[] args){
        Nilai nilai = new Nilai();
        
        nilai.Nama = ("Devi");
        nilai.NIM = 23072;
        nilai.Absen = 90;
        nilai.Akhir = 70;
        nilai.Tugas = 85;
        nilai.UTS = 80;
        nilai.UAS = 88;
        
        nilai.Nilai();
        nilai.CetakNilai();      
    }
}

