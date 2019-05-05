package org.jspiders.bookapphibernate.dao;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspiders.bookapphibernate.dto.BookDTO;
import org.jspiders.hibernateutility.singleton.SingletonFactory;

public class BookDAO {
	public void insertBook(BookDTO dto)
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(BookDTO.class);
		
		SessionFactory factory = 
				config.buildSessionFactory();
		
		Session session = 
				factory.openSession();
		
		Transaction tx = 
				session.beginTransaction();
		
		session.save(dto);
		tx.commit();
		
		System.out.println("Data inserted successfully");
		session.close();
		factory.close();
	}//end of insert 
	
	public BookDTO fetchById(int id)
	{
		Configuration configure = new Configuration().configure();
		SessionFactory factory= configure.buildSessionFactory();
		Session session=factory.openSession();
		BookDTO dto=session.get(BookDTO.class,id);
		session.close();
		factory.close();
		
		return dto;
	}
	
	public void updatePriceById(int id ,double price)
	{
		Configuration configure = new Configuration().configure();
		SessionFactory factory= configure.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = 
				session.beginTransaction();
		
		BookDTO dto =session.get(BookDTO.class, id);
		if(dto!=null)
		{
			dto.setBookPrice(price);
			session.update(dto);
		}
		else
		{
			System.out.println("id is not present");
			
		}
		tx.commit();
		session.close();
		factory.close();
	}
	
	
	public List getList()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();
		String hql = "select b from BookDTO b";
		Query query= session.createQuery(hql);
		List<BookDTO> list= query.list();
		session.close();
		return list;
		
	}
	public List  getAllBOOkName()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();
		String hql = "select b.bookName from BookDTO b";
		Query query= session.createQuery(hql);
		List<BookDTO> list= query.list();
		session.close();
		return list;
	}
	public String getBookById()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();
		String hql = "select b.bookName from BookDTO b where b.bookId=1";
		Query query= session.createQuery(hql);
	String s= (String) query.uniqueResult();		// for getting 1 value use query.uniqueResult()
		session.close();
		return s;
	}
}//end of class
