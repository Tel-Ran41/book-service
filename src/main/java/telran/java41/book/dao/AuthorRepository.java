package telran.java41.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java41.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
