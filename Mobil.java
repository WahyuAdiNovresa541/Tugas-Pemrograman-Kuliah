public class Mobil {
private String noPlat;
private String warna;
private String manufaktur;
private int kecepatan;
private double waktu;
private double jarak;

    public String getNoPlat() {
        return noPlat;
    }    
    public String getWarna() {
        return warna;
    }    
    public String getManufaktur() {
        return manufaktur;
    }    
    public int getKecepatan() {
        return kecepatan;
    }

    public void setNoPlat(String s) {
        this.noPlat = s;
    }    
    public void setWarna(String s) {
        this.warna = s;
    }    
    public void setManufaktur(String s) {
        this.manufaktur = s;
    }    
    public void setKecepatan(int Kmh) {
        this.kecepatan = (int)konversiKecepatan(Kmh);
    }    
    public void setWaktu(double waktu) {
        this.waktu = konversiWaktu(waktu);
    }
    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public void hitungJarak() {
        this.jarak = kecepatan * waktu;
    }
    private double konversiWaktu(double jam) {
        return jam * 3600;
    }
    private double konversiKecepatan(int Kmh) {
        return Kmh * 1000.0/3600.0;
    }

    public void displayMassage(){
        hitungJarak();
        System.out.println("Merk mobilnya adalah : " + manufaktur);
        System.out.println("Plat nomor nya adalah : " + noPlat);
        System.out.println("Punya warna : " + warna);

        System.out.println("Mampu menempuh kecepatan m/s : " + kecepatan);
        System.out.println("Waktu dalam second : " + waktu);
        System.out.println("Jarak tempuh dalam Km : " + (jarak / 1000));
    }        
}