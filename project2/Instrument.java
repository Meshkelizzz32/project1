package project2;

public class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()"+n);
		
	}
	public String toString() {
		return "Instrument";
	}
	void adjust() {
		System.out.println("Adjusting Instrument");
	}

}
