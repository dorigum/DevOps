package ex0206.array.goods;

import java.util.Scanner;
/**
 키보드 입력을 받아 각 기능을 호출해줄 View
*/
public class MenuView {
	private Scanner sc = new Scanner(System.in);
	private GoodsService service = new GoodsService(); // 전역 변수 초기화

    // 전체 메뉴를 출력하는 메소드
	public void printMenu(String[][] data) {
		// 전달받은 초기 데이터를 서비스에 전달해서 배열에 저장한다.
		for(int i=0; i<data.length; i++) {

			}
		System.out.println("");
		//}
	//service.init(data);
			
	// int goodsCnt = 0;
	
	while(true) {
	  System.out.println("----------------------------------------------------------------------------");
	  System.out.println("1.등록     2.전체검색      3.상품코드검색    4. 수정하기     5. 삭제      9.종료");
	  System.out.println("----------------------------------------------------------------------------");

	  System.out.print("메뉴 선택 > ");
	  
	  int menuChoice = Integer.parseInt(sc.nextLine());

	  switch(menuChoice) {
	  	case 1 : // 상품 정보 등록
	  		System.out.println("등록 > ");
	  		this.inputInsert();
	  		break;
	  		
  		case 2 : // 전체 상품 조회
  			Goods[] goodsArr = service.selectAll(); 
  			EndView.printSelectAll(goodsArr);
  			break;
  			
  		case 3 : // 상품 코드 검색
  			this.inputSelectByCode();
  			break;
  			
  		case 4 : // 상품 정보 수정
  			this.inputUpdate();
  			break;
			
//		case 5 : (삭제하는 버튼 추가)
//			this.deleteCode();
// 			break;
			 
		case 9 : 
			 System.out.println("다음에 또 이용해주세요. 프로그램 종료합니다.");
			 System.exit(0);
			 break;
				 
			default: System.out.println("메뉴는 1~5 or 9만 입력해주세요.");

    	  } // witch 문} // while 문} // printMenu 끝
	}
}
	
	public void inputInsert() {
       // 키보드 입력 4개 받기 
	   System.out.print("상품 코드 > ");
	   String code = sc.nextLine();

	   System.out.print("상품 이름 > ");
	   String name = sc.nextLine();

	   System.out.print("상품 가격 > ");
	   int price = Integer.parseInt(sc.nextLine());

	   System.out.print("상품 설명 > ");
	   String explain = sc.nextLine();


	 //생성자를 추가하여 값을 전달하자(데이터 초기화) XXX
      // Goods goods = new Goods(); XXX

	   int result = service.insert(null);

	   if(result == -1)
		   EndView.printMessage("더 이상 상품을 등록할 수 없습니다.");
	   else if(result == 0)
		   EndView.printMessage(code + "는 중복이므로 등록할 수 없습니다.");
	   else
		   EndView.printMessage("상품이 등록되었습니다.");
	   }

  /**
    상품코드 검색 키보드 입력
  */
 public void inputSelectByCode(){
	 System.out.print("검색하려는 상품코드 > ");
	 String code = sc.nextLine();
	 
	 Goods goods = service.selectByCode(code);
	 
	 if(goods==null) {
		 EndView.printMessage(code+"는 잘못되어 검색할 수 없습니다.");
	 } else {
		 EndView.printSelectByCode(goods);
	  }
  }

  /**
    수정하기 키보드 입력 
  */
  public void inputUpdate(){
       // 키보드 입력 4개 받기 
	   System.out.print("수정하려는 상품 코드 > ");
	   String code = sc.nextLine();

	   System.out.print("변경 상품 가격 > ");
	   int price = Integer.parseInt(sc.nextLine());

	   System.out.print("변경 상품 설명 > ");
	   String explain = sc.nextLine();

	   //위 3개의 정보를 하나의 Goods 객체로 만든다.

	   if(service.update(null)){
		   EndView.printMessage("상품이 수정되었습니다.");
	   } else {
		   EndView.printMessage("상품이 수정되지 않았습니다.");
      } // 메소드끝
  }
}// 클래스끝