package com.code.dsaalgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaAlgoApplication {

	public static void main(String[] args) {
		System.out.println("fibonocci");
		long s = System.currentTimeMillis();
		System.out.println(new Recursion().fibonocci(50));
		long e = System.currentTimeMillis();
		System.out.println("recursion time: "+ (e-s));
		long s1 = System.currentTimeMillis();
		System.out.println(new Recursion().fiboIterative(50));
		long e1 = System.currentTimeMillis();
		System.out.println("iterative time: "+ (e1-s1));
		SpringApplication.run(DsaAlgoApplication.class, args);
	}

}
