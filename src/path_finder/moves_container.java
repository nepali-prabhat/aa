package path_finder;

import java.util.ArrayList;
import java.util.List;

public class moves_container {
	public  ArrayList<String> moves = new ArrayList<>();
	
	public  void add_move(String move) {
		
		moves.add(move);
	}
	public ArrayList get_moves() {
		return moves;
	}
}