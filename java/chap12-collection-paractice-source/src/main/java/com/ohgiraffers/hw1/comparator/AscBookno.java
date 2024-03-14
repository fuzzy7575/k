package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;


public class AscBookno implements Comparator <BookDTO> {

    @Override
    public int compare(BookDTO b1, BookDTO b2) {

        int result = 0;

        if(b1.getbNo() > b2.getbNo()) {
            result = 1;
        } else if(b1.getbNo() < b2.getbNo()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;

    }

}
