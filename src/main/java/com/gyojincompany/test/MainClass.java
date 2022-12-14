package com.gyojincompany.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student student1 = ctx.getBean("student1",Student.class);
		
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getAge());//30
		System.out.println(student1.getHobbys());//[운동, 노래, 게임]
		System.out.println(student1.getHeight());//180
		System.out.println(student1.getWeight());//80
		
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println(student2.getName());//김유신
		System.out.println(student2.getAge());//30
		System.out.println(student2.getHobbys());//[운동, 노래, 게임]
		System.out.println(student2.getHeight());//180
		System.out.println(student2.getWeight());//80
		
		Student student3 = ctx.getBean("student3",Student.class);
		
		System.out.println(student3.getName());//강감찬
		System.out.println(student3.getAge());//30
		System.out.println(student3.getHobbys());//[운동, 노래, 게임]
		System.out.println(student3.getHeight());//180
		System.out.println(student3.getWeight());//80
		
		ctx.close();
		
	}

}
