

public class Subject {
	private double nota;
	private String nameSubject;
	private double notaExamen;
	
	//Constructor
	public Subject(String nameSubject , double nota, double notaExamen ) {
		this.nameSubject = nameSubject;
		this.nota = nota;
		this.notaExamen = notaExamen;
	}
	
	public String studentAccepted() {
		if (this.notaExamen >= 6.5) {
			return "Student accepted";
		}
		return "Student not accepted";
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNotaExamen() {
		return notaExamen;
	}

	public void setNotaExamen(int notaExamen) {
		this.notaExamen = notaExamen;
	}

	
}
