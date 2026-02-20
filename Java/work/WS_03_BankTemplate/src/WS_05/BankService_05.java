package WS_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankService_05 {
	// 캡슐화: 리스트 변수들을 private으로 보호
	private List<UserDto> userList;
	private List<AccountDto> accountList;

	public BankService() {
        userList = new ArrayList<UserDto>(); 
        accountList = new ArrayList<AccountDto>(); 

        userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
        userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
        userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
        
        // 다형성(Polymorphism) 적용: AccountDto 타입의 리스트에 다양한 형태의 자식 객체를 추가
        accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
        
        accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
        
        accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
        accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
        
        accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
        
        accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
        accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
    }
	
}