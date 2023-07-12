package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// vector - 멀티 스레드 환경에서 사용함
		List<String> vegeList = new Vector<>();		// import(컨트롤+스페이스)
		
		// 객체 추가
		vegeList.add("양파");		// 0
		vegeList.add("마늘");		// 1
		vegeList.add("감자");		// 2
		
		// 전체 조회(size(), get())
		for(int i=0; i<vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
		
		// 특정 위치에 추가
		vegeList.add(2, "고추");
		
		// "감자"를 "상추"로 변경 - set()
		vegeList.set(3, "상추");
		
		// "마늘" 삭제 - remove()
		vegeList.remove("마늘");
		
		System.out.println("====");
		// 전체 조회(향상 for문)
		for(String vege : vegeList) {
			System.out.println(vege);
		}

	}

}
