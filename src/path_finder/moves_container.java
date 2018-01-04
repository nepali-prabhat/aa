package path_finder;

import java.util.ArrayList;
import java.util.List;

public class moves_container {
	public  List<String> moves = new ArrayList<>();
	public  void add_move(String move) {
		moves.add(move);
	}
	public List get_moves() {
		return moves;
	}
}
