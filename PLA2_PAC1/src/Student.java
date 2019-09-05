import java.time.LocalDate;
import java.util.ArrayList;


public class Student extends Person {
	private int day;
	private int month;
	private int year;
	private ArrayList<Subject> Subjects;
	
	
	//Constructor
	public Student(String userName, String userSurname, int userAge) {
		super(userName, userSurname, userAge);
		this.day = 0;
		this.month = 0;
		this.year = 0;
		
		this.Subjects = new ArrayList<Subject>();
		
	}
	
	public Student(String userName, String userSurname, int userAge, int day, int month, int year) {
		super(userName, userSurname, userAge);
		this.day = day;
		this.month = month;
		this.year = year;
		this.Subjects = new ArrayList<Subject>();
		
	}
	
	
	//Methods
	public boolean adult() {
		if (this.age >= 18) {
			return true;
		}
		return false;
	}
	
	public String passwordStudent() {
		String passW;
		char first = this.userName.charAt(0);
		char last = this.userSurname.charAt(0);
		passW = Character.toString(first) + this.userID() + Character.toString(last);
		
		return passW;
	}
	
	public void birthdayStudent() {
		LocalDate fecha = LocalDate.now();
		
		if (this.year == fecha.getYear()) {
			if (this.month == fecha.getMonthValue()) {
				if (this.day == fecha.getDayOfMonth()){
					System.out.println("today is your birthday");
				}else {
					System.out.println("today is not your birthday");
				}
			}else {
				System.out.println("today is not your birthday");
			}
		}else {
			System.out.println("today is not your birthday");
		}
	}

	public ArrayList<Subject> getArray(){
		return Subjects;
	}
	
	public void setSubjects(ArrayList<Subject> Subjects) {
		this.Subjects = Subjects;
	}
	
	private String userID() {
		String identification;
		
		identification = Integer.toString(this.day) + Integer.toString(this.month) + Integer.toString(this.year);
		
		return identification;
	}
	
	public void addSubjects(Subject subjectToAddToArray, int nota) {
		//EN FABRICACIÓN
		
	}
	
	public int ponderNotes() {
		int notaDeTall=0;
		int notaExam = 0;
		
		for(Subject i : this.getArray()) {
			notaDeTall += i.getNota();
			
		}
		
		notaDeTall = ((notaDeTall*40)/100)+((notaExam*60)/100);

		return notaDeTall;
	}
	
	public String imprimirStudent() {
		super.imprimirPerson();
		return "\n ID: " + this.userID();
	}
}
