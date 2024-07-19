package pokemon.model.vo;

public class Pokemon {
	private int dNum;
	private String name;
	private String formal;
	private double height;
	private String group;
	private double weight;
	private String gender;
	//도감번호, 이름 ,속성 ,키,분류,몸무게,성별
	public Pokemon() {
		
	}
	
	public Pokemon(int dNum, String name, String formal, double height, String group, double weight, String gender) {
		
		this.dNum = dNum;
		this.name = name;
		this.formal = formal;
		this.height = height;
		this.group = group;
		this.weight = weight;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Pokemon정보 [NO." + dNum + ", 이름=" + name + ", 타입=" + formal + ", 평균 키=" + height + ", 분류="
				+ group + ", 평균 몸무게=" + weight + ", 성별=" + gender + "]";
	}

	public int getDNum() {
		return dNum;
	}

	public void setDNum(int dNum) {
		this.dNum = dNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormal() {
		return formal;
	}

	public void setFormal(String formal) {
		this.formal = formal;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
