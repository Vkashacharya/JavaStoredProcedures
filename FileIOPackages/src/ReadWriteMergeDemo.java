import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteMergeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintWriter pw=new PrintWriter("ghi.txt");
		BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("def.txt"));
		String line=br1.readLine();
		while(line!=null) {
			pw.println(line);
			line=br1.readLine();
		}
		String line2=br2.readLine();
		while(line2!=null) {
			pw.println(line2);
			line2=br2.readLine();
		}
		pw.flush();
		pw.close();
		
		
		
		
	}

}
