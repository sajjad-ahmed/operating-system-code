package Process_Scheduling.Round_Robin;

/**
 * /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/                      /\/:|_()`/
 * ----------------------------------------------------------------------------------------------------------  *
 * This java class(Runner.java) is created by SAJJAD AHMED NILOY  which belongs to CSE321 project.
 * Time: 9:20 PM 11/7/2017
 * License: CC BY-NC-SA 4.0 (Read more: https://creativecommons.org/licenses/by-nc-sa/4.0/)
 * <p>
 * ----------------------------------------------------------------------------------------------------------  *
 * © SAJJAD AHMED NILOY 2017 |  All rights reserved.
 * ---------------------------------------------------------------------------------------------------------- *
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner
{
    List<Process> allProcessArrayList = new ArrayList<>();
    List<Process> availableList = new ArrayList<>();
    int quantum = 4;
    ArrayList<String> sequence = new ArrayList<>();
    int n = 0;

    public void InputValue()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Number of Process:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println("Burst Time:");
            int btime = scanner.nextInt();
            Process process = new Process();
            process.burstTime = btime;
            process.id = i;
            allProcessArrayList.add(process);
        }
        availableList.addAll(allProcessArrayList);
    }


    public void ProcessRun() throws InterruptedException
    {
        for (int i = 0; isFinished(); i += 4)
        {
            if (availableList.size() != 0)
            {

                Process temp = availableList.remove(0);

                if (temp.burstTime < quantum)
                {
                    temp.burstTime = 0;
                    //do something
                } else

                {
                    temp.burstTime -= quantum;
                    availableList.add(temp);
                }
                for (Process p : allProcessArrayList)
                {
                    if (p.id == temp.id)
                    {
                        p.burstTime = temp.burstTime;
                    }
                }
                sequence.add(temp.id + "");
            } else break;
        }
    }


    public boolean isFinished()
    {
        int b = 0;
        for (Process p : allProcessArrayList)
        {
            if (p.burstTime == 0)
                b++;
        }
        if (b == allProcessArrayList.size())
            return false;
        else
            return true;
    }


    public void PrintSequence()
    {
        System.out.println("Process sequence: ");
        for (String ss : sequence)
        {
            System.out.println(ss);
        }
    }
}
