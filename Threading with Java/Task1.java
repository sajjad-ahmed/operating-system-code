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
public class Task1
{
    public static void main(String[] args)
    {
        Thread_for_Task1[] threadT1Array = new Thread_for_Task1[5];

        System.out.println("\nInitializing threads ......");
        for (int i = 0; i < threadT1Array.length; i++)
        {

            threadT1Array[i] = new Thread_for_Task1("Thread_" + i, i+1);
        }
        System.out.println("\n\nRunning threads ......");
        for (Thread_for_Task1 aThreadT1Array : threadT1Array)
        {
            aThreadT1Array.run();
        }
        System.out.println("\n\nChecking child threads ......");
        for (Thread_for_Task1 aThreadT1Array : threadT1Array)
        {
            System.out.println(aThreadT1Array.getName() + " status: " + aThreadT1Array.isAlive());
        }
    }
}
