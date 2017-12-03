package Producer_Consumer_Problem;

/**
 * /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 * ----------------------------------------------------------------------------------------------------------  *
 * This java class(Consumer.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 * Time: 12:16 AM 11/10/2017
 * License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 * <p>
 * ----------------------------------------------------------------------------------------------------------  *
 * © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 * ---------------------------------------------------------------------------------------------------------- *
 **/
public class Consumer extends Thread
{
    private ThreadHelper threadHelper;
    private int consumer_no;

    public Consumer(ThreadHelper c, int consumer_no)
    {
        threadHelper = c;
        this.consumer_no = consumer_no;
    }

    public void run()
    {
        Item value = null;
        while (true)
        {
            value = threadHelper.get();
            System.out.println("Consumer no " + this.consumer_no + " has consumed Product no " + value.item_id + " made by Producer no " + value.producer_id);
        }
    }
}