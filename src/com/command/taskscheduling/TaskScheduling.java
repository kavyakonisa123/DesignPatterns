package com.command.taskscheduling;
import java.util.LinkedList;
import java.util.Queue;

//Step 4: Invoker (Task Scheduler)
class TaskScheduler {
 private Queue<Command> taskQueue = new LinkedList<>();

 public void addTask(Command command) {
     taskQueue.offer(command);
     System.out.println("Task added to queue.");
 }

 public void runTasks() {
     System.out.println("\n Executing all scheduled tasks...\n");
     while (!taskQueue.isEmpty()) {
         Command task = taskQueue.poll();
         task.execute();
     }
 }
}