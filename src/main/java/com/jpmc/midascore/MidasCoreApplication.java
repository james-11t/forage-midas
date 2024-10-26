package com.jpmc.midascore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MidasCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MidasCoreApplication.class, args);
    }

    public class TransactionListener{
    @Kafkalistener (topics = "${kafka.topic.name}")
    public void listen(Transaction transaction)

    }

}
