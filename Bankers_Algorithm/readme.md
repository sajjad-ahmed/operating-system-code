# Banker’s Algorithm
The Banker's algorithm is run by the operating system whenever a process requests resources.
The algorithm avoids deadlock by denying or postponing the request if it determines that accepting the request could put the system in an unsafe state (one where deadlock could occur).
When a new process enters a system, it must declare the maximum number of instances of each resource type that it may ever claim; clearly, that number may not exceed the total number of resources in the system. Also, when a process gets all its requested resources it must return them in a finite amount of time.

# INPUT: // take input from file
———————————————————
4 // no. of processes
5 // no. of resources

1 1 2 1 3   // Max. resource Matrix

2 2 2 1 0

2 1 3 1 0

1 1 2 2 1



1 0 2 1 1    // Resource allocation Matrix

2 0 1 1 0

1 1 0 1 0

1 1 1 1 0




0 0 2 1 2    // resource available




# OUTPUT:
———————————————————
Need Matrix :
0 1 0 0 2

0 2 1 0 0

1 0 3 0 0

0 0 1 1 1



Safe sequence is :
D A C B
Change in available resource matrix :

1 1 3 2 2

2 1 5 3 3

3 2 5 4 3

5 2 6 5 3
