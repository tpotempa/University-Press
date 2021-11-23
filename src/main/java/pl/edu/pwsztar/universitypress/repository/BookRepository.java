package pl.edu.pwsztar.universitypress.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pwsztar.universitypress.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByPublishingDateBefore(LocalDate publishingDate);
}