package ch7;

class Time {
	private int hour, minute, second;
	Time(){}
	Time(int hour, int minute, int second){
	setHour(hour);
	setMinute(minute);
	setSecond(second);
	}
	public int getHour() { return hour; }
	public void setHour(int hour) {
		if(hour < 0 || 23 < hour) return;
		this.hour = hour;
	}
	
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if(minute < 0 || 59 < minute) return;
		this.minute = minute;
	}
	
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if(second < 0 || 59 < second) return;
		this.second = second;
	}
	public String toString() {
		return getHour() + ":" + getMinute() + ":" + getSecond();
	}
}
public class Ch_7_13_TimeTest {

	public static void main(String[] args) {

		Time t = new Time(21, 59, 59);
		t.setHour(t.getHour()+1); // 현재 시간보다 1시간 후로 변경한다.
		System.out.println(t);
		
	}

}
