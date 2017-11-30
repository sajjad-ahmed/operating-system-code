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

public class Thread_for_Task1 extends Thread
{

    public Thread_for_Task1(String name)
    {
        super(name);
    }
    public Thread_for_Task1(String name, int priority)
    {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run()
    {
        System.out.println(getName() + "....running");
        try
        {
            sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
