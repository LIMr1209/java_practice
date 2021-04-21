package java003;

public class Test02 {
	public static void main(String[] args) {      
		complex c1=new complex(3f,5.8f);      
		complex c2=new complex(17f, 6.5f);          
		complex.add(c1,c2); 
		complex.muns(c1,c2);         
		complex.mult(c1,c2);
	}}

class complex {
	private float x;
	private float y;

	complex() {
		x = y = 0.0f;
	}

	complex(float x, float y) {
		this.x = x;
		this.y = y;
		System.out.println(x);
		System.out.println(y);
	}

	void print() {
		System.out.print(x + "+" + y + "i");
	}

	complex madd(complex c1) {
		complex ccc = new complex();
		ccc.x = this.x + c1.x;
		ccc.y = this.y + c1.y;
		return ccc;
	}

	static complex add(complex c1, complex c2) {
		complex ccc = new complex();
		ccc.x = c1.x + c2.x;
		ccc.y = c1.y + c2.y;
		return ccc;
	}

	static complex muns(complex c1, complex c2) {
		complex ccc = new complex();
		ccc.x = c1.x - c2.x;
		ccc.y = c1.y - c2.y;
		return ccc;
	}

	static complex mult(complex c1, complex c2) {
		complex ccc = new complex();
		ccc.x = c1.x * c2.x - c1.y * c2.y;
		ccc.y = c1.x * c2.y + c2.x * c1.y;
		return ccc;
	}
}