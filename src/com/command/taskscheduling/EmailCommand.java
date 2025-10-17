package com.command.taskscheduling;

//Step 3: Concrete Commands
public class EmailCommand implements Command {
    private EmailService emailService;
    private String message;

    public EmailCommand(EmailService service, String message) {
        this.emailService = service;
        this.message = message;
    }

    @Override
    public void execute() {
        emailService.sendEmail(message);
    }
}