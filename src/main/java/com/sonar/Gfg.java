package com.sonar;
// Java program to demonstrate
// Logger.info(String msg) method
   
import java.util.logging.Logger;
   
public class Gfg{
   
    public static void main(String[] args)
    {
   
        // Create a Logger
        Logger logger
            = Logger
                  .getLogger("com.api.jar");
   
        // Call info method
        logger.info("Welcome to gfg");
        logger.info("google of codes");
    }
}