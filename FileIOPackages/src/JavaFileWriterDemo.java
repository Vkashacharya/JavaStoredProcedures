import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaFileWriterDemo {

	public static void main(String[] args) throws IOException {
		
	
/*** File Writer**/
//
//		try {
//			FileWriter fw=new FileWriter("abc.txt",true);
//		
//			fw.write(100);
//			fw.write("for \n Donkey");
//			fw.write('\n');
//			char[] ch= {'a','b'};
//			fw.write(ch);
//			fw.flush();
//			fw.close();
//			System.out.println("Succesfuly Writed");
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			File fw=new File("abc.txt");
			char[] ch=new char[(int)fw.length()];
			FileReader fr=new FileReader(fw);
			fr.read(ch);
			for(char c:ch) {
				System.out.println(c);
			}
			
			
//				fw.write("NEPAL ");
//				fw.write("D is for Donkey");
//				fw.write('\n');
//				char[] che= {'a','b'};
//				fw.write(che);
//				fw.flush();
//				System.out.println((int) fw.len);
//				fw.close();
//			FileReader fr=new FileReader("abc.txt");
//			char[] ch=new char[5];
//			fr.read(ch);
//			fr.close();
//				System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
