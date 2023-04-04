package org.inyestar.netty.echoserver;

import org.inyestar.netty.echoserver.server.EchoServer;

public class EchoServerApplication {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.printf("Usage : %s <port>", EchoServer.class.getSimpleName());
        }
        int port = Integer.parseInt(args[0]);
        new EchoServer(port).start();
    }
}
