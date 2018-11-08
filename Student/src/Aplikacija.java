import osoba.Osoba;
import student.Profesor;
import student.Student;

public class Aplikacija {

	public static void main(String[] args) { 
		// Instanciranje studenta uz pomoc defaul construktora 

		Student tanja = new Student(); 

//		System.out.println("Ime: " + tanja.imePrezime); - nije preporucljivo ovako pristupati atributima iz klase 

//Dodavanje vrednosti preko setera u instanciran prazan objekat! 
//		System.out.println("Student: " + tanja.getImePrezime() + ", " + tanja.getBrojIndexa()); 
		tanja.setImePrezime("Tanja"); 
		tanja.setBrojIndexa("1/2018");
		tanja.setJmbg("0907985725012");
		System.out.println("Student: " + tanja.getImePrezime() + ", " + tanja.getBrojIndexa()); 

// Instanciranje objekta pomocu konstruktora sa prosledjenim vrednostima 
//		Student aleksandar = new Student("Aleksandar", "2/2018"); 
//		System.out.println("Student: " + aleksandar.getImePrezime() + ", " + aleksandar.getBrojIndexa()); 

		System.out.println("JMBG: " + tanja.getJmbg());
		
//Instanciranje samo sa delimicnim atributima 
//		Student milan = new Student("Milan"); 
//		System.out.println("Student: " + milan.getImePrezime() + ", " + milan.getBrojIndexa()); 
//		milan.setBrojIndexa("3/2018"); 
//		System.out.println("Student: " + milan.getImePrezime() + ", " + milan.getBrojIndexa()); 
	
//		Osoba o = new Osoba("1107973720018");
//		o.getJmbg();
		
		
		// Instanciranje Osoba kao Student i kastovanje Osoba u Student
		Osoba o = new Student("Djordje");	// polimorfizam, menjamo ponasanje Osoba u Student
		Student s = (Student) o;
		
//		Profesor p = (Profesor) o;	- ne mozemo da kastujemo jer ne nasledjuje isti tip ponasanja
		
		System.out.println(s.getImePrezime());
		
		Osoba osoba = new Osoba("33535453");
		System.out.println(osoba.info());
		
		Osoba student = new Student("Djordje");
		System.out.println(student.info());
		
		Osoba profesor = new Profesor ("Tanja");
		System.out.println(profesor.info());
		
	} 
} 