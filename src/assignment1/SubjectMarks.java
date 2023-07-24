package assignment1;

public class SubjectMarks {
	public static void main(String[] args) {

		int math = 70;
		int eng = 60;
		int his = 60;

		if (math > 60 && eng > 60 && his > 60) {
			System.out.println("Pass");
		} else if (math > 60 && his > 60 && eng <=60) {
			System.out.println("Promoted");

		} else if (math > 60 && eng > 60 && his <=60) {
			System.out.println("Promoted");

		} else if (eng > 60 && his > 60 && math <=60) {
			System.out.println("Promoted");

		}
		else {
			System.out.println("Failed");
		}

	}

}
