package book;

public class BookData {

	private Long id;
	private String name;
	private String hp;
	private String tel;
	
	///////////////////////////////////////////////////
	
	public BookData() {									// Q. 작동 원인이 무었인지?  같은 메서드명 두개가 사용됨
		
	}
	
	public BookData(String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	public BookData(Long id,String name, String hp, String tel) {
		this(name, hp, tel);
		this.id = id;
	}
		
	///////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +"." + name + " " + hp + "\t" + tel ;
	}

	
	
	///////////////////////////////////////////////////
	
}
