package com.rokoder.adhoc.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class HelloWorldMain {
    static Logger logger = LoggerFactory.getLogger(HelloWorldMain.class);

    public static void main(String[] args) {
        logger.info("Main started");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print("Hello World!");
        logger.info("Main finished");

    }
}
