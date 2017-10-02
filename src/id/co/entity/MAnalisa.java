
package id.co.entity;

/**
 *
 * @author user
 */
public class MAnalisa {
    private double hargaBarang;
    private double uangMuka;
    private int lamaAngsuran;
    private double bunga;
    
    private int jumlah;
    //Buat member variabel untuk method isApprove
    private boolean lebihBesar;   
    
    //Konstruktor untuk memanggil method isApprove
    public MAnalisa() {
    }
    
    //Konstruktor untuk perhitungan cicilanPerBulan
    public MAnalisa(double hargaBarang, double uangMuka, int lamaAngsuran, double bunga) {
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.lamaAngsuran = lamaAngsuran;
        this.bunga = bunga;
    }
    
    

    private double hitungCicilanPokok() {
        return this.hargaBarang - this.uangMuka; 
    }
    
    private double hitungBungaCicilan() {
      return this.hitungCicilanPokok() * this.bunga * this.lamaAngsuran ;  
    }


    private double hitungKreditTotal(){
       return this.hitungCicilanPokok()+this.hitungBungaCicilan();
         
    }
    
    public double HitungCicilanPerBulan(){
        return this.hitungKreditTotal()/this.lamaAngsuran;
    }
      
    public boolean isApprove(double limitPinjaman,double cicilanPerBulan) {
        boolean terima = false;
        if( limitPinjaman==cicilanPerBulan){
        terima=true;
        }else if(limitPinjaman>cicilanPerBulan){
            lebihBesar=true;
        }else if(limitPinjaman<cicilanPerBulan)
        {
            lebihBesar=false;
        }
        return terima;
    }

    /**
     * @return the lebihBesar
     */
    public boolean isLebihBesar() {
        return lebihBesar;
    }

    /**
     * @param lebihBesar the lebihBesar to set
     */
    public void setLebihBesar(boolean lebihBesar) {
        this.lebihBesar = lebihBesar;
    }


}
