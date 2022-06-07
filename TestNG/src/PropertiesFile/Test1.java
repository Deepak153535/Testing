package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("D:\\Soft\\eclipse-jee-neon-3-win32-x86_64\\eclipse\\Deepakjava4pm\\TestNG\\data.properties");
		p.load(fis);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("browser"));
		
		p.setProperty("browser","Fix");
		
		System.out.println(p.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("D:\\Soft\\eclipse-jee-neon-3-win32-x86_64\\eclipse\\Deepakjava4pm\\TestNG\\data.properties");
		p.store(fos, null);
		
	}
	
}
