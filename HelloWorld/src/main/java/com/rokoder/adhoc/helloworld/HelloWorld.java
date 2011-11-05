package com.rokoder.adhoc.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by IntelliJ IDEA.
 * User: havexz
 * Date: 11/5/11
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {

    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public void print(String strToPrint)
    {
        logger.info("strToPrint={}", strToPrint);
        System.out.println(strToPrint);
    }
}
