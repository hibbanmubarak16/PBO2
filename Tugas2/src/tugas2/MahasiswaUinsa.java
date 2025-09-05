/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author hibban mubarak
 */
public class MahasiswaUinsa extends Manusia implements Organisasi, Atlet, Peneliti {

    private String jurusan;

    public MahasiswaUinsa(String nama, int umur, String jurusan) {
        super(nama, umur);
        this.jurusan = jurusan;
    }

    @Override
    public void IkutOrganisasi() {
        System.out.println(getNama() + " aktif dalam organisasi sebagai" + Jabatan );
    }

    @Override
    public void Berlatih() {
         System.out.println(getNama() + " rutin berlatih olahraga" + Olahraga);
    }

    @Override
    public void meneliti() {
        System.out.println(getNama() + " sedang melakukan riset di bidang" + BidangRiset);
    }
   public void InfoMahasiswa(){
       super.Berjalan();
       System.out.println(getNama() + " Mahasiswa Jurusan " + this.jurusan + " di Uinsa");
   } 
   public static void main(String[] args){
       MahasiswaUinsa hibban = new MahasiswaUinsa(" hibban ", 21, " Sistem informasi");
       hibban.InfoMahasiswa();
       hibban.IkutOrganisasi();
       hibban.Berlatih();
       hibban.meneliti();
   }
}
