

public class Demo {

	Aa method1(Bb x) {

		return new Aa();
	}

}

class Bb {

}

class Aa {

	int id;

	public static void main(String[] args) {

		Demo d = new Demo();

		Bb b = new Bb();

		Aa a = d.method1(b);
		System.out.println(a.id);

	}
}
