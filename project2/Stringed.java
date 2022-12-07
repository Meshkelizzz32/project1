package project2;

public class Stringed extends Instrument{
	public void play(Note n) {
		System.out.println("Stringed.play()"+n);
	}
	public String toString() {
		return "Stringed";
	}
	void adjust() {
		System.out.println("Adjusting Stringed");
	}

}
