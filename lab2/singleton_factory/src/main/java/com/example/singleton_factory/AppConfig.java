package com.example.singleton_factory;

public class AppConfig {
    private static AppConfig instance;

    public String emailServer = "smtp.gmail.com";
    public String smsApiUrl = "https://sms-api.com";

    private AppConfig() {
        System.out.println("AppConfig được khởi tạo!");
    }

    // Method để lấy instance
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}
