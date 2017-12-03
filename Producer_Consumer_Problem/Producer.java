package Producer_Consumer_Problem;

/**
 * /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 * ----------------------------------------------------------------------------------------------------------  *
 * This java class(Producer.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 * Time: 12:17 AM 11/10/2017
 * License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 * <p>
 * ----------------------------------------------------------------------------------------------------------  *
 * © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 * ---------------------------------------------------------------------------------------------------------- *
 **/
public class Producer extends Thread
{
    private ThreadHelper threadHelper;
    private int producer_no; //producer name

    public Producer(ThreadHelper c, int producer_no)
    {
        threadHelper = c;
        this.producer_no = producer_no;
    }

    public void run()
    {
        while (true)
        {
            Item item = new Item(++ThreadHelper.item_count, this.producer_no);
            System.out.println("Producer number " + item.producer_id + " has produced itemno " + item.item_id);
            threadHelper.put(item);

            try
            {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
