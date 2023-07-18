package example;

import org.testng.annotations.BeforeSuite;

public class JavaTesting
{
    public static void main(String[] args) {
        test();

    }

        public static void test()
        {
            String name = "Ajay";

            if (name.equalsIgnoreCase("rushi"))
            {
                System.out.println("chal gaya Rushi");
            }
            else if (name.equalsIgnoreCase("sachin"))
            {
                System.out.println("chal gaya Sachin");
            }
            else if (name.equalsIgnoreCase("ajay"))
            {
                System.out.println("chal gaya Ajay");
            }
            else
            {
                System.out.println("chal gaya Cricket");
            }


        }
    }

