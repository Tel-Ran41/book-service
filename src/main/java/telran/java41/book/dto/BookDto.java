package telran.java41.book.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class BookDto {
	Long isbn;
	String title;
	@Singular
	Set<AuthorDto> authors;
	String publisher;
}
