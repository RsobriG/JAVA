import java.util.ArrayList;
import java.time.LocalDate;

public class Pet {
	private String family;
	private String name;
	private int age;
	private int day;
	private int month;
	private int year;
	
	
	//Constructor
	public Pet(String name, String family) {
		this.name = name;
		this.family = family;
		
	}
	
	public Pet(String name, String family, int age) {
		this.name = name;
		this.family = family;
		this.age = age;
	}
	
	public Pet(String name, String family, int age, int day, int month, int year) {
		this.name = name;
		this.family = family;
		this.age = age;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	//Methods
	public void setNamePet() {
		this.name = name;
	}
	
	public String getNamePet() {
		return this.name;
	}

	public void setAgePet() {
		this.age = age;
	}
	
	public int getAgePet() {
		return this.age;
	}




}
