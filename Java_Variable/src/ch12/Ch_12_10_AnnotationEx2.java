package ch12;

class NewClass{
	int newField;
	int getNewField() {return newField;}
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {return oldField;}
	
}

public class Ch_12_10_AnnotationEx2 {
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		nc.oldField = 10;
	System.out.println(nc.getOldField());	
	}
	
}
