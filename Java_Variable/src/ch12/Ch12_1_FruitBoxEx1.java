package ch12;

import java.util.ArrayList;

class Fruit implements Eatable 
						  {public String toString(){return "Fruit";}}

class Apple extends Fruit {public String toString(){return "Apple";}}
class Grape extends Fruit {public String toString(){return "Grape";}}
class Toy				  {public String toString(){return "Toy";}}

interface Eatable{}

public class Ch12_1_FruitBoxEx1 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러 타입 불일치
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // ok void add(Fruit item);
		fruitBox.add(new Grape()); // ok void add(Fruit item);
		
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
//		appleBox.add(new Toy()); // 에러 Box<Apple> 에는 Apple만 담을 수 있음
//		appleBox.add(new Grape()); // 에러 다형성 Apple 과 Grape는 관계없음
		
//		toyBox.add(new Apple()); 에러 Box<Toy> 에는 Toy만 담을 수 있음
		
		System.out.println("fruitBox - "+fruitBox);
		System.out.println("appleBox - "+appleBox);
		System.out.println("grapeBox - "+grapeBox);

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
