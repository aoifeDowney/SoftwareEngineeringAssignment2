package nuigalway.app;

import java.util.ArrayList;

public class Module {
	
	private String name;
	private String id;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
	
	//Constructor
	public Module() {
		
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
}
