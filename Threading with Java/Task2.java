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

public class Task2
{
    public static void main(String[] args)
    {
        Thread_for_Task2 threadA = new Thread_for_Task2("Thread_A");
        Thread_for_Task2 threadB = new Thread_for_Task2("Thread_B");
        threadA.run();
        threadB.run();
        threadA.run();

    }
}
