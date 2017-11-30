package Lab3;

/**
 * /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 * ----------------------------------------------------------------------------------------------------------  *
 * This java class(Consumer.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 * Time: 12:16 AM 31/10/2017
 * License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 * <p>
 * ----------------------------------------------------------------------------------------------------------  *
 * © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 * ---------------------------------------------------------------------------------------------------------- *
 **/

public class Thread_for_Task2 extends Thread
{
    public static int c = 0;

    public Thread_for_Task2(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        System.out.println(getName()+" is running...");
        try
        {
            for (int i = 0; i < 10; i++, c++)
                System.out.println(c);
            sleep(1000);              //optional
        } catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
