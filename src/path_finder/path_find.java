package path_finder;

import java.util.ArrayList;
import java.util.List;

import Array_uploader.Array;

public class path_find {
	static public List<String> path=new ArrayList<String>();
	public static moves_container move = new moves_container();
	/**
	 * @param array: array of this instance
	 * @param col: the column of starting point
	 * @param row: the row of the starting point
	 * @return 
	 */
	
	public List<String> getPath() {
		return path;
	}
	public static int find_path(int[][] array, int col, int row) {
		/**
		 * @param temp_array: all  the changes in array is done in temp_array
		 */
		int[][] temp_array = array;
		int actual_column = temp_array[0].length;
//		System.out.println(col);
		int actual_rows = temp_array.length;
//		System.out.println(row);
		
		int value = temp_array[row][col];
		
//		System.out.println(value);
		
		int return_value = 0;
		if(col==0 && row == 0) {
			return_value = 1;
			return return_value;			
		}else if(value == 0) {
			return_value = 0;
			return return_value;
		}else if(value == 1) {
			temp_array[row][col]=0;
			if(row-1>=0) {
				String p=("["+col+" "+(row-1)+"]");
				return_value = find_path(temp_array,col,row-1);
				
				if(return_value==1){
//					System.out.println("------------U");
//					System.out.println("U");
					move.add_move("U");
					
					path.add(p);
					
					return 1;
					}
				}
			if(col+1<actual_column) {
				String p=("["+(col+1)+" "+(row)+"]");
				return_value = find_path(temp_array,col+1,row);
				if(return_value==1){
				move.add_move("R");
				path.add(p);
				return 1;
				}
			}
			if(col-1>=0) {
				String p=("["+(col-1)+" "+(row)+"]");
				return_value = find_path(temp_array,col-1,row);
				if(return_value==1){
//					System.out.println("L");
					move.add_move("L");
					path.add(p);
					return 1;
					}
			}
			if(row+1<actual_rows) {
				String p=("["+col+" "+(row+1)+"]");
				return_value = find_path(temp_array,col,row+1);
				if(return_value==1){
//					System.out.println("D");
					move.add_move("D");
					path.add(p);
					return 1;
					}
			}
			
			}
		return 0;
	}
}
