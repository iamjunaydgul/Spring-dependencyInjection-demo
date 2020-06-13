package com.iamjunaydgul.springframework.Spring_Framework;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
    SortingAlgorithem sortAlgorithem;
	public BinarySearch(SortingAlgorithem sortAlgo) {
		this.sortAlgorithem = sortAlgo;
	}

	public void searchNumber(ArrayList<Integer> numArr,int number) {
		int result= sortAlgorithem.sortAlgo(numArr);
		System.out.println(result);
	}
}
