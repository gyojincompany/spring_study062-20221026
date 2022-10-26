package com.gyojincompany.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1 = ctx.getBean("student1",Student.class);
		
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getAge());//30
		System.out.println(student1.getHobbys());//[운동, 노래, 게임]
		System.out.println(student1.getHeight());//180
		System.out.println(student1.getWeight());//80
		
	}

}
