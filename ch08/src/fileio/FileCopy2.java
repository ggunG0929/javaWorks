package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		// 이미지 파일을 읽고 쓰기(복사)
		String originFile = "c:/file/bg0.jpg";	// 원본파일
		String copyFile = "c:/file/bg1.jpg";	// 사본파일
		
		FileInputStream fis = null;		// import
		FileOutputStream fos = null;	// import
		try {
			fis = new FileInputStream(originFile);	// surround with try catch
			fos = new FileOutputStream(copyFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();	// surround with try catch
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("복사 완료!!");
	}

}
