public class Televisi{
    public String merk;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi(){
        channelAktif = 1;
    }
    public void pindahChannel(int channelBaru){
        if(channelBaru >= 1 && channelBaru <= jumlahChannel){
            channelAktif = channelBaru;
        }else{
            System.out.println("Channel Tidak Tersedia");
        }
    }

    public int getChannelAktif(){
        return channelAktif;
    }
}