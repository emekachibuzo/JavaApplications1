package com.practice;

public class Client {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println("89 :"+st.grade(89));
		System.out.println("79 :"+st.grade(79));
		System.out.println("69 :"+st.grade(69));
		System.out.println("59 :"+st.grade(59));
		System.out.println("49 :"+st.grade(49));
		System.out.println("-1 :"+st.grade(-1));
		System.out.println("120 :"+st.grade(120));

	}

}
