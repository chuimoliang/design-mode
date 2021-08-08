package com.moliang.simple;

/**
 * @author zhang qing
 * @date 2021/8/3 21:09
 */
public class MailSenderFactory implements SenderFactory {

    @Override
    public Sender create() {
        return new MailSender();
    }

}
