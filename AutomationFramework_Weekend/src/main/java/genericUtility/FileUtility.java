package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Suchithra 
 */
public class FileUtility {
	/**
	 * this method is used to read data from java property file and return the value based on the key
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getDataFromProperty(String key) throws IOException {
	FileInputStream fis = new  FileInputStream("./src/test/resources/TestData/commondata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	return prop.getProperty(key);
	
}
}
