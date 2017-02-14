/**
 * <p>
 * Copyright(c) @2017 TIANPING AUTO INSURANCE CO.,LTD.
 * </p>
 */
package com.axatp.java.se.study.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p>
 * description:
 * </p>
 * 
 * @author ex_liuruili
 * @since 2017年2月6日
 * @see
 */
public class Server {
    private int port = 1122;
    private ServerSocket serverSocket;

    public Server() throws Exception {
        serverSocket = new ServerSocket(port, 100);
        System.out.println("服务器启动!");
    }

    public void service() {
        while (true) {
            Socket socket = null;
            try {
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                byte[] bt = new byte[1024];
                int count = 1024;
                StringBuilder sb = new StringBuilder();
                while ((count = is.read(bt, 0, count)) != -1) {
                    sb.append(new String(bt, 0, count));
                }

                System.out.println("New connection accepted " + socket.getInetAddress() + ":" + socket.getPort());

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Server server = new Server();
        // Thread.sleep(60000*10);
        server.service();
    }
}
