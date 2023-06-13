package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest2 {

	public static void main(String[] args) {
		// 문자열 파일 쓰기
		FileWriter fw = null;
		try {
			fw = new FileWriter("msg.txt");	// surround with try catch	// import
			fw.write("Good Luck\n");
			fw.write("코로나 주의하세요");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();		// surround with try catch
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
