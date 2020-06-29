package animal;

public class AnimalMain {


	public static void main(String[] args) {
		Animal am=new Animal("호랑이","고양이과",5,4);
		Animal am2=new Animal("호랑이","고양이과",5,4);
		Animal am3=new Animal("늑대","개과",5,4);
		
		System.out.println(am.equals(am2));
		System.out.println(am.equals(am3));
		System.out.println(am2.equals(am3));
		
		System.out.println(am);
		System.out.println(am2);
		System.out.println(am3);

	}

}
