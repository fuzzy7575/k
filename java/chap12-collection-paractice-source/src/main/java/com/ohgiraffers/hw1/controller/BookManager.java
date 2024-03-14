package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.AscBookno;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class BookManager {


    private ArrayList<BookDTO> bookList;
    Scanner sc = new Scanner(System.in);

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void delete(int index) {
        bookList.remove(index);
    }

    public void searchBook(String btitle) {

        for(BookDTO book : bookList) {
            if(book.getTitle().contains(btitle)) {
                System.out.println(book);
            } else {
                System.out.println("조회된 도서가 목록에 없습니다.");
            }
        }

    }

    public void displayAll () {
        for(BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public List<BookDTO> sortedBookList(int type) {

        switch (type) {
            case 1 :
                bookList.sort(new AscBookno());
                break;
            case 2 :
                bookList.sort(new DescBookNo());
                break;
            case 3 :
                bookList.sort(new AscBookTitle());
                break;
            case 4 :
                bookList.sort(new DescBookTitle());
                break;
        }
        return bookList;

    }

    public void printBookList(List<BookDTO> printList) {

        for(BookDTO book : printList) {
            System.out.println(book);
        }

    }

}
