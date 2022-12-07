package project2;

public class Woodwind extends Wind{
	public void play(Note n) {
		System.out.println("Woodwind.play()"+n);
	}
	public String toString() {
		return "Woodwind";
	}
	void adjust() {
		System.out.println("Adjusting Woodwind");
	}

}
