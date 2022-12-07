package project2;

public class Percussion extends Instrument{
	public void play(Note n) {
		System.out.println("Percussion.play()");
		
	}
	public String toString() {
		return "Percussion";
	}
	void adjust() {
		System.out.println("Adjusting Percussion");
	}


}
