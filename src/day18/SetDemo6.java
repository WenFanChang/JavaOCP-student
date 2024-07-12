package day18;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetDemo6 {

	public static void main(String[] args) {
		// Set<> 泛型的應用
		Set<Exam> exams = new HashSet();
		exams.add(new Exam("VB", 80));
		exams.add(new Exam("Java", 90));
		exams.add(new Exam("C#", 70));
		System.out.println(exams);
		
		//球總分與最高分的科目
		int totalScore =0;
		Exam highScoreExam = null;
		
		for (Exam exam : exams) {
			totalScore += exam.getScore();
			if(highScoreExam == null || 
					exam.getScore().intValue() > highScoreExam.getScore().intValue()) {
				highScoreExam = exam;
				
			}
			
		}
		System.out.printf("總分: %d 最高分: %s%n", totalScore, highScoreExam.getSubject());
		
		//利用串流
		int totalScore2 = exams.stream()
							   .mapToInt(Exam::getScore)
							   .sum();
		Exam highScoreExam2 = exams.stream()
								   .max(Comparator.comparingInt(exam -> exam.getScore()))
								   .get();
		System.out.printf("總分: %d 最高分: %s%n", totalScore2, highScoreExam2.getSubject());
		
		Exam highScoreExam3 = exams.stream()
				   .max(new Comparator<Exam>() {

					@Override
					public int compare(Exam o1, Exam o2) {
						return o1.getScore() - o2.getScore();
						
					}
				})
				   .get();
		System.out.printf("總分: %d 最高分: %s%n", totalScore2, highScoreExam3.getSubject());
		
		Exam highScoreExam4 = exams.stream()
				   .max((o1,o2) -> o1.getScore() - o2.getScore())
				   .get();
		System.out.printf("總分: %d 最高分: %s%n", totalScore2, highScoreExam4.getSubject());
		

	}

}
