package WS_03.com.ws03.service;

import java.util.List;

/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */
import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public interface BankService {
	// final은 고정값 = 값 변경 불가(반드시 초기화 필수)
	final int ACCOUNT_SIZE = 10;
	/** 계좌 최대 개수 */
	final int USER_SIZE = 5;
	/** 고객 최대 개수 */

	int ACCOUNT_CURRENT_SIZE; // 0 /** 현재 계좌의 개수 - 저장된 계좌의 수 */
	int USER_CURRENT_SIZE; // 0 /**현재 고객의 개수 - 저장된 고객의 수 */

	UserDto[] userList;// null-> 주소값
	AccountDto[] accountList; // null

	/*
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다.
	 */
	public BankService() {
		// 배열 생성
		userList = new UserDto[USER_SIZE]; // 5
		accountList = new AccountDto[ACCOUNT_SIZE]; // 10

		userList.add(new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false));
		userList.add(new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true));
		userList.add(new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false));

		accountList.add(new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000));

		accountList.add(new SavingAccountDto(10, "00100101001001", 500, 111, 100));

		accountList.add(new LoanAccountDto(60, "00600606006006", 500, 333, "House"));
		accountList.add(new LoanAccountDto(30, "00300303003003", 0, 111, "Building"));

		accountList.add(new SavingAccountDto(70, "00700707007007", 500, 333, 200));

		accountList.add(new LoanAccountDto(50, "00500505005005", 200, 222, "Car"));
		accountList.add(new SavingAccountDto(40, "00400404004004", 1000, 222, 50));

		System.out.println("-----세팅완료!!-----");

	} // 생성자 끝

	/*
	 * 특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다.
	 */
	public List[] getAccountList(int userSeq) { // 100
		list<ABV searchAccountCount = 0; // 인수로 전달된 userSeq에 해당하는 계좌의 개수를 체크

		// 리턴해서 나갈 배열의 개수를 미리 알아내여 선언하기 위해 반복문 필요
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].getUserSeq() == userSeq) {
				// 찾았다!!
				searchAccountCount++;
			}
		}

		// 위에서 찾은 정보를 바탕으로 AccountDto배열에서 계좌정보를 찾아서 리턴해준다.
		// 찾은 고객의 계좌의 수만큼 배열을 생성해서 그 배열을 리턴
		if (searchAccountCount == 0)
			return null;

		AccountDto[] searchAccountDtoList = new AccountDto[searchAccountCount];

		int count = 0;
		for (int i = 0; i < ACCOUNT_CURRENT_SIZE; i++) {
			if (accountList[i].getUserSeq() == userSeq) {
				searchAccountDtoList[count++] = accountList[i];
			}
		}

		return searchAccountDtoList;

	/*
	 * 특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	 * 
	 * @param : 고객의 sequence
	 * @return : null이면 고객의정보없다
	 */

//	public List <AccountDto> getAccountListSortByUserSeq()) {
//			List<AcountDto> shallowCopyList = new ArrayList<AccountDto>(accountList);
//			
//			Collections.sort(shallowCopyList,
//					(a, b) -> a.getUserSeq() == b.getUserSeq() ?
//							  b.getBalance() - a.getBalance() : a.getUserSeq() - b.getUserSeq());
//			
//			return shallowCopyList;
}