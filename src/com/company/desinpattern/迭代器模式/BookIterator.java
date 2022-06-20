package com.company.desinpattern.迭代器模式;

/**
 * @author ：sjq
 * @date ：Created in 2022/2/26 5:35 下午
 * @description：
 * @modified By：
 * @version: $
 */
public class BookIterator implements Iterator<Books> {
    private BookShelf bookShelf;
    private int cur = 0;

    public BookIterator() {
    }

    public BookIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return cur < bookShelf.list.size();
    }

    @Override
    public Books next() {
        return bookShelf.list.get(cur++);
    }
}
