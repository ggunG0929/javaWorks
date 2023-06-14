package fileio.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		// 기반스트림 - FileInputStream
		// 보조스트림 - DataInputStream
		try(FileInputStream fis = new FileInputStream("file1.txt");
			DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readByte());		// 65
			System.out.println(dis.readChar());		// A
			System.out.println(dis.readInt());		// 65
			System.out.println(dis.readFloat());	// 2.54
			System.out.println(dis.readUTF());		// 감사합니다.
			
		}catch(IOException e) {		// import
			e.printStackTrace();
		}
	}

}
