package WS_03.com.ws03.dto;

public class SavingAccountDto extends AccountDto_05 {
	private int transferFee; // 이체 수수료

	public SavingAccountDto(int accountId, String accountNumber, int balance, int userId, int transferFee) {
		super(accountId, accountNumber, balance, userId);
		this.transferFee = transferFee;
	}

	@Override
	public String getAccountType() {
		return "자유 입출금 계좌";
	}

	// 캡슐화를 위한 getter, setter
	public int getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(int transferFee) {
		this.transferFee = transferFee;
	}
}