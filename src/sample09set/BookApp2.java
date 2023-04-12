package sample09set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import sample08list.Book;

public class BookApp2 {

	public static void main(String[] args) {
		Set<Book> books = new HashSet<>();

		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 35000));
		books.add(new Book(103, "Do it! 점프 투 파이썬", "박응용", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(104, "혼자 공부하는 파이썬", "윤인성", 21000));
		books.add(new Book(105, "모던 자바스크립트", "이웅모", 42000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));

		// 101번 책을 삭제하기 -> java.util.ConcurrentModificationException
//		for (Book book : books) {
//			System.out.println("책번호: " + book.getNo());
//			if (book.getNo() == 101) {
//				books.remove(book);
//				break; // 필수
//			}
//		}

//		Iterator<Book> itr = books.iterator();
//		while (itr.hasNext()) {
//			Book book = itr.next();
//			System.out.println("책번호: " + book.getNo());
//			if (book.getNo() == 101) {
//				itr.remove();
//			}
//		}
		
		// 책 번호가 짝수인 책정보를 삭제하기
		Iterator<Book> itr = books.iterator();
		
		while (itr.hasNext()) {
			Book book = itr.next();
			if (book.getNo() % 2 == 0) {
				System.out.println(book.getNo() + " 삭제");
				itr.remove();
			}
		}

		System.out.println("저장된 객체의 개수: " + books.size());

	}
}
