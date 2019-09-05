
public class Person {
	//Atributos
	private String name;
	private String surname;
	private int age;
	
	//Constructor
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	
	//Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge () {
		return age; 	
	}
	
	public String imprimirPerson() {
		return "Name: " + this.name +
				"\nSurname: " + this.surname +
				"\nAge: " + this.age;
	} 
}
