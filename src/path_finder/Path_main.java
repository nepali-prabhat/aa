package path_finder;
import java.util.ArrayList;
import java.util.List;

import Array_uploader.*;
public class Path_main {

	public static void main(String[] args) {
		List<String> moves = new ArrayList<>(); 
		int array[][] = Array_main.Array();
		int col=39,row=27;;
		int i = path_find.find_path(array,col-1, 0);
		moves=path_find.move.get_moves();
		System.out.println(moves);
	}
	
}
