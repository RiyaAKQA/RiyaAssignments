package Assignment4;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// TAKE A MAP THAT CONTAINS THE FOOD ID AND FOODNAME, 
		//HAVE SOME DUMMY DATAS AND 
		// TRY TO USE PUTIFABSENT METHOD 
		
		HashMap<Integer , String> foodMap = new HashMap();
		foodMap.put(1, "Pizza");
		foodMap.put(3, "Pasta");
		foodMap.put(4, "VadaPav");
		System.out.println(foodMap);
		
		
		foodMap.putIfAbsent(4, "Burger");
		System.out.println(foodMap);
		
	

	}

}
