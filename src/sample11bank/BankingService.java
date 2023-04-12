package sample11bank;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankingService {

	private BankingRepository repo = new BankingRepository();
	
	// 신규 계좌 개설하기 기능
	/*
	 * 사용자가 입력한 신규 계좌정보를 전달받아 영속화계층을 통해 저장시키고, 개설된 계좌정보를 반환한다.
	 * 	반환타입: Account
	 * 	메서드명: createAccount
	 * 	매개변수: Account account
	 */
	public Account createAccount(Account account) {
		// 전달받은 계좌정보에 계좌상태, 개설일시를 저장한다.
		account.setStatus("사용중");
		account.setOpenDate(new Date());
		
		// 영속화 계층에 계좌정보를 전달하여 저장시킨다.
		repo.insertAccount(account);
		return account;
	}
	
	// 전계좌 조회하기
	/*
	 * 예금주명을 전달받아 해당 이름으로 개설된 모든 계좌정보를 조회해 반환한다.
	 * 	반환타입: List<Account>
	 * 	메서드명: getMyAllAccounts
	 * 	매개변수: String owner
	 */
	public List<Account> getMyAllAccounts(String owner) {
		return repo.getAllAccountsByOwner(owner);
	}
	
	// 계좌상세정보 조회하기
	/*
	 * 계좌번호와 비밀번호를 전달받아 계좌상세정보를 반환한다.
	 * 	반환타입: Account
	 * 	메서드명: getAccountDetail
	 * 	매개변수: int accNo, int pwd
	 */
	public Account getAccountDetail(int accNo, int pwd) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null) {
			return null;
		}
		if (account.getPassword() != pwd) {
			return null;
		}
		return account;
	}
	
	// 입금하기
	/*
	 * 계좌번호와 입금액을 전달받아 현재 잔액을 증가시킨다.
	 * 반환타입: boolean
	 * 메서드명: deposit
	 * 매개변수: int accNo, long amount
	 */
	public boolean deposit(int accNo, long amount) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null) {
			return false;
		}
		account.setBalance(account.getBalance() + amount);
		return true;
	}
	
	// 출금하기
	/*
	 * 
	 * 반환타입: boolean
	 * 메서드명: withdraw
	 * 매개변수: int accNo, int pwd, long amount
	 */
	public boolean withdraw(int accNo, int pwd, long amount) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null || account.getPassword() != pwd) {
			return false;
		}
		long balance = account.getBalance();
		if (balance < amount) {
			return false;
		}
		account.setBalance(balance - amount);
		return true;
	}
	
	// 비밀번호 변경하기
	/*
	 * 
	 * 반환타입:
	 * 메서드명:
	 * 매개변수:
	 */
	public boolean changePassword(int accNo, int currentPwd, int newPwd) {
		Account account = repo.getAccountByNo(accNo);
		if (account == null) {
			return false;
		}
		if (account.getPassword() != currentPwd) {
			return false;
		}
		account.setPassword(newPwd);
		return true;
	}
	
	// 해지하기
	/*
	 * 
	 * 반환타입:
	 * 메서드명:
	 * 매개변수:
	 */
	public Map<String, Object> expireAccount(int accNo, int pwd) {
		Map<String, Object> result = new HashMap<>();
		Account account = repo.getAccountByNo(accNo);
		
		if (account == null || account.getPassword() != pwd) {
			result.put("success", false);
			return result;
		}
		
		long interest = (long) (account.getBalance() * account.getInterestRate() * 5);
		result.put("success", true);
		result.put("no", accNo);
		result.put("owner", account.getOwner());
		result.put("balance", account.getBalance());
		result.put("interest", interest);
		result.put("amount", account.getBalance() + interest);
		repo.deleteAccount(accNo);
		return result;
	}

	// 양식
	/*
	 * 
	 * 반환타입:
	 * 메서드명:
	 * 매개변수:
	 */
}
