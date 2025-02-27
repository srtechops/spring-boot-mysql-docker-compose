package in.srtechops.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.srtechops.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
