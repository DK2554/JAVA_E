package animal;

public class AnimalMain {


	public static void main(String[] args) {
		Animal am=new Animal("ȣ����","����̰�",5,4);
		Animal am2=new Animal("ȣ����","����̰�",5,4);
		Animal am3=new Animal("����","����",5,4);
		
		System.out.println(am.equals(am2));
		System.out.println(am.equals(am3));
		System.out.println(am2.equals(am3));
		
		System.out.println(am);
		System.out.println(am2);
		System.out.println(am3);

	}

}
