package sample11bank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingRepository {

	/*
	 * Map<Integer, Account>는 계좌정보를 저장하는 객체다.
	 * 	key는 계좌번호(Integer)
	 * 	value는 계좌정보(Account)
	 */
	private	Map<Integer, Account> map = new HashMap<>();
	
	public BankingRepository() {
		map.put(100,  new Account(100, 1234, "김유신", 50000));
		map.put(200,  new Account(200, 1234, "김유신", 5000000));
		map.put(300,  new Account(300, 1234, "강감찬", 350000));
		map.put(400,  new Account(400, 1234, "강감찬", 1050000));
		map.put(500,  new Account(500, 1234, "이순신", 20050000));
	}
	
	// 저장기능
	/* 계좌정보객체를 전달받아 Map객체에 저장한다.
	 * 반환타입: void
	 * 메서드명: insertAccount
	 * 매개변수: Account account
	 */
	public void insertAccount(Account account) {
		map.put(account.getNo(), account);
	}
	
	// 조회기능
	/*
	 * 계좌번호를 전달받아 계좌번호에 해당하는 계좌정보를 반환한다.
	 * 반환타입: Account
	 * 메서드명: getAccountByNo
	 * 매개변수: int accNo
	 */
	public Account getAccountByNo(int accNo) {
		return map.get(accNo);
	}
	
	// 조회기능
	/*
	 * 예금주 이름을 전달받아 해당 이름으로 개설된 모든 계좌정보를 반환한다.
	 * 반환탕비: List<Account>
	 * 메서드명: getAllAccountsByOwner
	 * 매개변수: String owner
	 */
	public List<Account> getAllAccountsByOwner(String owner) {
		List<Account> accounts = new ArrayList<>();
		
		Collection<Account> values = map.values();
		for (Account account : values) {
			if (owner.equals(account.getOwner())) {
				accounts.add(account);
			}
		}
		return accounts;
	}
	
	// 변경기능
	/*
	 * 변경된 정보가 반영된 계좌정보를 전달받아 Map객체에 적용한다.
	 * 반환타입: void
	 * 메서드명: updateAccount
	 * 매개변수: Account account
	 */
	public void updateAccount(Account account) {
		
	}
	
	// 삭제기능
	/*
	 * 계좌번호를 전달받아 계좌번호에 해당하는 계좌정보를 삭제한다.
	 * 반환타입: void
	 * 메서드명: deleteAccount
	 * 매개변수: int accNo
	 */
	public void deleteAccount(int accNo) {
		map.remove(accNo);
	}
}
