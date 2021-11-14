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
public class PesertaTerdaftarEntity {
    private PesertaKursusEntity pesertaEntity;
    private int indexKursus;
    private String kodePeserta;
    
    //cunstruct
    public PesertaTerdaftarEntity(PesertaKursusEntity pesertaEntity, int indexKursus, String kodePeserta){
        this.pesertaEntity = pesertaEntity; //atribute
        this.indexKursus = indexKursus;
        this.kodePeserta = kodePeserta;
    }

    public PesertaKursusEntity getPesertaEntity() {
        return pesertaEntity;
    }

    public void setPesertaEntity(PesertaKursusEntity pesertaEntity) {
        this.pesertaEntity = pesertaEntity;
    }

    public int getIndexKursus() {
        return indexKursus;
    }

    public void setIndexKursus(int indexKursus) {
        this.indexKursus = indexKursus;
    }

    public String getKodePeserta() {
        return kodePeserta;
    }

    public void setKodePeserta(String kodePeserta) {
        this.kodePeserta = kodePeserta;
    }
    
}
