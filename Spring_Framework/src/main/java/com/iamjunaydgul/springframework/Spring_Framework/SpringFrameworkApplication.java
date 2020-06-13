package com.iamjunaydgul.springframework.Spring_Framework;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		/* SpringApplication.run(SpringFrameworkApplication.class, args); */
		/* BinarySearch binarySearch= new BinarySearch(new BubbleSort()); */

		ApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
		BinarySearch bean = context.getBean(BinarySearch.class);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		bean.searchNumber(arrayList, 3);

	}
}
