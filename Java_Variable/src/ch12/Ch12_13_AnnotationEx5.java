package ch12;

import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 에너테이션은 무시
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class Ch12_13_AnnotationEx5 {
	public static void main(String[] args) {
		Class<Ch12_13_AnnotationEx5> cls = Ch12_13_AnnotationEx5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()="+ anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+ anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) 
			System.out.println("testTooles="+str);
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
		
		
	}
}

@Retention(RetentionPolicy.RUNTIME) //실행시에 사용가능하도록 지
@interface TestInfo{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

enum TestType{FIRST, FINAL}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
	String yymmdd();
	String hhmmss();
}