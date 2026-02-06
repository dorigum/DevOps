package ex0206.array.goods;
/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods [] goodsArr = new Goods [10];
	public static int count;//0 배열방에 저장 객체의 개수 

   /**
	초기 데이터를 세팅하는 메소드
	String[][] data = new String[][]{
		{"A01" , "새우깡" , "2500" , "짜고 맛나다."},  //---> Goods 
		{"A02" , "고구마깡" , "3500" , "고구맛이고 달다."},  //---> Goods 
		{"A03" , "감자깡" , "5000" , "감자맛에 고소한맛."}, // ---> Goods 
		{"A04" , "허니버터칩" , "2200" , "달콤 하다."},
		{"A05" , "콘칩" , "3000" , "고소하다."}
		};
   */
	
	public void init(String [][] data) {
		for(int i=0; i<data.length; i++) {
			goodsArr[count++] = this.create(data[i]);
		}
		
		System.out.println("***초기화 완료***");
   } // 메소드 끝


   /**
      Goods를 생성해서 값을 설정하고 생성된 Goos를 리턴하는 메소드 
   */
   private Goods create(String [] row){ // {"A01" , "새우깡" , "2500" , "짜고 맛나다."}
	   Goods gd = new Goods();
	   gd.setCode(row[0]);
	   gd.setName(row[1]);
	   gd.setPrice(Integer.parseInt(row[2]));
	   gd.setExplain(row[3]);
	   
	   return gd;
   }

   /**
     등록(등록실패 - 중복인 경우, 배열의 길이 벗어난 경우)
	 @return : 
	 0이면 상품 코드 중복,
	 1이면 등록 성공, 
	 -1이면 배열의 길이 벗어남
   */
   public int insert(Goods goods){
	   // 1. 배열 길이 체크
	   if(goodsArr.length == count) return -1;
	   
	   // 2. 상품 코드 중복 체크
	   if(this.selectByCode(goods.getCode()) != null) return 0;
	   
	   // 3. 상품 등록 성공
	   goodsArr[count++] = goods;
	   return 1;
   }
   
   // 전체 상품 정보 조회하기
   public Goods[] selectAll( ){
	   return goodsArr;//
   }

   /**
     상품코드에 해당하는 상품 검색
	 @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	           없으면 null 리턴
   */
   public Goods selectByCode(String code){
	   for(int i=0; i<count; i++) {
		   Goods searchedGd = goodsArr[i];
		   
		   if(searchedGd.getName().equals(code)) {
			   return searchedGd;
		   }
	   }
	   
	   // 상품이 존재하지 않으면 null 반환
	   return null;
   }

   /**
    상품코드에 해당하는 가격, 설명 수정하기 
	@return : true면 수정 완료, false면 수정 실패
   */
   public boolean update(Goods goods){ // 수정하려는 코드, 변경값 - 가격, 설명
	   
	   return false;
   }
   
   // 상품 정보 삭제
//   public boolean delete(Goods goods) {
//	   return false;
//   }
}