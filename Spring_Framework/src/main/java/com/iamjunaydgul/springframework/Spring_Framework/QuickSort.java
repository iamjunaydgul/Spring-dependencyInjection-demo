package com.iamjunaydgul.springframework.Spring_Framework;

import java.util.ArrayList;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingAlgorithem {

	@Override
	public int sortAlgo(ArrayList<Integer> numArr) {
		return 1;
	}
}
