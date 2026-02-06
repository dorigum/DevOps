package ex0206.array.goods;
public class  StartView{
	public static void main(String[] args) {
       String[][] data = new String[][] {
    	   {"A01", "새우깡", "2500", "짜고 맛나다."},  //---> Goods 
    	   {"A02", "고구마깡", "3500", "고구마맛이고 달다."},  //---> Goods 
    	   {"A03", "감자깡", "5000", "감자맛에 고소한맛."}, // ---> Goods 
    	   {"A04", "허니버터칩", "2200", "달콤하다."},
    	   {"A05", "콘칩", "3000" , "고소하다."}
    	};
    	
    	System.out.println("***** 프로그램 시작합니다. ********************");
    	
    	// int a = 100; -> StudentTest 참고, a가 어디다가 쓰는 건지 모르겠다ㅠ
    	GoodsService service = new GoodsService();
    	service.init(data);
    	
    	// 전체 상품 정보 출력
//    	Goods[] goodsArr = service.selectAll();
//    	EndView.printSelectAll(goodsArr);
    	
    	// 상품 등록하기
    	//System.out.println("---1. 상품 등록하기---");
    	
    	MenuView mv  = new MenuView(); // 전역 변수 초기화
    	mv.printMenu(data);
	}
}
