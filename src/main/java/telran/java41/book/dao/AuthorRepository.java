package telran.java41.book.dao;

import java.util.Optional;

import telran.java41.book.model.Author;

public interface AuthorRepository{
	Optional<Author> findById(String id);
	
	Author save(Author author);
	
	void delete(Author author);
}
