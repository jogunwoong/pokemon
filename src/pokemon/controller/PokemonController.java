package pokemon.controller;

import pokemon.model.vo.Pokemon;

public class PokemonController {
	
	//menu 에서 시키는거 하는애
	//포켓몬 정보들 입력
	private Pokemon[] pokemonArray;
	Pokemon[] po = new Pokemon[1025];
	

	public PokemonController() {
		
		po[0] = new Pokemon(1, "이상해씨", "풀,독", 0.7, "씨앗포켓몬", 6.9, "남,여");
		po[1] = new Pokemon(2, "이상해풀", "풀,독", 1.0, "씨앗포켓몬", 13.0, "남,여");
		po[2] = new Pokemon(3, "이상해꽃", "풀,독", 2.0, "씨앗포켓몬", 100.0, "남,여");
		po[3] = new Pokemon(4, "파이리", "불꽃", 0.6, "도롱뇽포켓몬", 8.5, "남,여" );
		po[4] = new Pokemon(5, "리자드", "불꽃", 1.1, "화염포켓몬", 19.0, "남,여");
		po[5] = new Pokemon(6, "리자몽", "불꽃,비행", 1.7, "화염포켓몬", 90.5, "남,여");
		po[6] = new Pokemon(7, "꼬부기", "물", 0.5, "꼬마거북포켓몬", 9.0, "남,여");
		po[7] = new Pokemon(8, "어니부기", "물", 1.0, "거북포켓몬", 22.5, "남,여");
		po[8] = new Pokemon(9, "거북왕", "물", 1.6, "껍질포켓몬", 85.5, "남,여");
		
	}
	public Pokemon[] getPokemonArray() {
		return pokemonArray;
		
	}
	
	public void nameSearch(String name) {
		
		int j=0;
		
		for(int i = 0; i < po.length;i++) {
			if(po[i] != null) {
				if(po[i].getName().contains(name)) {
					System.out.println(po[i]);
					j++;
					break;
				}
			}else {
				if(j == 0) {
				System.out.println(name +"에 해당하는 포켓몬이 없습니다.");
				break;
				}else {
					break;
				}
			}
		}
	}
	public void numSearch(int num) {

		for (int i = 0; i < po.length; i++) {
			if(po[i] != null) {
				if(i == num) {
					System.out.println(po[i-1]);
					
					
				}
			}else {
				System.out.println(num +"번에 해당하는 포켓몬이 없습니다.");
				break;
			}
			break;
		}
	}
	public void fmSearch(String formal) {
		
		int j = 0;
		
		for(int i = 0; i < po.length; i++) {
			if(po[i] != null) {
				if(po[i].getFormal().contains(formal)){
					System.out.println(po[i]);
					j++;
					
				}
			}if(j == 0) {
				System.out.println(formal +"에 해당하는 포켓몬이 없습니다.");
				break;
				}else {
					break;
				}
			
		}
	}
	




	public String toString(int index) {
		
		
		return po[index].toString();
	}
	
	

}
