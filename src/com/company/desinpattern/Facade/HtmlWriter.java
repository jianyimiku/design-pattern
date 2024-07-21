package com.company.desinpattern.Facade;

import java.io.IOException;
import java.io.Writer;

/**
 * 流程中的写操作
 */
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 输出标题
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>");
    }

    // 输出段落
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }

    // 输出超链接
    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\"" + href + "\">" + caption + "</a>");
    }

    // 输出邮件地址
    public void mailto(String mailAddr, String userName) throws IOException {
        link("mailto:" + mailAddr, userName);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.flush();
        writer.close();
    }
}
