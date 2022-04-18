package telran.java41.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.java41.book.model.Book;

public interface BookRepository{
	
	Stream<Book> findByAuthorsName(String name);
	
	Stream<Book> findByPublisherPublisherName(String publisherName);
	
	void deleteByAuthorsName(String name);

	boolean existsById(Long id);

	Book save(Book book);
	
	Optional<Book> findById(Long id);
	
	void delete(Book book);

}
