package day18;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo8 {

	public static void main(String[] args) {
		// Set 排序使用 TreeSet
		Exam java = new Exam("Java", 90);
		SortedSet<Exam> exams = new TreeSet<>();
		exams.add(new Exam("VB", 80));
		exams.add(new Exam("Javascript", null));
		exams.add(new Exam("Java", 90));
		exams.add(new Exam("Pascal", -40));
		exams.add(new Exam("Python", null));
		exams.add(new Exam("C#", 70));
		// 1.印出所有成績資料
		System.out.println(exams);
		
		// 2.移除 score = null 或 score < 0的元素
		exams.removeIf(exam -> exam.getScore() == null || exam.getScore().intValue() < 0);
		System.out.println(exams);
		
		// 3.最後根據分數由大到小印出 (例如:Java:90, VB:80, C#:70)
		Comparator<Exam> comparator = (o1, o2) -> o2.getScore() - o1.getScore();
		SortedSet<Exam> exam2 = new TreeSet<>(comparator);
		exam2.addAll(exams);
		System.out.println(exam2);
		
		java.setScore(100);
		System.out.println(exams);
		System.out.println(exam2);

	}

}
