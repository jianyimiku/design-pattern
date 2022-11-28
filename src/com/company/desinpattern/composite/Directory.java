package com.company.desinpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 文件夹
 */
public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> arrayList = new ArrayList<>();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printAllFileNames() {
        printAllFileNames("");
    }

    protected void printAllFileNames(String prefix) {
        System.out.println(prefix + "/" + name);
        Iterator<Entry> iterator =
                arrayList.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printAllFileNames(this.name);
        }
    }

    @Override
    public Integer getSize() {
        int size = 0;
        Iterator<Entry> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return getName();
    }
}
