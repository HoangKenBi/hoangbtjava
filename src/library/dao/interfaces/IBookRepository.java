package library.dao.interfaces;

import library.entities.Book;

import java.util.ArrayList;

public interface IBookRepository {
    ArrayList<Book> all();
    boolean create(Book book) throws Exception;
    boolean update(Book book) throws Exception;
    boolean delete(Book book) throws Exception;
    Book findOne(Integer id);
}
