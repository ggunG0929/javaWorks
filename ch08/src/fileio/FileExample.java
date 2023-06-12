package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File file = new File("c:/file/newFile.txt");
		file.createNewFile();	// add throws
		
		System.out.println(file.isFile());		// 파일 - true
		System.out.println(file.isDirectory());	// 폴더 - false
		System.out.println(file.getName());		// 파일이름
		System.out.println(file.getPath());		// 파일위치(경로)
		System.out.println(file.length() + "B");	// 파일용량
//		System.out.println("파일 생성");
	}

}
