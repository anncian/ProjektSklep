package projektSklepu;


public class Produkt {
	private int id;
	private String nazwa;
	private String cena;
	private String stan;
	private String koszt;
	private String marza;
	private String nrProduktu;
	private String ileSprzedanych;
	
	public Produkt(int id,String a, String b, String c, String d, String e, String f, String g){
		 this.id=id;
		 this.nazwa = a;
		 this.cena = b;
		 this.stan = c;
		 this.koszt = d;
		 this.marza = e;
		 this.nrProduktu = f;
		 this.ileSprzedanych = g;
	}
	
	public void setId(int index) {
        this.id = index;
    }
	
	public void setNazwa(String i) {
        this.nazwa = i;
    }
	public void setCena(String n) {
        this.cena = n;
    }
	public void setStan(String m) {
        this.stan = m;
    }
	public void setKoszt(String pes) {
        this.koszt = pes;
    }
	public void setMarza(String d1) {
        this.marza = d1;
    }
	public void setNumer(String dni) {
        this.nrProduktu = dni;
    }
	public void setIleSprzedanych(String d2) {
        this.ileSprzedanych= d2;
    }
	
	
	public int getId(){
		return this.id;
	}
	public String getNazwa() {
        return this.nazwa;
    }
	public String getCena() {
        return this.cena;
    }
	
	public String getStan() {
        return this.stan;
    }
	public String getKoszt() {
        return this.koszt;
    }
	public String getMarza() {
        return this.marza;
    }
	public String getNumer() {
        return this.nrProduktu;
    }
	public String getIleSprzedanych() {
        return this.ileSprzedanych;
    }
}
