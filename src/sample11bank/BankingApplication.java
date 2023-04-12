package sample11bank;

import static util.DateUtils.toText;

import java.util.List;
import java.util.Map;

import util.KeyboardReader;

public class BankingApplication {

	private KeyboardReader reader = new KeyboardReader();
	private BankingService service = new BankingService();
	
	public static void main(String[] args) {
		BankingApplication app = new BankingApplication();
		app.displayMenu();
	}
	
	public void displayMenu() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.전계좌 2.계좌상세 3.개설 4.입금 5.출금 6.비밀번호변경 7.해지 0.종료");
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		System.out.print("### 메뉴선택 > ");
		int menuNo = reader.readInt();
		System.out.println();
		
		switch (menuNo) {
		case 1:
			전계좌조회();
			break;
		case 2:
			계좌상세조회();
			break;
		case 3:
			신규계좌개설();
			break;
		case 4:
			입금();
			break;
		case 5:
			출금();
			break;
		case 6:
			비밀번호변경();
			break;
		case 7:
			계좌해지();
			break;
		case 0:
			프로그램종료();
			break;
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		displayMenu();
	}

	private void 전계좌조회() {
		System.out.println("<< 전체 계좌 조회>>");
		System.out.println("### 예금주명을 입력해 전체 계좌정보를 조회하세요.");
		
		// 계좌정보를 조회할 예금주명을 입력받는다.
		System.out.print("### 예금주: ");
		String owner = reader.readString();
		
		// BankingService객체의 getMyAllAccounts(String owner) 메서드로 전달해 호출한다.
		// 예금주명으로 조회된 계좌정보들을 List<Account> 객체로 반환받는다.
		List<Account> accounts = service.getMyAllAccounts(owner);
		
		if (accounts.isEmpty()) {
			System.out.println("### [" + owner + "]님 이름으로 등록된 계좌정보가 존재하지 않습니다.");
		} else {
			int i = 0;
			for (Account account : accounts) {
				i++;
				System.out.println(i + ". [계좌번호:" + account.getNo() + "][현재잔액:" + account.getBalance() + "]");
			}
		}
		
	}

	private void 계좌상세조회() {
		System.out.println("<< 계좌정보 상세조회 >>");
		System.out.println("### 계좌번호, 비밀번호를 입력하세요.");
		
		System.out.print("### 계좌번호: ");
		int no = reader.readInt();
		System.out.print("### 비밀번호: ");
		int password = reader.readInt();
		
		Account account = service.getAccountDetail(no, password);
		if (account == null) {
			System.out.println("### 계좌번호가 존재하지 않거나 비밀번호가 일치하지 않습니다.");
		} else {
			System.out.println("### 신규 개설 계좌정보");
			System.out.println("계좌번호: " + account.getNo());
			System.out.println("예금주명: " + account.getOwner());
			System.out.println("약정금리: " + account.getInterestRate() * 100 + "%");
			System.out.println("현재잔액: " + account.getBalance());
			System.out.println("계좌상태: " + account.getStatus());
			System.out.println("개설일시: " + toText(account.getOpenDate()));
		}
	}

