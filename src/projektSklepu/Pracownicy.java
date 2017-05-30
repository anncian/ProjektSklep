package projektSklepu;



class Pracownik {
	private int id;
	private String imie;
	private String nazwisko;
	private String pesel;
	private String dniWolne;
	private String stanowisko;
	private String pensja;
	
	public Pracownik(int id,String a, String b, String d, String f, String h, String j){
		 this.id=id;
		 this.imie = a;
		 this.nazwisko = b;
		 this.pesel = d;
		 this.dniWolne = f;
		 this.stanowisko = h;
		 this.pensja = j;
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
	
	public void setDni(String dni) {
        this.dniWolne = dni;
    }
	
	public void setStanowisko(String st) {
        this.stanowisko = st;
    }
	public void setPensja(String pens) {
        this.pensja = pens;
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
	
	public String getDniWolne() {
        return this.dniWolne;
    }
	
	public String getStanowisko() {
        return this.stanowisko;
    }
	
	public String getPensja() {
        return this.pensja;
    }
}

/*public class Pracownicy {
	
}
*/