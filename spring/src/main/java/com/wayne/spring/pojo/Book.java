package com.wayne.spring.pojo;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author wayne
 */
@Slf4j
public class Book {
    private List<String> bookList;

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    /**
     * 展示所有书籍
     */
    public void showBooks(){
        bookList.forEach(book->log.info("{}",book));
    }
}
