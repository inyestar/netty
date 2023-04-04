package org.inyestar.netty.echoserver;

import org.inyestar.netty.echoserver.server.EchoServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EchoServerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(EchoServerApplication.class, args);
        if (args.length != 1) {
            System.err.printf("Usage : %s <port>", EchoServer.class.getSimpleName());
        }
        int port = Integer.parseInt(args[0]);
        new EchoServer(port).start();
    }

}
