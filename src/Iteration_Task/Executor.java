package Iteration_Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Executor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Executor exe = new Executor();
		
		Residents r1 = new Residents(1, "Maharshi Karve", 75, 1234);

		Residents r2 = new Residents(2, "Ram", 24, 1234);

		Residents r3 = new Residents(3, "Krushna", 21, 1234);

		Residents r4 = new Residents(4, "Hari", 20, 1234);

		Residents r5 = new Residents(5, "Bramha", 50, 1234);

		Residents r6 = new Residents(6, "Shri Vishu", 42, 1234);

		Residents r7 = new Residents(7, "Maheshwar", 35, 1234);

		Residents r8 = new Residents(8, "Jai Gajanan", 35, 1234);

		Residents r9 = new Residents(9, "datta Guru", 35, 1234);

		Residents r10 = new Residents(10, "Chakradhar", 35, 1234);

		List<Residents> list_of_karve_nagar = new ArrayList<>();

		list_of_karve_nagar.add(r1);
		list_of_karve_nagar.add(r2);
		list_of_karve_nagar.add(r3);

		List<Residents> list_of_maggar_patta = new ArrayList<>();

		list_of_maggar_patta.add(r4);
		list_of_maggar_patta.add(r5);
		list_of_maggar_patta.add(r6);

		List<Residents> list_of_kp = new ArrayList<>();

		list_of_kp.add(r7);
		list_of_kp.add(r8);
		list_of_kp.add(r9);
		list_of_kp.add(r10);

		HashMap<String, List<Residents>> hm = new HashMap<>();

		hm.put("Karve_nagar", list_of_karve_nagar);
		hm.put("maggar_patta", list_of_maggar_patta);
		hm.put("Kp", list_of_kp);

		TreeMap<String, HashMap<String, List<Residents>>> tm = new TreeMap<>();

		tm.put("Pune", hm);

		 TreeMap<String, TreeMap<String, HashMap<String, List<Residents>>>> map = new TreeMap<>();
	        map.put("India", tm);

	        // Iterating through the map
	        for (Map.Entry<String, TreeMap<String, HashMap<String, List<Residents>>>> countryEntry : map.entrySet()) {
	            String country = countryEntry.getKey();
	            TreeMap<String, HashMap<String, List<Residents>>> cities = countryEntry.getValue();

	            System.out.println("Country: " + country);

	            for (Map.Entry<String, HashMap<String, List<Residents>>> cityEntry : cities.entrySet()) {
	                String city = cityEntry.getKey();
	                HashMap<String, List<Residents>> neighborhoods = cityEntry.getValue();

	                System.out.println("  City: " + city);

	                for (Map.Entry<String, List<Residents>> neighborhoodEntry : neighborhoods.entrySet()) {
	                    String neighborhood = neighborhoodEntry.getKey();
	                    List<Residents> residents = neighborhoodEntry.getValue();

	                    System.out.println("    Neighborhood: " + neighborhood);

	                    for (Residents resident : residents) {
	                        System.out.println("      Resident: " + resident.name);
	                    }
	                }
	            }
	        }}}
