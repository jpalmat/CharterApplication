package com.chapter.application.jimmyapp;

import com.chapter.application.jimmyapp.model.Customer;
import com.chapter.application.jimmyapp.model.Transactions;
import com.chapter.application.jimmyapp.repository.CustomerRepository;
import com.chapter.application.jimmyapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class JimmyappApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private TransactionRepository transactionRepository;

	public static void main(String[] args) {
		SpringApplication.run(JimmyappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepository.deleteAll();

		//customer 1
		Customer customer1 = new Customer("Jimmy");
		customerRepository.save(customer1);

		Transactions transactions1 = new Transactions(90, 120, LocalDate.parse("2020-09-16"));
		transactions1.setCustomer(customer1);
		transactionRepository.save(transactions1);

		Transactions transactions2 = new Transactions(40, 90, LocalDate.parse("2020-09-16"));
		transactions2.setCustomer(customer1);
		transactionRepository.save(transactions2);

		Transactions transactions3 = new Transactions(110, 130, LocalDate.parse("2020-10-16"));
		transactions3.setCustomer(customer1);
		transactionRepository.save(transactions3);

		Transactions transactions4 = new Transactions(90, 120, LocalDate.parse("2020-10-16"));
		transactions4.setCustomer(customer1);
		transactionRepository.save(transactions4);

		//customer 2
		Customer customer2 = new Customer("Javier");
		customerRepository.save(customer2);

		Transactions transactions5 = new Transactions(90, 120, LocalDate.parse("2020-01-16"));
		transactions5.setCustomer(customer2);
		transactionRepository.save(transactions5);

		Transactions transactions6 = new Transactions(40, 90, LocalDate.parse("2020-01-16"));
		transactions6.setCustomer(customer2);
		transactionRepository.save(transactions6);

		Transactions transactions7 = new Transactions(110, 130, LocalDate.parse("2020-02-16"));
		transactions7.setCustomer(customer2);
		transactionRepository.save(transactions7);

		Transactions transactions8 = new Transactions(90, 120, LocalDate.parse("2020-02-16"));
		transactions8.setCustomer(customer2);
		transactionRepository.save(transactions8);
	}
}
