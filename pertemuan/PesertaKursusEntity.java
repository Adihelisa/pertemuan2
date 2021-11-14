/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan;
/**
 *
 * @author DESKTOP-GIRT2EV
 */

public class PesertaKursusEntity extends BiodataKursusEntity {
    private String umur;
    //construct parameter
    public PesertaKursusEntity(String umur, String nama, String noTelp, String alamat){
        super (nama, noTelp, alamat); //encapsulation superclass
        this.umur = umur;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
    
}
