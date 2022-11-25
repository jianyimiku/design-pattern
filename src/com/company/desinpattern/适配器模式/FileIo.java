package com.company.desinpattern.适配器模式;

import java.io.IOException;

/**
 * @author ：sjq
 * @date ：Created in 2022/9/5 21:23
 * @description：Target角色 需要适配器实现的对象
 * @modified By：
 * @version: $
 */
public interface FileIo {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
