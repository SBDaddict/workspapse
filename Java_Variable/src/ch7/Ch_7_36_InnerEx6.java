package ch7;

public class Ch_7_36_InnerEx6 {
Object iv = new Object() {void method(){}}; // 익명 클래스
static Object cv = new Object() {void method(){}}; // 익명 클래스

void myMethod() {
	Object iv = new Object() {void method() {}}; // 익명 클래스
}
}
