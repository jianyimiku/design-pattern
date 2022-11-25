package com.company.desinpattern.适配器模式;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ：sjq
 * @date ：Created in 2022/9/5 21:25
 * @description：
 * @modified By：
 * @version: $
 */
public class FileProperties implements FileIo{
    /**
     * 根据现有的稳定的类实现Target的功能 适配器模式
     */
    private Properties properties;

    {
        properties = new Properties();
    }
    @Override
    public void readFromFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        properties.load(fileInputStream);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream,"写入文件");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
