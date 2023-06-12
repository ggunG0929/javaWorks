package fileio.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest2 {
	
	public static void main(String[] args) {	// import java.io
		Reader fr = null;
		try {
			fr = new FileReader("data2.txt");	// surround with try catch	// import java.io
			int data;
			while((data = fr.read()) != -1) {	// add exception(3번째)?
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();		// surround with try catch
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
