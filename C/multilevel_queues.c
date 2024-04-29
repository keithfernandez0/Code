/* 
 * Keith Michelangelo Fernandez
 * Kean University
 * ID: 1209266
 * Email: fernkayl@kean.edu
 * CPS 3250 Section 03, Spring 2024
 * Due date: 04/29/2024
 * 
 * File name: multilevel_queues.c
 * Editor: VSCode with C/C++ extensions
 * Apple clang version 14.0.0 (clang-1400.0.29.202)
 * Target: x86_64-apple-darwin21.6.0
 * Thread model: posix
 * Directory: /Library/Developer/CommandLineTools/usr/bin
 * 
 * General command: gcc -fdiagnostics-color=always -g mutlilevel_queues.c -o mutlilevel_queues -lncurses 
 * 
 * Program description: 
 * This is a C-style implementation of Multilevel Queue Scheduling. When compiled,
 * the user will be prompted for the number of processes to simulate, arrival time,
 * burst time, and a queue number. A terminal-based Gantt chart is then generated
 * in a seperate terminal based window using a basic implementation of the ncurses library.
 */

#include <stdio.h>
#include <stdlib.h>
#include <ncurses.h>

#define MAX_PROCESSES 10
#define MAX_QUEUES 3

struct Process {
    int id;
    int arrival_time;
    int burst_time;
    int queue_number;
    int completion_time;
};

/* 
 * Calculate the completion time for each process using multi-level queue scheduling.
 * 
 * Parameters:
 * processes: an array of Process structs representing the processes
 * num_processes: the number of processes
 */
void calc_completion(struct Process processes[], int num_processes) {
    int current_time = 0;
    int remaining_processes = num_processes;
    int queue[MAX_QUEUES][MAX_PROCESSES];
    int front[MAX_QUEUES] = {0};
    int rear[MAX_QUEUES] = {0};
    int time_quantum[MAX_QUEUES] = {4, 8, 12};

    for (int i = 0; i < num_processes; i++) {
        int q = processes[i].queue_number;
        queue[q][rear[q]++] = i;
    }

    while (remaining_processes > 0) {
        for (int q = 0; q < MAX_QUEUES; q++) {
            if (front[q] != rear[q]) {
                int process_index = queue[q][front[q]];
                int burst = processes[process_index].burst_time;
                int execute_time = (burst < time_quantum[q]) ? burst : time_quantum[q];
                current_time += execute_time;
                processes[process_index].burst_time -= execute_time;

                if (processes[process_index].burst_time == 0) {
                    processes[process_index].completion_time = current_time;
                    remaining_processes--;
                }

                for (int i = front[q]; i < rear[q] - 1; i++) {
                    queue[q][i] = queue[q][i + 1];
                }

                rear[q]--;
                queue[q][rear[q]++] = process_index;
            }
        }
    }
};

/* 
 * Display the Gantt chart showing process IDs, arrival times, completion times, and turnaround times.
 *
 * Parameters:
 * processes: an array of Process structs representing the processes
 * num_processes: the number of processes
 */
void display_chart(struct Process processes[], int num_processes) {
    initscr();
    printw("Gantt Chart:\n");
    printw("----------------------------------------------------------------\n");
    printw("| Process ID | Arrival Time | Completion Time | Turnaround Time |\n");
    printw("----------------------------------------------------------------\n");

    for (int i = 0; i < num_processes; i++) {
        printw("|     %3d    |      %3d     |       %3d       |       %3d       |\n",
            processes[i].id, 
            processes[i].arrival_time, 
            processes[i].completion_time,
            processes[i].completion_time - processes[i].arrival_time);
    }
    printw("----------------------------------------------------------------\n");
    refresh();
    getch();
    endwin();
};

int main() {
    int num_processes;
    struct Process processes[MAX_PROCESSES];

    printf("\n");
    printf("Enter the number of processes: ");
    scanf("%d", &num_processes);
    printf("\n");

    for (int i = 0; i < num_processes; i++) {
        printf("Process %d\n", i + 1);
        processes[i].id = i + 1;
        printf("---------\n");
        printf("Arrival Time: ");
        scanf("%d", &processes[i].arrival_time);
        printf("Burst Time: ");
        scanf("%d", &processes[i].burst_time);
        printf("Queue Number: ");
        scanf("%d", &processes[i].queue_number);
        printf("\n");
    }

    calc_completion(processes, num_processes);
    display_chart(processes, num_processes);

    return 0;
};
