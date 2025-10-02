public class TelevisiModern extends Televisi{
    private String modusTampilan, dvd;

    public TelevisiModern(String mrk, int jumlahChannel){
       merk = mrk;
       this.jumlahChannel = jumlahChannel;
    }

    public void gantiModusTampilan(String modus){
        modusTampilan = modus;
    }

    public void masukkanDVD(String judulDVD){
        dvd = judulDVD;
    }

    public void mainkanDVD(){
       if(dvd != null){
           System.out.println("Sedang memainkan DVD: " + dvd);
       }else{
           System.out.println("Sedang memainkan DVD: kosong");
       }
    }
}