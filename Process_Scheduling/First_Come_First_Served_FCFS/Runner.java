package Process_Scheduling.First_Come_First_Served_FCFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class Runner
{
    List<Process> PList = new ArrayList<>();
    int n = 0;

    public void InputValue()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Number of Process:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println("Process Time:");
            int time = scanner.nextInt();
            Process process = new Process();
            process.Time = time;
            process.Id = i;
            PList.add(process);
        }
    }

    public void ProcessRun() throws InterruptedException
    {

        int st = 0;
        int end = 0;
        for (int i = 0; i < PList.size(); i++)
        {
            PList.get(i).WaitTime = end;
            PList.get(i).StartTime = st;
            PList.get(i).EndTime = st + PList.get(i).Time;
            end = PList.get(i).EndTime;
            st = PList.get(i).EndTime;
        }
    }

    public void PrintResult()
    {
        for (int i = 0; i < PList.size(); i++)
        {
            System.out.println("------------------------------------");
            System.out.println("Id   Time   WaitT   StartT    EndT");
            System.out.println("------------------------------------");
            System.out.println(PList.get(i).Id + "     " + PList.get(i).Time + "      " + PList.get(i).WaitTime + "       " + PList.get(i).StartTime + "       " + PList.get(i).EndTime);

        }
    }
}
