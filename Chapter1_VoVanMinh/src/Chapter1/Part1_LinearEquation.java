package Chapter1;

public class Part1_LinearEquation {

	float a;
	float b;
	public Part1_LinearEquation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Part1_LinearEquation(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	
	//to find root of the linear equation
	// input: 2  float variables a and b
	// output: return a root float type
	public float findRoot(){
		float x = 0;
		if(this.a == 0){
            if(this.b == 0){
            	x = Float.MAX_VALUE;
            }
            else {
                x = Float.NaN;
            }
        }
        else 
        {
          x=(-b)/a;
          if (x == -0)
        	  x = 0;
        }
		return x;
	}
}

