package Producer_Consumer_Problem;


/**
 * /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 * ----------------------------------------------------------------------------------------------------------  *
 * This java class(ProducerConsumerTest.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 * Time: 12:15 AM 11/10/2017
 * License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 * <p>
 * ----------------------------------------------------------------------------------------------------------  *
 * © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 * ---------------------------------------------------------------------------------------------------------- *
 **/
public class ProducerConsumerTest
{
    public static void main(String[] args)
    {
        ThreadHelper c = new ThreadHelper();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);

        Producer p2 = new Producer(c, 2);
        Consumer c2 = new Consumer(c, 2);

        Consumer c3 = new Consumer(c, 3);
        Producer p3 = new Producer(c, 3);

        p1.start();
        c1.start();

        p2.start();
        c2.start();

        p3.start();
        c3.start();
    }
}
