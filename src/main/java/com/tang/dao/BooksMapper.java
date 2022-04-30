package com.tang.dao;

import com.tang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    // 增加一本书
    int addBooks(Books books);
    // 删除一本书
    int deleteBooks(@Param("bookID") int id);
    // 修改一本书
    int updateBooks(Books books);
    // 查询一本书
    Books queryBooks(@Param("bookID") int id);
    // 查询全部的书
    List<Books> selectBooks();

    // 查询书籍
    List<Books> queryBookName(@Param("queryBookName")String queryBookName);
}
