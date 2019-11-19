package nuigalway.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Test;

public class CourseProgrammeTest {

	@Test
    public void shouldGetAndSetCourseName()
    {
        final CourseProgramme course = new CourseProgramme();
        
        course.setName("Computer Science");
        
        assertEquals("Computer Science", course.getName());	        
    }
	
	@Test
    public void shouldGetAndSetCourseStudents()
    {
        final CourseProgramme course = new CourseProgramme();
        final ArrayList<Student> students = new ArrayList<Student>();
        
        course.setStudents(students);
        
        assertEquals(students, course.getStudents());	        
    }
	
	@Test
    public void shouldGetAndSetCourseModules()
    {
        final CourseProgramme course = new CourseProgramme();
        final ArrayList<Module> modules = new ArrayList<Module>();
        
        course.setModules(modules);
        
        assertEquals(modules, course.getModules());	        
    }
	
	@Test
    public void shouldGetAndSetCourseStartDate()
    {
        final CourseProgramme course = new CourseProgramme();
        final Calendar date = Calendar.getInstance();
        date.set(2019, 9, 1);
        
        course.setStartDate(date);
        
        assertEquals(date, course.getStartDate());	        
    }
	
	@Test
    public void shouldGetAndSetCourseEndDate()
    {
        final CourseProgramme course = new CourseProgramme();
        final Calendar date = Calendar.getInstance();
        date.set(2020, 5, 8);
        
        course.setEndDate(date);
        
        assertEquals(date, course.getEndDate());	        
    }
}
