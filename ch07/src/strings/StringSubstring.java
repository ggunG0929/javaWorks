package strings;

public class StringSubstring {

	public static void main(String[] args) {

		String ssn = "940608-2345678";
		
		// substring(인수1, 인수2) - 인수 1에서 인수 2-1까지의 문자 추출
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		// substring(인수1) - 인수 1에서 끝까지의 문자 추출
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);
		
		// url 경로 추출
		String uri = "/board/boardList.jsp";
		int uri_idx = uri.lastIndexOf('/');				// 경로의 뒤에서부터 / 검색 후 위치반환 
		System.out.println(uri.substring(uri_idx));		// / 위치부터 끝까지의 문자 추출

	}

}
