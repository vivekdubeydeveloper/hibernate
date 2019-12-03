package com.vivek.myhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vivek.myhibernate.entity.UserDetails2;

/**
 * Hello world!
 *
 */
public class UserApp2 
{
    public static void main( String[] args )
    {
    	//create entity this is transient object not associated with session
    	UserDetails2 user=new UserDetails2();
    	user.setId(7);
    	user.setUserName("Mohan");
    	user.setDept("IT");
    	
    	
    	//read configuration and build session factory
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	//Read configuration File Explicitly
    	//SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	//open session
    	Session session=sf.openSession();
    	//begin transaction
    	session.beginTransaction();
    	//save user
    	session.save(user);
    	//user is persistent object associate with session
    	session.getTransaction().commit();
    	session.close();
    	//after session closed object is detached
    	
    	//close session factory
    	sf.close();
    }
}
