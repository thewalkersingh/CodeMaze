package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
	public static void main(String[] args) {
		Dota2Senate ds = new Dota2Senate();
		String senate = "RDDRR";
		System.out.println(ds.predictPartyVictory(senate)); // Output: "Radiant"
	}
	
	public String predictPartyVictory(String senate) {
		Queue<Integer> radiant = new LinkedList<>();
		Queue<Integer> dire = new LinkedList<>();
		
		// Populate the queues with the indices of Radiant and Dire senators
		for (int i = 0; i < senate.length(); i++) {
			if (senate.charAt(i) == 'R') {
				radiant.add(i);
			}
			else {
				dire.add(i);
			}
		}
		int n = senate.length();
		// Simulate the voting rounds
		while (!radiant.isEmpty() && !dire.isEmpty()) {
			int rIndex = radiant.poll();
			int dIndex = dire.poll();
			// The senator with the smaller index gets to ban the opponent
			if (rIndex < dIndex) {
				radiant.add(rIndex + n);
			}
			else {
				dire.add(dIndex + n);
			}
		}
		// Determine the winning party
		return radiant.isEmpty() ? "Dire" : "Radiant";
	}
}