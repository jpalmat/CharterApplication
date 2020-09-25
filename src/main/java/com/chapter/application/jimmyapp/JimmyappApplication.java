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

		Customer customer1 = new Customer("Jimmy");
		customerRepository.save(customer1);

		Transactions transactions1 = new Transactions(90, 120, LocalDate.parse("2018-09-16"));
		transactions1.setCustomer(customer1);
		transactionRepository.save(transactions1);

//		customerRepository.save(new Customer("Javier", Arrays.asList(
//				new Transactions[]{
//						new Transactions(90, 120, LocalDate.parse("2018-09-16")),
//						new Transactions(90, 120, LocalDate.parse("2018-09-16"))
//				})));
	}
	/**
	 * new Transactions[]{
	 *                                     new Transactions(90, 120, LocalDate.parse("2018-09-16")),
	 *                                     new Transactions(90, 120, LocalDate.parse("2018-09-16"))
	 *                             }))
	 */
}
