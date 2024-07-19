package gitproject;

public class Add {
public void add(int i,int j)
{
	int sum=i+j;
	System.out.println("sum is::"+sum);
}
	public static void main(String[] args) {
		System.out.println("**::Addition::**");
		new Add().add(12,12);
	}
}
