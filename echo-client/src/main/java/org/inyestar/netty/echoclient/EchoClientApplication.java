package org.inyestar.netty.echoclient;

import org.inyestar.netty.echoclient.client.EchoClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EchoClientApplication {

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(EchoClientApplication.class, args);
        if (args.length != 2) {
            System.err.printf("Usage : %s <host> <port>", EchoClient.class.getSimpleName());
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);
        new EchoClient(host, port).start();
    }

}
