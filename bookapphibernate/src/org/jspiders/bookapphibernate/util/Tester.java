package org.jspiders.bookapphibernate.util;

import java.util.List;

import org.jspiders.bookapphibernate.dao.BookDAO;
import org.jspiders.bookapphibernate.dto.BookDTO;

public class Tester {
	public static void main(String[] args) {
		
//		insert operation
		/* BookDTO dto = new BookDTO();
			dto.setBookId(4);
			dto.setBookName("ramayan ");
			dto.setBookPrice(500.00);
			dto.setBookAuthor("kuvempu");
			BookDAO dao = new BookDAO();
			dao.insertBook(dto);
		*/
		
	/*	
		read operation
		BookDAO dao = new BookDAO();
		BookDTO dto= dao.fetchById(4);
		System.out.println(dto);
	*/
		/*
		 * update operation
		 * 
		 * 
			BookDAO dao=new BookDAO();
			dao.updatePriceById(2, 300.00);
		*/
		
		
		
		/* for getting only the books name.
		 * 
		 * BookDAO dao=new BookDAO();
		System.out.println((List)dao.getAllBOOkName());
		
		*
		*/
		
		 /*
		  * to get the entire table.
		  * 
		  * BookDAO dao=new BookDAO();
			System.out.println((List)dao.getList());
		*/
		
		
//		get book by id.
		 BookDAO dao=new BookDAO();
			System.out.println(dao.getBookById());
	}

}
