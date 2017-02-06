/**
 * <p>
 * Copyright(c) @2017 TIANPING AUTO INSURANCE CO.,LTD.
 * </p>
 */
package com.axatp.java.se.study.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * <p>
 * description:网络编程学习
 * </p>
 * 
 * @author ex_liuruili
 * @since 2017年2月6日
 * @see
 */
public class SocketStudy {
    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
        final int length = 100;
        String host = "localhost";
        int port = 80;
        Socket[] socket = new Socket[length];
        for (int i = 0; i < length; i++) {
            socket[i] = new Socket(host, port);
            System.out.println("第" + (i + 1) + "次连接成功！");
        }
        Thread.sleep(3000);
        for (int i = 0; i < length; i++) {
            socket[i].close();
        }
    }
    
}
