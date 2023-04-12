package sample11bank;

import java.util.Date;

/**
 * 계좌정보를 표현하는 클래스다.
 * @author waffl
 *
 */
public class Account {

	private int no;
	private int password;
	private String owner;
	private long balance;
	private double interestRate;
	private String status;
	private Date openDate;
	private Date closeDate;
	
	public Account() {
	}
	
	public Account(int no, int password, String owner, long balance) {
		super();
		this.no = no;
		this.password = password;
		this.owner = owner;
		this.balance = balance;
		this.interestRate = .04;
		this.status = "사용중";
		this.openDate = new Date();
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
}
