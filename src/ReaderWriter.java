import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("midakos.txt"));
		InputStreamReader in=new InputStreamReader(new FileInputStream("midakos.txt"));
		
		System.out.println(out.getEncoding());
		
		out.write("me lene kosmida");
		out.close();
		int data = in.read();
		while (data!=-1) {
			System.out.print((char)data);
			data=in.read();		}
	}

}
