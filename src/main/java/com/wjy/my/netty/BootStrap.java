package com.wjy.my.netty;

import com.wjy.my.netty.server.SimpleEchoServer;

public class BootStrap {

    public static void main(String[] args) {
        String ipAddr = "127.0.0.1";
        int port = 11111;
        new SimpleEchoServer(ipAddr, port).run();
    }
}
