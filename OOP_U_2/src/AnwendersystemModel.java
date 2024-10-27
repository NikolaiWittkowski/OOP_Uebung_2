import java.io.BufferedWriter;
import java.io.FileWriter;

public class AnwendersystemModel {
	
	public String getUeberschrift() {
		return "Hallo";
	}
	
	public void writeTo(String str) {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("File.txt"));
			bw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
