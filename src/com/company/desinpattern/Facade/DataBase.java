package com.company.desinpattern.Facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

/**
 * 读取数据流程
 */
public class DataBase {
    private DataBase() {
    }

    /**
     * 模拟读取数据库操作
     *
     * @param dbName
     * @return
     */
    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".properties";
        Properties properties = new Properties();
        try {
            Path path = new File(fileName).toPath();
            InputStream inputStream = Files.newInputStream(path);
            properties.load(inputStream);
        } catch (Exception e) {
            // do something
            throw new RuntimeException(e);
        }
        return properties;
    }
}
