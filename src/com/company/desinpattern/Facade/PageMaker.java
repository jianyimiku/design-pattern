package com.company.desinpattern.Facade;

import java.io.FileWriter;
import java.util.Properties;

/**
 * 对外暴露的简单窗口
 */
public class PageMaker {
    private PageMaker() {

    }


    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties properties = DataBase.getProperties("maildata");
            String userName = properties.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to" + userName + "'s page!");
            writer.paragraph(userName + "欢迎来到" + userName + "的主页");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr, userName);
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
