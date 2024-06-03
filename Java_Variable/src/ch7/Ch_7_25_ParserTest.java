package ch7;

interface Parseable {
	// 구문분석 작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParserManager {
	// 리턴타입이 Parseable인터페이
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		// 구문작업을 분석하는 코드를 넣는다.
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		// 구문작업을 분석하는 코드를 넣는다.
		System.out.println(fileName + " - HTML parsing completed.");
	}
}

public class Ch_7_25_ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}

}
