package animal;

public class Animal {
	private String name;
	private String species;
	private int life;
	private int legs;
	
	public Animal() {}
	public Animal(String name,String species,int life,int legs) {
		this.name=name;
		this.species=species;
		this.life=life;
		this.legs=legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	//동등비교를 위한 equals()메소드 오버라이딩 처리하기
	@Override
	public boolean equals(Object obj) {
		if(this.species.equals(((Animal)obj).getSpecies())
			&&this.legs==((Animal)obj).getLegs()
			&&this.life==((Animal)obj).getLife()) 
{
			return true;
		}else {
		return false;
		}
	}
	@Override
	public String toString() {
		return name+species+life+legs;
	}
	

}
