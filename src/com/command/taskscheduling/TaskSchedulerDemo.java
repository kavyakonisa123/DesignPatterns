package com.command.taskscheduling;

//Step 5: Client
public class TaskSchedulerDemo {
 public static void main(String[] args) {
     EmailService emailService = new EmailService();
     BackupService backupService = new BackupService();

     Command email1 = new EmailCommand(emailService, "Welcome to our platform!");
     Command backup1 = new BackupCommand(backupService);
     Command email2 = new EmailCommand(emailService, "Your report is ready.");

     TaskScheduler scheduler = new TaskScheduler();
     scheduler.addTask(email1);
     scheduler.addTask(backup1);
     scheduler.addTask(email2);

     scheduler.runTasks();
 }
}