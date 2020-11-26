package map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	// Rank all country based on the number of cases:
	public static HashMap<String, Integer> TotalCases = new HashMap<String, Integer>();
	public static HashMap<String, Integer> NewCases = new HashMap<String, Integer>();
	public static HashMap<String, Integer> TotalDeaths = new HashMap<String, Integer>();
	public static HashMap<String, Integer> TotalRecovered = new HashMap<String, Integer>();
	public static HashMap<String, Integer> ActiveCases = new HashMap<String, Integer>();

	public static void addzero(String[] values) {
		for (int j = 0; j < values.length; j++)
			if (values[j].equals("[]"))
				values[j] = "[0]";
	}

	public static void removebracket(String[] values) {
		for (int j = 0; j < values.length; j++)
			values[j] = values[j].substring(1, values[j].length() - 1);
	}

	// Sort
	public static HashMap<String, Integer> Csort(HashMap<String, Integer> typeofcase) {
		// Storage all cases into the list
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(typeofcase.entrySet());

		// Comparator to compare the number of cases
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> c1, Map.Entry<String, Integer> c2) {
				return (c1.getValue()).compareTo(c2.getValue());
			}
		});
		// put the value from the list to an output hashmap
		HashMap<String, Integer> outputhashmap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			outputhashmap.put(entry.getKey(), entry.getValue());
		}
		return outputhashmap;

	}

	public static void read() throws IOException {
		String path = "src/source/testing.txt";
		String line = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			int i = 0;
			while ((line = br.readLine()) != null) {

				String[] values = line.split(", ");
				addzero(values);
				removebracket(values);
				// Collecting all the data into the hashmap
				TotalCases.put(values[0], Integer.parseInt(values[1]));
				NewCases.put(values[0], Integer.parseInt(values[2]));
				TotalDeaths.put(values[0], Integer.parseInt(values[3]));
				TotalRecovered.put(values[0], Integer.parseInt(values[4]));
				ActiveCases.put(values[0], Integer.parseInt(values[5]));
				for (int j = 0; j < values.length; j++)
					// System.out.println(values[j]);
					i++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String print(Map<String, Integer> m) throws IOException {
		String s = "";
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			// System.out.println("City: " + entry.getKey() + ", Number of Cases: " +
			// entry.getValue());
			s += ("Country: " + entry.getKey() + ", Number of Cases: " + entry.getValue() + "\n");
		}
		// System.out.println(s);
		return s;
	}

	public static void main(String[] args) throws IOException {

	}

}