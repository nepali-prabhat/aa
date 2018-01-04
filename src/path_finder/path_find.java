package path_finder;

import java.util.ArrayList;
import java.util.List;

public class path_find {
	public static moves_container move = new moves_container();
	/**
	 * 
	 * @param array: array of this instance
	 * @param col: the column of starting point
	 * @param row: the row of the starting point
	 * @return 
	 */
	public static int find_path(int[][] array, int col, int row) {
		int[][] temp_array = array;
		int actual_column = temp_array[0].length;
		System.out.println(col);
		int actual_rows = temp_array.length;
		System.out.println(row);
		int value = temp_array[row][col];
		System.out.println(value);
		int return_value;
		if(col==0 && row == 0) {
			return 1;
		}else if(value == 0) {
			return 0;
		}else if(value == 1) {
			temp_array[row][col]=0;
			if(col+1<actual_column) {
				return_value = find_path(temp_array,col+1,row);
				switch(return_value) {
//				case(0):	return 0;
				case(1): move.add_move("R"); System.out.println("R");
				
				}
			}
			
			if(col-1>=0) {
				return_value = find_path(temp_array,col-1,row);
				switch(return_value) {
//				case(0):	return 0; 
				case(1):  move.add_move("L") ;System.out.println("L");
				}
			}
			if(row+1<actual_rows) {
				return_value = find_path(temp_array,col,row+1);
				switch(return_value) {
//				case(0):	return 0;
				case(1):  move.add_move("U");System.out.println("U");
				}
			}
			if(row-1>=0) {
				return_value = find_path(temp_array,col,row-1);
				switch(return_value) {
//				case(0):	return 0;
				case(1):  move.add_move("D");System.out.println("D");
				}
			}
		}
		return 0;
	}
}