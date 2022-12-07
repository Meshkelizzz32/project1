package project2;
import java.util.*;

public class RandomInstrumentGeneration {
Random rand=new Random();
public Instrument next() {
	switch (rand.nextInt(7)) {
	default:
	case 0:return new Wind();
	case 1:return new Percussion();
	case 2:return new Stringed();
	case 3:return new  Lowwe();
	case 4:return new Brass();
	case 5:return new Woodwind();

	
	}
}
}
