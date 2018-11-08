package student;

	import java.util.List;

	import osoba.Osoba;

	public class Profesor extends Osoba {

		private String imePrezime;
		private List<String> predmeti;
		
		public Profesor() {
			this.imePrezime = "NEMA";
		}
		
		@Override
		public String info() {
			// TODO Auto-generated method stub
			return " Info profesor " + getImePrezime();
		}
		
		public Profesor(String imePrezime) {
			this.imePrezime = imePrezime;
		}
				
		public Profesor(String imePrezime, List<String> predmeti) {
			super();
			this.imePrezime = imePrezime;
			this.predmeti = predmeti;
		}

		public String getImePrezime() {
			return imePrezime;
		}
		public void setImePrezime(String imePrezime) {
			this.imePrezime = imePrezime;
		}
		public List<String> getPredmeti() {
			return predmeti;
		}
		public void setPredmeti(List<String> predmeti) {
			this.predmeti = predmeti;
		}
		
		
	}
