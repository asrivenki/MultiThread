# MultiThread
A small application in Java that shows the complete picture of mutlithread. Funtionalities like join, sleep, Thread group are implement. 

Application
-----------
1)There are 5 teams participating in the school zonal relay. Each team has 5 members. 
2)Total distance to be covered is 500 m.
3)The condition is that the first runner should complete 100m in the race. Then only the second runner in the group can start. Once the second runner completes, third runner can start. The logic is that "ith" member in the group can start only when (i-1)th member has completed 100m.
4)The winner is the group which completes all the 5 laps first.
5)The losing margin of loser is calculated as follows: If the loser is at lap 5, the losing margin is : 100 - distance_covered. So we can generalize the formula as: distance  = 500 - (threadcount*100) + (100 - distance);
6)All the losing margins are printed and the program terminates.

Language:
---------
Java

Concept:
--------
Multi-threading
