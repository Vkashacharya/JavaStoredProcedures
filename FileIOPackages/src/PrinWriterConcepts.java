import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinWriterConcepts {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("def.txt");
		pw.write(100);
		pw.println(100);
		pw.print(100);
		pw.flush();
		pw.close();

	}

}
