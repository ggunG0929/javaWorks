package fileio.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
//		String originFile = "c:/file/bg0.jpg";	// 원본파일
//		String copyFile = "c:/file/bg5.jpg";	// 사본파일
		String originFile = "c:/file/ojdbc8.jar";	// 원본파일
		String copyFile = "c:/file/ojdbc8-2.jar";	// 사본파일	// 87ms
		long start = 0, end = 0;
		
		// 보조 스트림 사용 - BufferedStream 사용해서 시간을 단축시킴
		try(FileInputStream fis = new FileInputStream(originFile);		// import
			FileOutputStream fos = new FileOutputStream(copyFile);		// import
			BufferedInputStream bis = new BufferedInputStream(fis);		// import
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {	// import
			start = System.currentTimeMillis();
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			end = System.currentTimeMillis();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.printf("파일 복사 소요시간: %dms", (end-start));
	}

}
