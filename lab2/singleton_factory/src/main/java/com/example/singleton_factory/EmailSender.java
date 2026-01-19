package com.example.singleton_factory;

public class EmailSender implements MessageSender {

    private AppConfig config;

    public EmailSender() {
        this.config = AppConfig.getInstance();
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("\nGửi EMAIL:");
        System.out.println("   Server: " + config.emailServer);
        System.out.println("   Đến: " + recipient);
        System.out.println("   Nội dung: " + message);
        System.out.println("   Đã gửi email thành công!\n");
    }
}
