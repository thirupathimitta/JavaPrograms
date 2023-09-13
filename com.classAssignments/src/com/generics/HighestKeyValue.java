package com.generics;


import java.util.*;

public class HighestKeyValue {

		
	public static Map.Entry<String, Integer>
	
	getMaxEntryInMapBasedOnKey(Map<String, Integer> map)
	{
		
		Map.Entry<String, Integer> entryWithMaxKey = null;

		// Iterate in the map to find the required entry
		for (Map.Entry<String, Integer> currentEntry : map.entrySet()) {

			if (entryWithMaxKey == null || currentEntry.getKey().compareTo(entryWithMaxKey.getKey())> 0) {

				entryWithMaxKey = currentEntry;
			}
		}

		
		return entryWithMaxKey;
	}

	public static void main(String[] args)
	{

		Map<String, Integer> map
			= new HashMap<>();
		map.put("ABC", 10);
		map.put("DEF", 30);
		map.put("XYZ", 20);

		System.out.print("Map: "+ map );


		System.out.println(
				"\nEntry with highest key: " + getMaxEntryInMapBasedOnKey(map));
	}
}
