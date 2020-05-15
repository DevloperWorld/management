package nl.amis.demo.services.books_service.infrastructure.persistence;

import nl.amis.demo.services.books_service.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface BookRepository extends CrudRepository<Book, String> 
public interface BookRepository extends JpaRepository<Book, String> {
}

