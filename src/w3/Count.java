package w3;
import java.util.Random;
public class Count {
	public static Count []Count = new Count[100];
	public int a;
	public int b;
	public int d;
	public int c;
	public int s=0;
	Count(){
		
	}
	Count(int x,int y,int w) {
		this.a=x;
		this.b=y;
		this.c=w;
	}
	static int randoms() {
		Random random = new Random();
		return ((int)random.nextInt(100));
	}
	void GeneratingFormula() {
		a=randoms();
		b=randoms();
		d=randoms();
		c=1;
		if(d%2==1)
			c=-1;
	}
	boolean LegalityJudgment(int e) {
		if((a+(b*c))<0 || (a+(b*c)>100)) {
			return false;
		}
		for(int i=1;i<e;i++) {
			if(a==Count[i].a && b==Count[i].b && c==Count[i].c) {
				return false;
			}
		}
		return true;
	}
	void PrintfFormula(int s) {
		System.out.print(" ");
		System.out.print(a + (c==1?" + ":" - ") + b + " = " + (a+b*c));
		if(s%5==0) 
			System.out.println();
		else
			System.out.print(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++) {
			Count count = new Count();
			count.GeneratingFormula();
			if(count.LegalityJudgment(i)==false) {
				i--;
				continue;
			}
			
			Count[i] = new Count(count.a,count.b,count.c);
			count.PrintfFormula(i);
		}
	}



}
