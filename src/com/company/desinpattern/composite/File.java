package com.company.desinpattern.composite;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printAllFileNames() {
        printAllFileNames("");
    }

    @Override
    protected void printAllFileNames(String prefix) {
        System.out.println(prefix + "/" + this.name);
    }

    @Override
    public Integer getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
