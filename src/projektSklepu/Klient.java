package projektSklepu;

public class Klient {
	private int id;
	private String imie;
	private String nazwisko;
	private String pesel;
	private String rabat;
	public Klient(int id,String a, String b, String d,String e){
		 this.id=id;
		 this.imie = a;
		 this.nazwisko = b;
		 this.pesel = d;
		 this.rabat = e;
	}
	
	public void setId(int index) {
        this.id = index;
    }
	
	public void setImie(String i) {
        this.imie = i;
    }
	public void setNazwisko(String n) {
        this.nazwisko = n;
    }

	public void setPesel(String pes) {
        this.pesel = pes;
    }
	
	public void setRabat(String rab) {
        this.rabat = rab;
    }
	
	
	public int getId(){
		return this.id;
	}
	public String getImie() {
        return this.imie;
    }
	public String getNazwisko() {
        return this.nazwisko;
    }
	public String getPesel() {
        return this.pesel;
    }
	
	public String getRabat() {
        return this.rabat;
    }
}
