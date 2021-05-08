package javaCampIntro;

public class Module {
	private String ad;
	private int fiyat;
	private String aciklama;
	private int indirim;
	private int indirimSonrasıFiyat;
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getIndirim() {
		return indirim;
	}
	public void setIndirim(int indirim) {
		this.indirim = indirim;
	}
	public int getIndirimSonrasıFiyat() {
		return indirimSonrasıFiyat = getFiyat() * getIndirim()  /100;
	}
	
}
