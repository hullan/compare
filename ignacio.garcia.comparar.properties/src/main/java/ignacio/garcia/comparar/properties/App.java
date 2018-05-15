package ignacio.garcia.comparar.properties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	String fileName1 = "c://test1.properties";
    	String fileName2 = "c://test2.properties";
    	
    	Map<String, String> result1 = new HashMap<>();
    	Map<String, String> result2 = new HashMap<>();
    	
    	//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName1))) {

			result1 = stream.collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    	//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName2))) {

			result2 = stream.collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Map.Entry<String, String> entry : result1.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}
		
		for (Map.Entry<String, String> entry : result2.entrySet()) {
			System.out.println("Properties1 dont have the key: " + entry.getKey() + "=" +entry.getValue());
		}
    }
}
