
public class LowestForm {
	static void reduceFraction(int x,int y)
	{
		int d;
		d=gcd(x,y);
		x=x/d;
		y=y/d;
		System.out.println("x=" +x+ ",y=" +y);
	}
	static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=3;
    int y=12;
    reduceFraction(x,y);
    
	}

}
