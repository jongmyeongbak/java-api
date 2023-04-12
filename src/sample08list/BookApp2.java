package sample08list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringJoiner;

public class BookApp2 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 35000));
		books.add(new Book(103, "Do it! 점프 투 파이썬", "박응용", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(104, "혼자 공부하는 파이썬", "윤인성", 21000));
		books.add(new Book(105, "모던 자바스크립트", "이웅모", 42000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		
		Collections.sort(books);
		Collections.sort(books, (b1, b2) -> b1.getPrice() - b2.getPrice());
		Collections.sort(books, (b1, b2) -> b1.getWriter().compareTo(b2.getWriter()));
		// 가격순, 가격이 동일하면 제목순으로 정렬
//		Collections.sort(books, new Comparator<Book>() {
//			public int compare(Book o1, Book o2) {
//				int gap = o1.getPrice() - o2.getPrice();
//				if (gap == 0) {
//					return o1.getTitle().compareTo(o2.getTitle());
//				}
//				return gap;
//			}
//		});
		
		books.sort((b1, b2) -> {
			int gap = b1.getPrice() - b2.getPrice();
			if (gap == 0) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
			return gap;
		});
		
		StringJoiner joiner;
		for (Book book : books) {
			System.out.print(book.hashCode());
			joiner = new StringJoiner(",");
			joiner.add(String.valueOf(book.getNo()));
			joiner.add(String.valueOf(book.getTitle()));
			joiner.add(String.valueOf(book.getWriter()));
			joiner.add(String.valueOf(book.getPrice()));
			System.out.println(joiner);
		}
	}
}
