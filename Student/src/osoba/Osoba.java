package osoba;

public class Osoba {
	
	private String jmbg;

	public Osoba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Osoba(String jmbg) {
		super();
		this.jmbg = jmbg;
	}

	
	public String info( ) {
		return "Info Osoba: " + getJmbg();
	}
	  
	
	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	
	
}
