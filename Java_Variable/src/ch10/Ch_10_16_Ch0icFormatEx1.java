package ch10;

import java.text.ChoiceFormat;

public class Ch_10_16_Ch0icFormatEx1 {

	public static void main(String[] args) {
		double[] limits = {60, 70, 80, 90}; // 낮은값에서 큰값 순서로 적어야 한다.
		String[] grades = {"D","C","B","A"};
		
		int[] score = {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(limits, grades);
		
		for (int i = 0 ; i < score.length ; i++) {
			System.out.println(score[i]+ ":" + form.format(score[i]));
		}
		
	}

}