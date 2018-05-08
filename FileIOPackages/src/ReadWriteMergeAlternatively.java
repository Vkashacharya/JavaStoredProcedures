import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteMergeAlternatively {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("ghi.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("def.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while ((line1 != null) || (line2 != null)) {
			if (line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}
			if (line1 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
		}
		pw.flush();
		pw.close();

	}

}
