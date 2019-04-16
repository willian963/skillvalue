package com.rackerrank.gradingStudents;

public class GradingStudents {

	public static void main(String[] args) {
		int[] ar = new int[] { 73, 67, 38, 33};
		gradingStudents(ar);
	}

	static int[] gradingStudents(int[] grades) {
		if(null != grades && grades.length > 0){
			for(int i = 0; i < grades.length; i++){
				int grade = grades[i];
				while(grade%5 != 0){
					grade++;
				}
				if(grade - grades[i] < 3 && grade >= 40){
					grades[i] = grade;
				}
			}
		}
		for(int i:grades){
			System.out.println(i);
		}
		return grades;
	}
}
