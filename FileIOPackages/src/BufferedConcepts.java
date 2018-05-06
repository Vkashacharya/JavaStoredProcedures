import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedConcepts {

	public static void main(String[] args) throws IOException {
//		 TODO Auto-generated method stub
		 FileWriter fw=new FileWriter("abc.txt");
		 BufferedWriter bw=new BufferedWriter(fw);
		 bw.write(97);
		 bw.newLine();
		 bw.write("BCDEFG");
		 bw.newLine();
		 bw.write("NEW LINE");
		 bw.flush();
		 bw.close();
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		int i=br.read();
		while (i!=-1) {
		System.out.println((char) i);
		i=br.read();
		}
		br.close();

		br.close();
		String line=br.readLine();
		while (line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
				
	}

}
