package oop.staticmethod;

public class StaticMethod {
	private static String value="abc";
	
	public StaticMethod() {
		
	}
	public StaticMethod(String value) {
		StaticMethod.value=value;
		
	}
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	public static void toUpper() {
		for(int i=0;i<value.length();i++) {
		
		}
	
	}
	

}
