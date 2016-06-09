package com.book;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Library {
	
	private final List<Book> store = new ArrayList<Book>();
	 
	public void addBook(final Book book) {
		store.add(book);
	}
 
	/**
	 * The logic written after making test cases fail first
	 */
	public List<Book> findBooks(final Date from, final Date to) {
		Calendar end = Calendar.getInstance();
		end.setTime(to);
		end.roll(Calendar.YEAR, 1);
		List<Book> resultList = new ArrayList<Book>();
		for(Book book : store){
			if(from.before(book.getPublished()) && end.getTime().after(book.getPublished())){
				resultList.add(book);
			}
		}
		Collections.sort(resultList);
		return resultList;
	}
}
