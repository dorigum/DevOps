package ex0206.array.goods;
/**
  요청 결과를 출력할 view
*/
public class EndView{
   /**
     성공 여부 메시지를 출력하는 메소드 
   */
   public static void printMessage(String message){
      System.out.println(message+"\n");
   }

   /**
     전체 검색 결과를 출력하는 메소드
   */
   public static void printSelectAll(Goods[] goodsArr){ // service 에 있는 주소가 전달되었다.
	   System.out.println("***상품 정보 조회하기***");
	   
	   for(int i=0; i<GoodsService.count; i++) {
		   //System.out.println("상품 코드 : % | ", goodsArr.getCode());
	   }
   }

   /**
     상품코드에 해당하는 상세정보 출력하는 메소드 
   */
   public static void printSelectByCode(Goods goods){
  
   }


}