package com.company.desinpattern.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/26 5:37 下午
 * @description：书架
 * @modified By：
 * @version: $
 */
public class BookShelf {
    List<Books> list;

    {
        list = new ArrayList<>();
    }

//    public List<Books> getList() {
//        return list;
//    }

    public boolean addBook(Books books) {
        return list.add(books);
    }

    public Iterator<Books> bookIterator() {
        return new BookIterator(this);
    }
}
