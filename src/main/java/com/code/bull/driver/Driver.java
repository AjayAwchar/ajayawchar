package com.code.bull.driver;

import org.testng.annotations.BeforeSuite;

public class Driver
{
    /**
     * This is class variable
     */

    private static String browser=null;
    private static String env=System.getProperty("env");
    @BeforeSuite
   public void setup()
    {
        envSetup();
        browser();
    }

    /**
     * This method is used to set env
     */
    public void envSetup()
    {
        if(env.equalsIgnoreCase("sit"))
        {
            env="SIT";
        }
        else if(env.equalsIgnoreCase("uat"))
        {
            env="UAT";
        }
        else if(env.equalsIgnoreCase("prod"))
        {
            env="PROD";
        }
        else
        {
            env="SIT";
        }

    }

    private void browser()
    {

    }
}
