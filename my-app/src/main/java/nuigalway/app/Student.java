package nuigalway.app;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private String dob; //Date of birth
	private int id;
	private String username;
	private String courses;
	private ArrayList<Module> modRegistered = new ArrayList<Module>();
	
	//Constructor
	public Student() {
		
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.getName() + this.getAge();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public ArrayList<Module> getModRegistered() {
		return modRegistered;
	}

	public void setModRegistered(ArrayList<Module> modRegistered) {
		this.modRegistered = modRegistered;
	}
}
