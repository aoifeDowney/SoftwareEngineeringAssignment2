package nuigalway.app;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StudentTest {
	
	 @Test
	    public void shouldGetAndSetStudentName()
	    {
	        final Student student = new Student();
	        
	        student.setName("Aoife");
	        
	        assertEquals("Aoife", student.getName());	        
	    }
	 
	 @Test
	    public void shouldGetAndSetStudentAge()
	    {
	        final Student student = new Student();
	        
	        student.setAge(21);
	        
	        assertEquals(21, student.getAge());	        
	    }
	 
	 @Test
	    public void shouldGetAndSetStudentDOB()
	    {
	        final Student student = new Student();
	        
	        student.setDob("21/07/1998");
	        
	        assertEquals("21/07/1998", student.getDob());       
	    }
	 
	 @Test
	    public void shouldGetAndSetStudentId()
	    {
	        final Student student = new Student();
	        
	        student.setId(123456);
	        
	        assertEquals(123456, student.getId());	        
	    }
	 
	 @Test
	    public void shouldGetAndSetStudentUsername()
	    {
	        final Student student = new Student();
	        
	        student.setName("Aoife");
	        student.setAge(21);
	        student.setUsername("Aoife21");
	        
	        assertEquals("Aoife21", student.getUsername());	        
	    }
	 
	 @Test
	    public void shouldGetAndSetCourse()
	    {
	        final Student student = new Student();
	        
	        student.setCourses("GY350");
	        
	        assertEquals("GY350", student.getCourses());	        
	    }
	 
	 @Test
	    public void shouldGetAndSetModules()
	    {
	        final Student student = new Student();
	        ArrayList<Module> modules = new ArrayList<Module>();
	        
	        student.setModRegistered(modules);
	        
	        assertEquals(modules, student.getModRegistered());	        
	    }
}
