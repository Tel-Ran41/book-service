package telran.java41.book.service;

import telran.java41.book.dto.AuthorDto;
import telran.java41.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);

	BookDto findBookByIsbn(Long isbn);

	BookDto removeBook(Long isbn);

	BookDto updateBook(Long isbn, String title);

	Iterable<BookDto> findBooksByAuthor(String authorName);

	Iterable<BookDto> findBooksByPublisher(String publisherName);

	Iterable<AuthorDto> findBookAuthors(Long isbn);

	Iterable<String> findPublishersByAuthor(String authorName);

	AuthorDto removeAuthor(String authorName);
}
