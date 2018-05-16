package ignacio.garcia.comparar.properties;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
    	String fileName1 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources.properties";
    	String fileName2 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_fr.properties";
    	
    	String fileName3 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_web.properties";
    	String fileName4 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_utilidades.properties";
    	String fileName5 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_usuarios.properties";
    	String fileName6 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_tarifas.properties";
    	String fileName7 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_salidas.properties";
    	String fileName8 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_reembolsos.properties";
    	String fileName9 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_recogidas_repartos.properties";
    	String fileName10 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_maestros.properties";
    	String fileName11 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_llegadas.properties";
    	String fileName12 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_liquidaciones.properties";
    	String fileName13 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_informes.properties";
    	String fileName14 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_geodis.properties";
    	String fileName15 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_facturacion.properties";
    	String fileName16 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_comercial.properties";
    	String fileName17 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_atc.properties";
    	String fileName18 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_administracion.properties";
    	String fileName19 = "C://DESARROLLOS//standar//GIT//padua//src//main//resources//ApplicationResources_2.properties";
    	
    	Map<String, String> result1 = new HashMap<>();
    	Map<String, String> result2 = new HashMap<>();
    	Map<String, String> result3 = new HashMap<>();
    	Map<String, String> result4 = new HashMap<>();
    	Map<String, String> result5 = new HashMap<>();
    	Map<String, String> result6 = new HashMap<>();
    	Map<String, String> result7 = new HashMap<>();
    	Map<String, String> result8 = new HashMap<>();
    	Map<String, String> result9 = new HashMap<>();
    	Map<String, String> result10 = new HashMap<>();
    	Map<String, String> result11 = new HashMap<>();
    	Map<String, String> result12 = new HashMap<>();
    	Map<String, String> result13 = new HashMap<>();
    	Map<String, String> result14 = new HashMap<>();
    	Map<String, String> result15 = new HashMap<>();
    	Map<String, String> result16 = new HashMap<>();
    	Map<String, String> result17 = new HashMap<>();
    	Map<String, String> result18 = new HashMap<>();
    	Map<String, String> result19 = new HashMap<>();
    	
    	//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName1), StandardCharsets.ISO_8859_1)) {

			result1 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName2), StandardCharsets.ISO_8859_1)) {

			result2 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName3), StandardCharsets.ISO_8859_1)) {

			result3 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName4), StandardCharsets.ISO_8859_1)) {

			result4 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName5), StandardCharsets.ISO_8859_1)) {

			result5 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName6), StandardCharsets.ISO_8859_1)) {

			result6 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName7), StandardCharsets.ISO_8859_1)) {

			result7 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName8), StandardCharsets.ISO_8859_1)) {

			result8 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName9), StandardCharsets.ISO_8859_1)) {

			result9 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName10), StandardCharsets.ISO_8859_1)) {

			result10 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName11), StandardCharsets.ISO_8859_1)) {

			result11 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName11), StandardCharsets.ISO_8859_1)) {

			result11 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName12), StandardCharsets.ISO_8859_1)) {

			result12 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName13), StandardCharsets.ISO_8859_1)) {

			result13 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName14), StandardCharsets.ISO_8859_1)) {

			result14 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName15), StandardCharsets.ISO_8859_1)) {

			result15 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName16), StandardCharsets.ISO_8859_1)) {

			result16 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (Stream<String> stream = Files.lines(Paths.get(fileName17), StandardCharsets.ISO_8859_1)) {

			result17 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName18), StandardCharsets.ISO_8859_1)) {

			result18 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName19), StandardCharsets.ISO_8859_1)) {

			result19 = stream.filter(item -> item != null && !item.isEmpty() && item.split("=").length == 2).collect(Collectors.toMap(k -> k.split("=")[0], v -> v.split("=")[1]));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Map.Entry<String, String> entry : result1.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}
		
		
		for (Map.Entry<String, String> entry : result3.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result4.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result5.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result6.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result7.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result8.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result9.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result10.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result11.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result12.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result13.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result14.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result15.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result16.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result17.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result18.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}

		for (Map.Entry<String, String> entry : result19.entrySet()) {
			String value2 = result2.get(entry.getKey());
			if (value2 == null || value2.isEmpty()) {
//				System.out.println("Properties2 dont have the key: " + entry.getKey() + "=" +entry.getValue());
			} else {
				result2.remove(entry.getKey());
			}
		}
		
		for (Map.Entry<String, String> entry : result2.entrySet()) {
			System.out.println("Properties1 dont have the key: " + entry.getKey() + "=" +entry.getValue());
		}
    }
}
