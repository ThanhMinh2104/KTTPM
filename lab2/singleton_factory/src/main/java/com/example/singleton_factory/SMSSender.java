package com.example.singleton_factory;

public class SMSSender implements MessageSender {

    private AppConfig config;

    public SMSSender() {
        this.config = AppConfig.getInstance();
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("\nGửi SMS:");
        System.out.println("   API: " + config.smsApiUrl);
        System.out.println("   Đến: " + recipient);
        System.out.println("   Nội dung: " + message);
        System.out.println("   ✓ Đã gửi SMS thành công!\n");
    }
}