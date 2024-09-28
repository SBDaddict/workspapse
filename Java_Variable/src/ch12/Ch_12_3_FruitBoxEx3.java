package ch12;

import java.util.ArrayList;

class Fruit2 				{public String toString() {return "Fruit2";}}
class Apple2 extends Fruit2	{public String toString() {return "Apple2";}}
class Grape2 extends Fruit2	{public String toString() {return "Grape2";}}

class Juice	{
	
	String name;
	Juice(String name){this.name = name+"Juice";}
	public String toString() {return name;}
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box2) {
		String tmp = "";
		for(Fruit2 f : box2.getList()) 
			tmp += f+" ";
			return new Juice(tmp);
		
	}
}
public class Ch_12_3_FruitBoxEx3 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox2 = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox2 = new FruitBox2<Apple2>();
		
		fruitBox2.add(new Apple2());
		fruitBox2.add(new Grape2());
		appleBox2.add(new Apple2());
		appleBox2.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox2));
		System.out.println(Juicer.makeJuice(appleBox2));
		
		

	}

}

class FruitBox2<T extends Fruit2> extends Box2<T>{}

class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}