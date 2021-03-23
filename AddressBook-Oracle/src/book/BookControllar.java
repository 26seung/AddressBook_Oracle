package book;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookControllar {

	Scanner sc = new Scanner(System.in);
	BookView view = new BookView();

	
	public void addressBook () {						// Q. protected / public 어떤것을 사용하는 것이 좋은 건지?
		
		while(true) {
			view.startView();
			view.menuView();
			
			
			switch (sc.nextInt()) {						// Q. 잘못된 값을 입력하였을때 에러 종료가 아닌 다시 시작하는 방법을 찾아보자
				case 1: // 조회
					view.listView();
					listData();
					continue;
				case 2: //등록
					view.addView();
					addData();
					continue;
				case 3: //삭제
					view.delView();
					delData();
					continue;
				case 4: //검색
					view.searchView();
					searchData();
					continue;
				case 5: //종료
					view.endView();
					break;
				default :	// 없는 메뉴
					view.erView();
					continue;
			}
			sc.close();
			break;
		}
		
	}
		///////////////////////////////////////////////////
		
	public void listData() {
		
		BookDao dao = new BookOracle();
		List<BookData> list = dao.getList();
		Iterator<BookData> it = list.iterator();
		
		while(it.hasNext()) {
			BookData data = it.next();
			System.out.printf("%d.%s %s\t %s\n", data.getId(), data.getName(), data.getHp(), data.getTel());
		}
	}
	
		///////////////////////////////////////////////////
			
	public void addData() {
		
		System.out.print(">이름: ");
		String name = sc.next();
		System.out.print(">휴대전화: ");
		String hp = sc.next();
		System.out.print(">집전화: ");
		String tel = sc.next();
		
		BookData data = new BookData(name,hp,tel);
		
		BookDao dao = new BookOracle();
		dao.insert(data);
		
	}
	
	///////////////////////////////////////////////////
	
	public void delData() {
		
		long bookId = sc.nextLong();
		
		BookDao dao = new BookOracle();
		dao.delete(bookId);
		
		
	}
	
	///////////////////////////////////////////////////
	
	public void searchData() {
		
		String keyword = sc.next();
		
		BookDao dao = new BookOracle();
		List<BookData> list = dao.search(keyword);
		
		Iterator<BookData> it = list.iterator();
		
		while (it.hasNext()) {
			BookData data = it.next();
			System.out.println(data);
		}
		
	}
	
	///////////////////////////////////////////////////
	
	
}
