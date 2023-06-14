package fileio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	// 객체의 직렬화(현재의 상태를 그대로 저장)
	public static void main(String[] args) {
		Person son = new Person("손정의", "대표이사");
		Person kim = new Person("김기용", "강사");
		
		// 보조스트림 - ObjectOutputStream
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(son);	// 객체 쓰기
			oos.writeObject(kim);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 역직렬화 - 복원
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();	// 객체 읽기
			Person p2 = (Person)ois.readObject();
//			System.out.println(p1.toString());
			System.out.println(p1);		// toString 재정의 후에는 p1으로만 해도 맞게 나옴
			System.out.println(p2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
