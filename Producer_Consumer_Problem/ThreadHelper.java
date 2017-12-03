package Producer_Consumer_Problem;

/**
 * /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 * ----------------------------------------------------------------------------------------------------------  *
 * This java class(ThreadHelper.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 * Time: 12:15 AM 11/10/2017
 * License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 * <p>
 * ----------------------------------------------------------------------------------------------------------  *
 * © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 * ---------------------------------------------------------------------------------------------------------- *
 **/
public class ThreadHelper
{
    private Item contents;
    private boolean available = false;
    public static int item_count = 0;

    public synchronized Item get()
    {
        while (available == false)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(Item produced)
    {
        while (available == true)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
            }
        }
        contents = produced;
        available = true;
        notifyAll();
    }
}