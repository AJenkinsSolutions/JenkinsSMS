package jpa.SMS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.MenuService;
import jpa.service.StudentService;

/**
 * Hello world!
 *
 */
public class SMSRunner 
{
    public static void main( String[] args )
    {
        System.out.println( "Entry Point main()" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		System.out.println("**Successfully Opened Session**");
		
		Transaction trans = session.beginTransaction();
      
		//===================================//
		//Create Tables
//        Student std = new Student();
//        Course crs = new Course();
  
			MenuService menu = new MenuService();
					
			menu.runMenu(session);
        
//		
//        StudentDAO stdService = new StudentService();
//        	
//        Student student = stdService.getStudentByEmail("hluckham0@google.ru", session);
//
//        
//        stdService.registerStudentToCourse(student, session);
//		
////		stdService.getStudentByEmail("hluckham0@google.ru", session);
//	
//		stdService.getStudentCourses(student, session);
//       stdService.getAllStudents(session);
        
//        stdService.validateStudent(session);
        
        
        trans.commit();
        factory.close();
        session.close();
        	
    }
}
