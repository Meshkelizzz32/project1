package project2;

public class Music {
//	public static void tune(Wild i) {
//		i.play(Note.B_FLAT);
//	}
//	public static void tune(Brass i) {
//		i.play(Note.C_SHARP);
//	}
//	public static void tune(Stringed i) {
//		i.play(Note.MIDDLE_C);
//	}
	public static void tune (Instrument i) {
		i.play(Note.B_FLAT);
	}
	public static void TuneAll(Instrument[] e) {
		for(Instrument i:e)
			tune(i);
	}
	private static RandomInstrumentGeneration gen=new RandomInstrumentGeneration();
	public static void main(String[] args) {
//		Instrument[] orkestr= {
//			new Wild(),
//			new Percussion(),
//			new Stringed(),
//			new Brass(),
//			new Woodwind(),
//			new Lowwe()
		Instrument[] orkestr=new Instrument[20];
			for(int i=0;i<orkestr.length;i++) {
				orkestr[i]=gen.next();
		
	};
		TuneAll(orkestr);
			for (Instrument i:orkestr)
			System.out.println(i);
			
		}
	}

