package fileio.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BurreredReaderTest {

	public static void main(String[] args) {
		// 문자열 읽어오기 - 보조 스트림 사용
		// 보조 스트림 클래스의 생성자로 기반 스트림 객체를 사용
		try(FileReader fr = new FileReader("msg.txt");	// import
			BufferedReader br = new BufferedReader(fr)) {	// import
			String line = null;
			while(true) {
				line = br.readLine();	// 한 줄 읽은 데이터 저장
				if(line == null) {		// 읽은 데이터가 null이면 탈출
					break;
				}
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
