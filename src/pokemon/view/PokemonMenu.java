package pokemon.view;

import java.util.Scanner;

import pokemon.controller.PokemonController;
import pokemon.model.vo.Pokemon;

public class PokemonMenu {
	//뭐할지 입력받고
	//뭐할지 정하는 애
	//포켓몬 검색
	//1. 이름으로 검색
	//2. 번호로 검색
	//3. 속성으로 검색
	//4. 모두 출력 (모은것만)
	//5. 포켓몬 등록
	private Scanner sc = new Scanner(System.in);
	private PokemonController pcr  = new PokemonController();
	
	public void inputMenu() {
		while(true) {
			System.out.println("==== 포켓몬 도감 ====");
			System.out.println("1. 이름으로 검색");
			System.out.println("2. 번호로 검색");
			System.out.println("3. 속성으로 검색");
			System.out.println("4. 한번에 보기");
			System.out.println("5. 포켓몬 등록");
			System.out.println("6. 포켓몬 삭제");
			System.out.println("7. 오늘의 포켓몬");
			System.out.println("메뉴번호 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				nameSearch();
				break;
			case 2:
				numSearch();
				break;
			case 3:
				fmSearch();
				break;
			case 4:
				allSearch();
				break;
			case 5:
				registerSearch();
				break;
			case 6:
				deleteMenu();
				break;
			case 7: 
				randomPokemon();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}
	public void nameSearch() {
		
		System.out.print("검색할 포켓몬 이름 : ");
		String name = sc.nextLine();
		
		pcr.nameSearch(name);
				
	}
	public void numSearch() {
		
		System.out.print("검색할 포켓몬 번호 : ");
		int num = sc.nextInt();
		
		pcr.numSearch(num);
		
	}
	public void fmSearch() {
		System.out.print("검색할 포켓몬 속성 : ");
		String formal = sc.nextLine();
		
		pcr.nameSearch(formal);
		
	}
	public void allSearch() {
		
	}
	public void registerSearch() {
		
	}
	public void deleteMenu() {
		
	}
	public void randomPokemon() {
		
	}
	
	
}	
