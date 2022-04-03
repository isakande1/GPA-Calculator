import java.util.*;
public class GPA  {
	
	static Scanner console = new Scanner(System.in);
	static ArrayList<Integer> grades =  new ArrayList<Integer>()  ;
	static ArrayList<Integer> multiplier=  new ArrayList<Integer>()  ;
	static ArrayList<String> letterGrade = new ArrayList<String>() ;
	static ArrayList<String> course = new ArrayList<String>() ;
	static ArrayList<Double> scale = new ArrayList<Double>();
	
	public static void main(String [] args){
		choice();
		
	}
	
	public static void conversion( ) {
		System.out.print("Enter the name of the course:");
		String courseName = console.next();
		System.out.print("Enter the grade :");
		int grade = console.nextInt();
		System.out.print("Enter the credit hours :");
		int credit = console.nextInt();
		grades.add(grade);
		String letter = null ;
		Double sca = null;
		if(grade >= 90) {
			letter = "A";
			sca = 4.0;
		}else if(grade >= 87 && grade<= 89) {
				letter = "B+";
				sca = 3.5;
		}else if(grade >= 80 && grade<= 86) {
			letter = ("B");
			sca = 3.0;
	   }else if(grade >= 77 && grade<= 79) {
		letter = ("C+");
		sca = 2.5;
      }
	   else if(grade >= 70 && grade<= 76) {
			letter = ("C");
			sca = 2.0;
	  }else if(grade >= 60 && grade<= 69) {
			letter = ("D");
			sca = 2.0;
	 }else if(grade >= 0 && grade<= 59) {
			letter = ("F");
			sca = 0.0;
	}
		letterGrade.add(letter);
		scale.add(sca);
		course.add(courseName);
		multiplier.add(credit);
	
	}
	
public static void choice() {
	int option = 0;
	do {
	System.out.println("menu");
	System.out.println("Enter 1 to add a course");
	System.out.println("Enter 2 to exit");
	option = console.nextInt();
	switch(option) {
	case 1:
	conversion();
	display();
	}}while(option !=2);
}

public static void display() {
	 int pond = 0;
	 Double divident =0.0;
	 Double total = 0.0;
	System.out.println(" Courses |" + " Grades |"+ "Letter Grade |"+ "  GPA  | " + "|Credits Hours");
	for(int i = 0; i< grades.size(); i++) {
		System.out.printf(" %5S %8d %8S %12.2f %10d \n", course.get(i), grades.get(i), letterGrade.get(i),scale.get(i), multiplier.get(i) );
		pond += (scale.get(i) * multiplier.get(i));
		divident += multiplier.get(i);
		
		}
	
	try {
		total = pond/divident;
	}catch(Exception e) {
		
		
	}
	if(course.size()>1) {
	System.out.printf("%3s %3.2f \n", "Your overall GPA is:" , total);
	}
}







}
