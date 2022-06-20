package com.company.principle.dependenceinversion;

/**
 * @author ：sjq
 * @date ：Created in 2022/6/8 13:50
 * @description：接口隔离---有问题的方法
 * @modified By：
 * @version: $
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息:Hello World";
    }
}

/**
 * 完成Person接受消息的功能
 * 1 如果我们获取的对象是微信 短信等 那么我们也要在Person中增加对应的方法 很不方便
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
