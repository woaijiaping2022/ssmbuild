package com.tang.service;

import com.tang.dao.BooksMapper;
import com.tang.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService{

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBooks(Books books) {
        return booksMapper.addBooks(books);
    }

    @Override
    public int deleteBooks(int id) {
        return booksMapper.deleteBooks(id);
    }

    @Override
    public int updateBooks(Books books) {
        return booksMapper.updateBooks(books);
    }

    @Override
    public Books queryBooks(int id) {
        return booksMapper.queryBooks(id);
    }

    @Override
    public List<Books> selectBooks() {
        return booksMapper.selectBooks();
    }

    @Override
    public List<Books> queryBookName(String queryBookName) {
        return booksMapper.queryBookName(queryBookName);
    }
}
