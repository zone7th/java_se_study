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
 * description:Socket网络编程
 * </p>
 * 
 * @author ex_liuruili
 * @since 2017年2月6日
 * @see
 */
public class Client {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        //Socket 请求
        connectServer();
    }

    /**
     * 
     * <p>
     * description:
     * </p>
     * 
     * @author ex_liuruili
     * @throws IOException 
     * @throws UnknownHostException 
     * @see
     */
    private static void connectServer() throws UnknownHostException, IOException {
        final int length = 100;
        String host = "localhost";
        int port = 1122;
        Socket[] socket = new Socket[length];
        for (int i = 0; i < length; i++) {
            socket[i] = new Socket(host, port);
            System.out.println("第" + (i + 1) + "次连接成功！");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (int i = 0; i < length; i++) {
            socket[i].close();
        }
    }
}
