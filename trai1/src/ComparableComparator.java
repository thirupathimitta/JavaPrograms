import java.util.TreeSet;

public class ComparableComparator {

	public static void main(String[] args) {
		Employee e1= new Employee("naresh",100);
		Employee e2= new Employee("balu",200);
		Employee e3= new Employee("chinna",50);
		Employee e4= new Employee("venkat",150);
		Employee e5= new Employee("nagraj",100);
		
//		TreeSet<Employee> t1= new TreeSet<>( );
//		t1.add(e1);
//		t1.add(e2);
//		t1.add(e3);
//		t1.add(e4);
//		t1.add(e5);
//		System.out.println(t1);
		
		TreeSet<Employee> t2= new TreeSet<>( new Mycomparator5());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);

	}

}
