package path_finder;
import java.util.ArrayList;
import java.util.List;

import Array_uploader.*;
public class Path_main {

	public static void main(String[] args) {
		List<String> moves = new ArrayList<>(); 
		
		Array array = new Array();
		
		int col=array.get_array_column();
		int row=array.get_array_row();
		
		int i = path_find.find_path(array.get_array(),col-1, 0);
		
		System.out.println(path_find.path);
		
		moves=path_find.move.get_moves();
		System.out.println(moves);
	}
	
}
