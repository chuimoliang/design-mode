package com.moliang.simple;

/**
 * @author zhang qing
 * @date 2021/8/3 21:08
 */
public class PoPoSenderFactory implements SenderFactory {

    @Override
    public Sender create() {
        return new PoPoSender();
    }

}
