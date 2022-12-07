package project2;

public class Brass extends Wind{
	public void play(Note n) {
		System.out.println("Brass.play()"+n);
	}
	public String toString() {
		return "Brass";
	}
	void adjust() {
		System.out.println("Adjusting Brass");
	}

}
