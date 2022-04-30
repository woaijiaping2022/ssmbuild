package com.tang.service;
import com.tang.pojo.Books;
import java.util.List;

public interface BooksService {
    // 增加一本书
    int addBooks(Books books);
    // 删除一本书
    int deleteBooks(int id);
    // 修改一本书
    int updateBooks(Books books);
    // 查询一本书
    Books queryBooks(int id);
    // 查询全部的书
    List<Books> selectBooks();

    // 查询书籍
    List<Books> queryBookName(String queryBookName);
}
