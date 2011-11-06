package com.rokoder.adhoc.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Just HelloWorld class
 *
 * @author havexz
 */
public class HelloWorld {

    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    /**
     * Prints the String passed as argument.
     *
     * @param strToPrint String to print on the console
     */
    public void print(String strToPrint) {
        logger.info("strToPrint={}", strToPrint);
        System.out.println(strToPrint);
    }
}
