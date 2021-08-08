package com.moliang.simple;

/**
 * @author zhang qing
 * @date 2021/8/3 21:06
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("send a mail");
    }

}
