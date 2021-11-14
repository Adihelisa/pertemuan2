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
public class  BiodataKursusEntity {
    protected String nama, noTelp, alamat;
    
    public BiodataKursusEntity(String nama, String noTelp, String alamat){//parameter
        this.nama = nama;//atribut
        this.noTelp = noTelp;
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public String getNoTelp(){
        return noTelp;
    }
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
