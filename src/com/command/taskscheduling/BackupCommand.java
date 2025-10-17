package com.command.taskscheduling;

//Step 3: Concrete Commands
public class BackupCommand implements Command {
    private BackupService backupService;

    public BackupCommand(BackupService backupService) {
        this.backupService = backupService;
    }

    @Override
    public void execute() {
        backupService.backupDatabase();
    }
}