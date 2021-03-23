package book;

public class BookView {

	public void startView() {
		System.out.println();
		System.out.println("************************************");
		System.out.println("*         전화번호 관리 프로그램         *");
		System.out.println("************************************");
		System.out.println();
	}
	
	public void menuView() {
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
		System.out.println("-------------------------------------");
		System.out.print("> 메뉴번호 : ");
	}
	
	public void endView() {
		System.out.println();
		System.out.println("************************************");
		System.out.println("               감사합니다              ");
		System.out.println("************************************");
	}
	
	public void listView() {
		System.out.println();
		System.out.println("<1. 리스트>");
	}
	
	public void addView() {
		System.out.println("<2.등록>");
		
	}
	
	public void delView() {
		System.out.println();
		System.out.println("<3.삭제>");
		System.out.print(">번호: ");
	}
	
	public void searchView() {
		System.out.println();
		System.out.println("<4.검색>");
		System.out.print(">이름: ");
	}
	
	public void erView() {
		System.out.println("[다시 입력해 주세요]");
		System.out.println();
	}
}