	private void 신규계좌개설() {
		System.out.println("<< 신규 계좌 개설>>");
		System.out.println("### 신규 계좌 개설에 필요한 정보를 입력하세요.");
		
		System.out.print("### 계좌번호: ");
		int no = reader.readInt();
		System.out.print("### 비밀번호: ");
		int password = reader.readInt();
		System.out.print("### 예금주명: ");
		String owner = reader.readString();
		System.out.print("### 입금금액: ");
		long amount = reader.readLong();
		System.out.print("### 약정금리: ");
		double interestRate = reader.readDouble();
		
		// Account객체를 생성하여 입력한 계좌정보를 저장한다.
		Account account = new Account();
		account.setNo(no);
		account.setPassword(password);
		account.setOwner(owner);
		account.setBalance(amount);
		account.setInterestRate(interestRate);
		
		// BankingService객체의 createAccount(Account account) 메서드를 호출하여 신규계좌개설을 요청한다.
		Account savedAccount = service.createAccount(account);
		
		// 신규로 개설된 계좌정보를 화면에 출력한다.
		System.out.println();
		System.out.println("### 신규 개설 계좌정보");
		System.out.println("계좌번호: " + savedAccount.getNo());
		System.out.println("예금주명: " + savedAccount.getOwner());
		System.out.println("약정금리: " + savedAccount.getInterestRate() * 100 + "%");
		System.out.println("현재잔액: " + savedAccount.getBalance());
		System.out.println("계좌상태: " + savedAccount.getStatus());
		System.out.println("개설일시: " + toText(savedAccount.getOpenDate()));
		
		System.out.println("### 신규 계좌개설이 완료되었습니다.");
	}
	
	private void 입금() {
		System.out.println("<< 입금하기 >>");
		System.out.println("### 계좌번호와 입금액을 입력하세요.");
		
		System.out.print("### 계좌번호: ");
		int no = reader.readInt();
		System.out.print("### 입금액: ");
		long amount = reader.readLong();
		
		boolean isSuccess = service.deposit(no, amount);
		if (isSuccess) {
			System.out.println("### [" + no + "] 계좌에 [" + amount + "]원이 입금되었습니다.");
		} else {
			System.out.println("### 입력하신 계좌번호가 존재하지 않습니다.");
		}
	}

	private void 출금() {
		System.out.println("<< 출금하기 >>");
		System.out.println("### 계좌번호, 비밀번호, 출금액을 입력하세요.");
		
		System.out.print("### 계좌번호: ");
		int no = reader.readInt();
		System.out.print("### 비밀번호: ");
		int pwd = reader.readInt();
		System.out.print("### 출금액: ");
		long amount = reader.readLong();
		
		boolean isSuccess = service.withdraw(no, pwd, amount);
		if (isSuccess) {
			System.out.println("### [" + no + "] 계좌에서 [" + amount + "]원이 출금되었습니다.");
		} else {
			System.out.println("### 출금 중 오류가 발생하였습니다.");
		}
		
		
	}

	private void 비밀번호변경() {
		System.out.println("<< 비밀번호 변경하기 >>");
		System.out.println("계좌번호, 기존 비밀번호, 새 비밀번호를 입력하세요.");
		
		System.out.print("### 계좌번호: ");
		int no = reader.readInt();
		System.out.print("### 기존 비밀번호: ");
		int currentPwd = reader.readInt();
		System.out.print("### 새 비밀번호: ");
		int newPwd = reader.readInt();
		
		boolean isSuccess = service.changePassword(no, currentPwd, newPwd);
		if (isSuccess) {
			System.out.println("[" + no + "] 계좌의 비밀번호가 변경되었습니다.");
		} else {
			System.out.println("### 비밀번호 변경을 실패하였습니다.");
		}
	}

	private void 계좌해지() {
		System.out.println("<< 계좌 해지하기 >>");
		System.out.println("### 계좌번호, 비밀번호를 입력하세요.");

		System.out.print("### 계좌번호: ");
		int no = reader.readInt();
		System.out.print("### 비밀번호: ");
		int pwd = reader.readInt();
		
		Map<String, Object> result = service.expireAccount(no, pwd);
		if ((boolean) result.get("success")) {
			System.out.println("### 계좌가 해지되었습니다. 계좌 정보를 확인하세요.");
			System.out.println("계좌번호: " + no);
			System.out.println("예금주: " + result.get("owner"));
			System.out.println("잔액: " + result.get("balance"));
			System.out.println("이자: " + result.get("interest"));
			System.out.println("해지금액: " + result.get("amount"));
		} else {
			System.out.println("### 계좌 해지를 실패하였습니다.");
		}
	}

	private void 프로그램종료() {
		System.out.println("<< 프로그램 종료>>");
		System.exit(0);
	}
}
