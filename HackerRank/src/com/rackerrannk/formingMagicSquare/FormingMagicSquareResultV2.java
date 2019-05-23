package com.rackerrannk.formingMagicSquare;

import java.util.HashMap;
import java.util.Map;

public class FormingMagicSquareResultV2 {
	public static void main(String[] args) {
		int[][] s = new int[3][3];

		//RESULT 7
//		 s[0][0] = 5;
//		 s[0][1] = 3;
//		 s[0][2] = 4;
//		 s[1][0] = 1;
//		 s[1][1] = 5;
//		 s[1][2] = 8;
//		 s[2][0] = 6;
//		 s[2][1] = 4;
//		 s[2][2] = 2;

		//RESULT 1
//		 s[0][0] = 4;
//		 s[0][1] = 9;
//		 s[0][2] = 2;
//		 s[1][0] = 3;
//		 s[1][1] = 5;
//		 s[1][2] = 7;
//		 s[2][0] = 8;
//		 s[2][1] = 1;
//		 s[2][2] = 5;

		//RESULT 4
//		s[0][0] = 4;
//		s[0][1] = 8;
//		s[0][2] = 2;
//		s[1][0] = 4;
//		s[1][1] = 5;
//		s[1][2] = 7;
//		s[2][0] = 6;
//		s[2][1] = 1;
//		s[2][2] = 6;

		//RESULT 14
		s[0][0] = 4;
		s[0][1] = 5;
		s[0][2] = 8;
		s[1][0] = 2;
		s[1][1] = 4;
		s[1][2] = 1;
		s[2][0] = 1;
		s[2][1] = 9;
		s[2][2] = 7;
		
		//RESULT 21
//		s[0][0] = 2;
//		s[0][1] = 9;
//		s[0][2] = 8;
//		s[1][0] = 4;
//		s[1][1] = 2;
//		s[1][2] = 7;
//		s[2][0] = 5;
//		s[2][1] = 6;
//		s[2][2] = 7;

		System.out.println(formingMagicSquare(s));
	}

	static int formingMagicSquare(int[][] s) {
		HashMap <Integer, Integer> mapBase = new HashMap<Integer, Integer>();
        mapBase.put(1, 0);
        mapBase.put(2, 0);
        mapBase.put(3, 0);
        mapBase.put(4, 0);
        mapBase.put(5, 0);
        mapBase.put(6, 0);
        mapBase.put(7, 0);
        mapBase.put(8, 0);
        mapBase.put(9, 0);
        
        Integer value = 0;
        //GENERATE MAPBASE
        for (Integer i = 0; i < s.length; i++) {
            for (Integer j = 0; j < s.length; j++) {
                if (mapBase.containsKey(s[i][j])) { 
                    mapBase.put(s[i][j], mapBase.get(s[i][j]) + 1); 
                } 
            }
        }
        
        
//        //RESOLVING DUPLICATED
//        for (Integer i = 0; i < s.length; i++) {
//            for (Integer j = 0; j < s.length; j++) {
//            	if (mapBase.containsKey(s[i][j])) {
//            		 int occurrence = mapBase.get(s[i][j]);
//                     int oldValue = 0;
//                     if(occurrence >= 2) {
//                    	 mapBase.put(s[i][j], mapBase.get(s[i][j]) - 1);
//                         oldValue = s[i][j];
//                         s[i][j] = validateNextDigit(mapBase);
//                         value = value + Math.abs(oldValue - s[i][j]);
//                     }
//            	}
//            }
//        }
//        System.out.println("RESOLVED");
//        System.out.println(mapBase);
//        for (int i = 0; i < s.length; i++) {
//            String print = "";
//            for (int j = 0; j < s.length; j++) {
//                print = print + " " + s[i][j];
//            }
//            System.out.println(print);
//        }
//        System.out.println("\n");
        
        
        for (Integer i = 0; i < s.length; i++) {
            for (Integer j = 0; j < s.length; j++) {
                if (mapBase.containsKey(s[i][j])) {
                    
                    if(s[i][0]+s[i][1]+s[i][2] !=15) {
                        //int occurrence = mapBase.get(s[i][j]);
                        int oldValue = 0;
                        //if(occurrence >= 2) {
                            mapBase.put(s[i][j], mapBase.get(s[i][j]) - 1);
                            oldValue = s[i][j];
                            
                            if (Math.abs((s[i][0] + s[i][1] + s[i][2] - s[i][j]) - 15) <= 9) {
								s[i][j] = Math.abs((s[i][0] + s[i][1] + s[i][2] - s[i][j]) - 15);
							} else {
								s[i][j] = Math.abs((s[i][0] + s[i][1] + s[i][2] + s[i][j]) - 15);
							}
                            
                            value = value + Math.abs(oldValue - s[i][j]);

							if (mapBase.containsKey(s[i][j])) {
								mapBase.put(s[i][j], mapBase.get(s[i][j]) + 1);
							}
							if (s[i][0] + s[i][1] + s[i][2] == 15) {
								break;
							}
                            
                        //}    
                    }
                    
                } 
            }
        }
        System.out.println(mapBase);
        
        for (int i = 0; i < s.length; i++) {
            String print = "";
            for (int j = 0; j < s.length; j++) {
                print = print + " " + s[i][j];
            }
            System.out.println(print);
        }
        
        return value;
	}
	
	private static Integer validateNextDigit(HashMap<Integer, Integer> mapBase) {
		Integer result = 0;
		for (Map.Entry<Integer,Integer> pair : mapBase.entrySet()) {
		    if(pair.getValue() == 0) {
		    	result = pair.getKey();
		    	mapBase.put(pair.getKey(), pair.getValue() + 1);
		    	break;
		    }
		}
		return result;
	}
}