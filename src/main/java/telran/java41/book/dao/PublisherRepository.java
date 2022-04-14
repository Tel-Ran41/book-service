package telran.java41.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java41.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {

}
