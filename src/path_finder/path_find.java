package path_finder;

import java.util.ArrayList;
import java.util.List;

public class path_find {
	
	public static moves_container move = new moves_container();
	/**
	 * @param array: array of this instance
	 * @param col: the column of starting point
	 * @param row: the row of the starting point
	 * @return 
	 */
	public static int find_path(int[][] array, int col, int row) {
		/**
		 * @param temp_array: all  the changes in array is done in temp_array
		 */
		int[][] temp_array = array;
		int actual_column = temp_array[0].length;
		System.out.println(col);
		int actual_rows = temp_array.length;
		System.out.println(row);
		int value = temp_array[row][col];
		System.out.println(value);
		int return_value = 0;
		if(col==0 && row == 0 && value == 1) {
			return_value = 1;
			return return_value;			
		}else if(value == 0) {
			return_value = 0;
			return return_value;
		}else if(value == 1) {
			temp_array[row][col]=0;
			if(col+1<actual_column) {
				return_value = find_path(temp_array,col+1,row);
				switch(return_value){
				case(0):	return 0;
				case(1): move.add_move("R"); break;
				}
			}
			if(col-1>=0) {
				return_value = find_path(temp_array,col-1,row);
				switch(return_value) {
				case(0):	return 0; 
				case(1): move.add_move("L") ; break;
				}
			}
			if(row+1<actual_rows) {
				return_value = find_path(temp_array,col,row+1);
				switch(return_value) {
				case(0):	return 0;
				case(1):  System.out.println("U"); move.add_move("U"); break;
				}
			}
			if(row-1>=0) {
				return_value = find_path(temp_array,col,row-1);
				switch(return_value) {
				case(0):	return 0;
				case(1):  System.out.println("D");move.add_move("D"); break;
				}
			}
		}
		return 1;
	}
}
