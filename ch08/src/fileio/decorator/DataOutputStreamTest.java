package fileio.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("file1.txt");	// import
			DataOutputStream dos = new DataOutputStream(fos)) {			// import
			dos.writeByte(65);
			dos.writeChar(65);		// 아스키코드
			dos.writeInt(65);		// 정수
			dos.writeFloat(2.54F);	// 실수
			dos.writeUTF("감사합니다.");	// 문자열
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료");
		
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
