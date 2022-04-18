package telran.java41.book.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import telran.java41.book.model.Publisher;

@Repository
public interface PublisherRepository {

	List<String> findPublisherNameByAuthor(String authorName);

	Optional<Publisher> findById(String id);
	
	Publisher save(Publisher publisher);
}
