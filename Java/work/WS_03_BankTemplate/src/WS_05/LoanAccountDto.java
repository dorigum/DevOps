package WS_05;

public class LoanAccountDto extends AccountDto_05 {
    private String collateral; // 대출 담보(캡슐화 적용)

    public LoanAccountDto(int accountId, String accountNumber, int balance, int userId, String collateral) {
        super(accountId, accountNumber, balance, userId); // 부모 생성자 호출
        this.collateral = collateral;
    }

    // 메소드 오버라이딩(Method Overriding)
    @Override
    public String getAccountType() {
        return "대출 계좌 (담보: " + this.collateral + ")";
    }
}