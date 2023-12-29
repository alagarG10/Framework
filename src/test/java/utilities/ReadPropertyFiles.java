package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\user\\Downloads\\AR Workspace\\AdactinProject\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties pr = new Properties();
		
		pr.load(fr);
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("testUrl"));
		
	}

}
