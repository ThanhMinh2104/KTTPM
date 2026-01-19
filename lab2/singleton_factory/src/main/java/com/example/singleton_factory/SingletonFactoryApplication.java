package com.example.singleton_factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonFactoryApplication {

	public static void main(String[] args) {

		System.out.println("===========================================");
		System.out.println("    HỆ THỐNG GỬI TIN NHẮN ĐƠN GIẢN");
		System.out.println("===========================================\n");

		// TEST 1: SINGLETON - Chỉ có 1 config
		System.out.println("TEST 1: SINGLETON PATTERN");
		System.out.println("-------------------------------------------");

		AppConfig config1 = AppConfig.getInstance();
		AppConfig config2 = AppConfig.getInstance();

		System.out.println("Config 1: " + config1.hashCode());
		System.out.println("Config 2: " + config2.hashCode());
		System.out.println("Giống nhau? " + (config1 == config2));
		System.out.println();

		// TEST 2: FACTORY - Tạo Email sender
		System.out.println("TEST 2: FACTORY - GỬI EMAIL");
		System.out.println("-------------------------------------------");

		MessageSender emailSender = SenderFactory.createSender("EMAIL");
		emailSender.send("user@gmail.com", "Xin chào!");

		// TEST 3: FACTORY - Tạo SMS sender
		System.out.println("TEST 3: FACTORY - GỬI SMS");
		System.out.println("-------------------------------------------");

		MessageSender smsSender = SenderFactory.createSender("SMS");
		smsSender.send("0912345678", "Mã OTP: 123456");

		// TEST 4: Gửi nhiều tin
		System.out.println("TEST 4: GỬI NHIỀU TIN NHẮN");
		System.out.println("-------------------------------------------");

		MessageSender sender1 = SenderFactory.createSender("EMAIL");
		sender1.send("nguyen.van.a@gmail.com", "Thông báo 1");

		MessageSender sender2 = SenderFactory.createSender("SMS");
		sender2.send("0987654321", "Thông báo 2");

		MessageSender sender3 = SenderFactory.createSender("EMAIL");
		sender3.send("tran.thi.b@gmail.com", "Thông báo 3");

		System.out.println("===========================================");
		System.out.println("    ✓ HOÀN THÀNH!");
		System.out.println("===========================================");

		System.out.println("\nKẾT LUẬN:");
		System.out.println("1. SINGLETON: AppConfig chỉ tạo 1 lần");
		System.out.println("2. FACTORY: Tự động tạo đúng loại sender");
		System.out.println("3. Dễ thêm loại mới (VD: Zalo, Telegram)");
	}

}
