package sample08list;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BookApp1 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 29000));
		
		StringJoiner joiner;
		for (Book book : books) {
			joiner = new StringJoiner(",");
			joiner.add(String.valueOf(book.getNo()));
			joiner.add(String.valueOf(book.getTitle()));
			joiner.add(String.valueOf(book.getWriter()));
			joiner.add(String.valueOf(book.getPrice()));
			System.out.println(joiner);
		}
	}
}
