/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekening;

/**
 *
 * @author USER
 */
public class MainTransaksi {
    public static void main(String[] args) {
        Transaksi list = new Transaksi();
        Rekening t1 = new Rekening("160309273084", "IFTITAH", "HIDAYATI", "14582643263", "ligula.Nullam@tacitisociosqu.edu", "898214", "494048", "3587", "2021-03-09 07:54:42");
        Rekening t2 = new Rekening("169712042416", "IZZATUN", "NAULY", "16834168323", "ut.pellentesque@luctusutpellentesque.com", "", "", "", "");
        Rekening t3  = new Rekening("161007278862", "MAULANA BINTANG", "IRFANSYAH", "6505379", "Proin.eget@velitegestaslacinia.ca", "", "", "", "");
        Rekening t4  = new Rekening("161807297229", "MELIUSA NORA", "HARIYANTI", "8638209", "Pellentesque.ut.ipsum@neque.ca", "", "", "", "");
        Rekening t5 = new Rekening("169503136823", "MOCHAMAD ADITYA", "BAGUS", "5926919", "tellus.justo.sit@commodoauctor.net", "", "", "", "");
        Rekening t6 = new Rekening("168507083528", "MOCHAMAD", "HAIRULLAH", "11153397678", "dictum@nec.edu", "", "", "", "");
        Rekening t7 = new Rekening("160802059329", "PUTRI MAULIDA", "SITO RESMI", "18917032664", "vel@ullamcorpermagna.co.uk", "", "", "", "");
        Rekening t8 = new Rekening("160806282695", "RIO", "ADRIANSYAH", "19786325110", "Aliquam.gravida@vestibulumMauris.net", "", "", "", "");
        Rekening t9 = new Rekening("161309092979", "SAFIRA", "ISTIFARINI", "8171766", "interdum.Curabitur.dictum@rutrumurna.edu", "", "", "", "");
        Rekening t10 = new Rekening("168902128688", "SATRIYA RIFKI", "PANGESTU", "16754004501", "et.ultrices@a.co.uk", "", "", "", "");
        Rekening t11 = new Rekening("161410089963", "SISWI DIAH", "PRIADHITA DEWI", "5279085", "ut@aultriciesadipiscing.ca", "", "", "", "");
        Rekening t12 = new Rekening("165112227763", "DEWI", "LAYLATUURROHMAH", "15644194285", "Proin.velit@Duisac.net", "", "", "", "");
        Rekening t13 = new Rekening("167206230943", "YOGA", "RAHMAHADI", "9776690", "ac@nibhAliquamornare.com", "", "", "", "");
        Rekening t14 = new Rekening("167711267372", "YOBY RYAIAN", "PRATAMA", "3535137", "cubilia.Curae.Phasellus@Duis.com", "", "", "", "");
        
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        list.tambah(t7);
        list.tambah(t8);
        list.tambah(t9);
        list.tambah(t10);
        list.tambah(t11);
        list.tambah(t12);
        list.tambah(t13);
        list.tambah(t14);
        
        
        
        
        System.out.println("Data sebelum sort : ");
        list.tampil();
        
        System.out.println("Data setelah sort : ");
        list.insertionSort();
        list.tampil();
                      
                    
                 
              
    }
}
