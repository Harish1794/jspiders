package org.jspiders.bookapphibernate.dto;	
	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="books_table")
	public class BookDTO implements Serializable
	{
		@Id
		@Column(name="b_id")
		private int bookId;
		@Column(name="b_name")
		private String bookName;
		@Column(name="b_price")
		private double bookPrice;
		@Column(name="b_author")
		private String bookAuthor;
		
		public BookDTO() 
		{
			System.out.println("objected created");
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public double getBookPrice() {
			return bookPrice;
		}

		public void setBookPrice(double bookPrice) {
			this.bookPrice = bookPrice;
		}

		public String getBookAuthor() {
			return bookAuthor;
		}

		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}

		@Override
		public String toString() {
			return "BookDTO [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
					+ bookAuthor + "]";
		}
	}
