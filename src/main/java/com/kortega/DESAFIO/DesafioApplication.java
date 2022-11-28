package com.kortega.DESAFIO;

import com.kortega.entities.Order;
import com.kortega.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan ({"com.kortega"})
public class DesafioApplication implements CommandLineRunner {

	@Autowired
    private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Codigo do Pedido ");
		int number = sc.nextInt();

		System.out.print("Digite o Valor Basico ");
		double basicPrice = sc.nextDouble();

		System.out.print("Digite o Valor do Desconto ");
		double discount = sc.nextDouble();

		Order order = new Order(number,basicPrice,discount);

		Double ValueTotal = orderService.total(order);

		System.out.println("Pedido código" + order.getCode());
		System.out.printf("Valor Total %.2f",ValueTotal);

		sc.close();

	}
}
