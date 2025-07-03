package step3.test;

import java.util.Date;

public class TestDateTime {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		//공란은 쿠키에서 허용하지 않음 , - 하이픈으로 대체 
		System.out.println(date.toString().replace(" ", "-"));
	}
}
