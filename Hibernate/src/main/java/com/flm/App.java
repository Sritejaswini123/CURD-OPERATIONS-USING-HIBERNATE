 package com.flm;

 import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "welcome to hibernate" );
        
        Student s = new Student();
        s.setId(200);
        s.setName("TEJA");
        s.setQualification("DEGREE ");
        
        Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml ");
        cfg.addAnnotatedClass(Student.class);
        
        
       
        org.hibernate.SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
      // WANT TO SEE THE PARTICULAR DATA OF ANAD WRITE THIS AND IN STUDENT CLASS ADD SOURCE-tostring  
       Student Anaddata = session.get(Student.class, 100);//read operation
       Anaddata.setQualification("phd"); //update
       session.update(Anaddata);
       System.out.println(Anaddata);
       // session.save (s);//to delete the data of the student in the sql
        
        //session.save(s)- to save the details in the sql
        session.getTransaction().commit();
        System.out.println("ok bye....!!!");
         
        
        
    }
}
