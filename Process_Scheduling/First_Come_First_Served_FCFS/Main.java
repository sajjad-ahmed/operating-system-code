package Process_Scheduling.First_Come_First_Served_FCFS;
/*  /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 *  ----------------------------------------------------------------------------------------------------------  *
 *  This java class(Main.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 *  Time: 9:16 PM 11/7/2017
 *  License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 *
 *  ----------------------------------------------------------------------------------------------------------  *
 *  © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 *  ---------------------------------------------------------------------------------------------------------- *
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Runner objR = new Runner();
        objR.InputValue();
        objR.ProcessRun();
        objR.PrintResult();
    }
}
