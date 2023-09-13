
public class Employee implements Comparable<Object> {

	String name;
	int eid;

	public Employee(String name, int eid) {

		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Object o) {

		int eid1 = this.eid; //fresh

		Employee e = (Employee) o;
		int eid2 = e.eid; //old

		if(eid1<eid2) {
			return -1;
		}else if(eid1>eid2) {
			return 1;
		}else
		return 0;
	}

}
