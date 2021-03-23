package book;

import java.util.List;

public interface BookDao {

	public List<BookData> getList();
	public List<BookData> search(String keyword);
	public BookData get(Long id);
	public boolean insert(BookData data);
	public boolean update(BookData data);
	public boolean delete(Long id);
}
