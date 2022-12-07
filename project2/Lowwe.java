package project2;

public class Lowwe extends Instrument{
	public void play(Note n) {
		System.out.println("Lowwe.play()"+n);
	}
	public String toString() {
		return "Lowwe";
	}
	void adjust() {
		System.out.println("Adjusting Lowwe");
	}

}
