package ch9;

class Card {
	String kind;
	int number;
	Card (){
		this("space", 1);
	}
	Card (String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}
public class Ch_9_4_CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("Heart",2);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}

}
