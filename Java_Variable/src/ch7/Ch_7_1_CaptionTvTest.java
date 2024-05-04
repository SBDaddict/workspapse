package ch7;
class Tv {
	Tv () {} // 기본 생성
	boolean power;
	int channel;
	
	void powre() { power = !power;}
	void channelUp() { ++channel;}
	void channelDoun() { --channel;}
	} // Tv class and

class CaptionTv extends Tv{
	CaptionTv() {} // 기본 생성
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
} // CaptionTv class and

public class Ch_7_1_CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
//		ctv.displayCaption("Hello, world");
		ctv.caption = true;
		ctv.displayCaption("Hello, world");
		
	}// main and

} // Ch_7_1_CaptionTvTest class and
