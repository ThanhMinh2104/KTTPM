package com.example.singleton_factory;

public class SenderFactory {
    public static MessageSender createSender(String type) {

        if (type.equalsIgnoreCase("EMAIL")) {
            System.out.println("Factory tạo EmailSender");
            return new EmailSender();
        }
        else if (type.equalsIgnoreCase("SMS")) {
            System.out.println("Factory tạo SMSSender");
            return new SMSSender();
        }
        else {
            throw new IllegalArgumentException("Không có loại: " + type);
        }
    }
}