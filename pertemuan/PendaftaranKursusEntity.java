/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan;

/**asus
 *
 * @author DESKTOP-GIRT2EV
 */

import java.util.Scanner;



public class PendaftaranKursusEntity {
    private static Scanner input = new Scanner(System.in);
    //modifier
    private static PesertaKursusEntity[] pesertaEntity= new PesertaKursusEntity[100];
    private static PesertaTerdaftarEntity[] terdaftarEntity= new PesertaTerdaftarEntity[100];
    private static int pilKursus;
    private static int jumPeserta = 0;
    
    public static void main(String[] args) {
        int pil;
        System.out.println("=========================================");
        System.out.println("        S E L A M A T   D A T A N G    ");
        do{
            System.out.println("Jumlah Peserta Sekarang : " +jumPeserta);
            System.out.println("");
            System.out.println("() 1. [DAFTAR]    ");
            System.out.println("() 2. [UBAH DATA] ");
            System.out.println("() 3. [VIEW]      ");
            System.out.println("() 4. [DELETE]    ");
            System.out.println("() 0. [Log Out!]  ");
            System.out.println("[-] PILIH OPSI :  ");
            
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1 :
                    insertPeserta();
                    break;
                    
                case 2 :
                    updatePeserta();
                    break;
                    
                case 3 :
                    viewPeserta();
                    break;
                 
                case 4 :
                    deletePeserta();
                    break;
            }
        }while(pil!=0);
    }
    
    static void insertPeserta(){
        System.out.println("==========================================================");
        System.out.println("              [NEW] MASUKKAN DATA ANDA [NEW]              ");
        System.out.println("==========================================================");
        System.out.println("() NAMA LENGKAP : ");
        String nama = input.nextLine();
        System.out.println("() UMUR         : ");
        String umur = input.nextLine();
        System.out.println("() ALAMAT       : ");
        String alamat = input.nextLine();
        System.out.println("() NOMOR TELP   : ");
        String noTelp = input.nextLine();
        pesertaEntity[jumPeserta] = new PesertaKursusEntity(umur,nama,noTelp, alamat);
        insertKursus();
    }
    
    static void insertKursus(){
        System.out.println("==========================================================");
        System.out.println("                       [DAFTAR KURSUS]                    ");
        System.out.println("==========================================================");
        for (int i=0; i< KursusEntity.kursus.length; i++){
            System.out.println(i+ "." +KursusEntity.kursus[i]);
        }
            System.out.println("() PILIH KELAS KURSUS : ");
            pilKursus = input.nextInt();
            System.out.println("() KODE PESERTA       : ");
            String kodePeserta = input.next();
            terdaftarEntity [jumPeserta] = new PesertaTerdaftarEntity(pesertaEntity[jumPeserta], pilKursus, kodePeserta);
            jumPeserta = jumPeserta+1;
        }
    
    static void updatePeserta(){
        System.out.println("() KODE PESERTA YANG DI EDIT : ");
        String search = input.next();
        int cari = 0;
       
        do{
            if (cari==jumPeserta){
                System.err.println(" [!!!!] DATA EMPTY [!!!!] ");
                break;
            }else if(terdaftarEntity[cari].getKodePeserta().equals(search)){
                int pilEdit;
                do{
                    System.out.println("==========================================================");
                    System.out.println(" [UPDATE-NOW] PILIH OPSI YANG INGIN DIUBAH [UPDATE-NOW] : ");
                    System.out.println("==========================================================");
                    System.out.println("() 1. [VIEW] BIODATA DARI KODE PESERTA " +terdaftarEntity[cari].getKodePeserta());
                    System.out.println("() 2. NAMA                                                ");
                    System.out.println("() 3. ALAMAT                                              ");
                    System.out.println("() 4. NO.TELP                                             ");
                    System.out.println("() 5. UMUR                                                ");
                    System.out.println("() 6. KELAS KURSUS                                        ");
                    System.out.println("() 0. EXIT                                                ");
                    System.out.println("[-] PILIH OPSI : ");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if(pilEdit == 1){
                        System.out.println("==========================================================");
                        System.out.println(" KODE PESERTA  : " + terdaftarEntity[cari].getKodePeserta());
                        System.out.println("==========================================================");
                        System.out.println(" NAMA          : " + pesertaEntity[cari].getNama()+ ""
                                       + "\n UMUR          : " + pesertaEntity[cari].getUmur()+""
                                       + "\n ALAMAT        : " + pesertaEntity[cari].getAlamat()+""
                                       + "\n NO.TELP       : " + pesertaEntity[cari].getNoTelp()+""
                                       + "\n CLASS KURSUS  : " + KursusEntity.kursus[terdaftarEntity[cari].getIndexKursus()]);
                        System.out.println("==================================================");
                    }else if(pilEdit==2){
                        System.out.println(" UBAH NAMA MENJADI         : ");
                        String editNama = input.nextLine();
                        pesertaEntity[cari].setNama(editNama);
                    }else if(pilEdit==3){
                        System.out.println(" UBAH ALAMAT MENJADI       : ");
                        String editAlamat = input.nextLine();
                        pesertaEntity[cari].setAlamat(editAlamat);
                    }else if(pilEdit==4){
                        System.out.println(" UBAH NO.TELP MENJADI      : ");
                        String editNoTelp = input.nextLine();
                        pesertaEntity[cari].setNoTelp(editNoTelp);
                    }else if(pilEdit==5){
                        System.out.println(" UBAH UMUR MENJADI         : ");
                        String editUmur = input.nextLine();
                        pesertaEntity[cari].setUmur(editUmur);
                    }else if(pilEdit==6){
                        System.out.println(" DAFTAR KURSUS KELAS       : ");
                        for(int i=0; i<KursusEntity.kursus.length; i++){
                            System.out.println(i+"."+KursusEntity.kursus[i]);
                        }
                        System.out.println("[-] PILIH OPSI KURSUS      : ");
                        int editKursus = input.nextInt();
                        terdaftarEntity[cari].setIndexKursus(editKursus);
                    }
                }while(pilEdit!=0);
                break;
            }else{
                cari = cari+1;
            }
        }while(true);
    }
    
    static void viewPeserta(){
        if(jumPeserta==0){
            System.out.println(" [!!!!] BELUM ADA PESERTA TERDAFTAR [!!!!]");
        }else{
           for(int i=0; i<jumPeserta; i++){
               System.out.println("==================================================");
               System.out.println(" KODE PESERTA  : " + terdaftarEntity[i].getKodePeserta());
               System.out.println("==================================================");
               System.out.println(" NAMA          : " + pesertaEntity[i].getNama()+""
                              + "\n UMUR          : " + pesertaEntity[i].getUmur()+""
                              + "\n ALAMAT        : " + pesertaEntity[i].getAlamat()+""
                              + "\n N0.TELP       : " + pesertaEntity[i].getNoTelp()+""
                              + "\n CLASS KURSUS  : " + KursusEntity.kursus[terdaftarEntity[i].getIndexKursus()]);
               System.out.println("==================================================");
               
           }
        }
    }

    static void deletePeserta(){
        System.out.println("==========================================================");
        System.out.println("() KODE PESERTA YANG DI HAPUS : ");
        String search = input.next();
        input.nextLine();
        int cari=0;
        do{
            if (cari==jumPeserta){
                System.err.println(" [!!!!] TIDAK ADA DATA [!!!!] ");
                break;
            }else if(terdaftarEntity[cari].getKodePeserta().equals(search)){
                if (cari==jumPeserta -1){
                    jumPeserta = jumPeserta-1;
                }else{
                    for(int i=0; i<jumPeserta; i++){
                        terdaftarEntity[i]= terdaftarEntity[i+1];
                        pesertaEntity[i]= pesertaEntity[i+1];
                    }
                    jumPeserta = jumPeserta-1;
                }
                break; 
            }else{
                cari = cari+1;
            }
        }while(true);
    }
}