package library.entities;

import library.dao.impls.BookRepository;
import library.enums.RepoType;
import library.factory.RepositoryFactory;

import java.util.Date;

public class BookRent {
    private Integer id;
    private Integer bookId;
    private Integer studenId;
    private Date rentData;
    private Date expiredData;
    private Integer status;

    public BookRent(Integer id, Integer bookId, Integer studenId, Date rentData, Date expiredData, Integer status) {
        this.id = id;
        this.bookId = bookId;
        this.studenId = studenId;
        this.rentData = rentData;
        this.expiredData = expiredData;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getStudenId() {
        return studenId;
    }

    public void setStudenId(Integer studenId) {
        this.studenId = studenId;
    }

    public Date getRentData() {
        return rentData;
    }

    public void setRentData(Date rentData) {
        this.rentData = rentData;
    }

    public Date getExpiredData() {
        return expiredData;
    }

    public void setExpiredData(Date expiredData) {
        this.expiredData = expiredData;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Book book(){
//       CÁCH 1:
//        return ((BookRepository) RepositoryFactory.createRepository(RepoType.BOOK))
//                          .findOne(this.getBookId());

//      CÁCH 2:
        BookRepository br = new BookRepository();
        Book b = br.findOne(this.bookId);
        return b;
    }
}
