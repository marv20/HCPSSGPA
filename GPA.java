public class GPA {
	static boolean rekt;//only credit for class goes for ABC
	
	public int pointQt(String Q){
		if (Q.equals("A")){
			return 4;
		}
		if (Q.equals("B")){
			return 3;
		}
		if (Q.equals("C")){
			return 2;
		}
		if (Q.equals("D")){
			rekt = true;
			return 1;
		} else {
		return 0;
		}
	}
	
	public double regGPA(double sum){//calculates gpa and returns it as string
		double gpa = Math.round((sum / 7) * 100.0) / 100.0;
		return gpa;
	}
}
