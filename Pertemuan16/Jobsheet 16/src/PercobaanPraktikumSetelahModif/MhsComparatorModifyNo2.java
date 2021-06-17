/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PercobaanPraktikumSetelahModif;

/**
 *
 * @author USER
 */
import java.util.Comparator;
public class MhsComparatorModifyNo2 implements Comparator<Mahasiswa> {
    public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {
        if (mhs1.nim == mhs2.nim) {
            return 0;
        } else {

            return -1;
        }
    }

    @Override
    public Comparator<Mahasiswa> reversed() {
        return Comparator.super.reversed();
    }
}
