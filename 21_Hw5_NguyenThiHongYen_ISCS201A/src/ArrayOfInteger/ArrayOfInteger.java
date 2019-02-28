package ArrayOfInteger;
import java.util.Scanner;
public class ArrayOfInteger 
{
	private static Scanner sc;
	private int [] a =new int[100];
	private int n;
	public void input() 
	{
		sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("enter element"+i+": ");
			a[i]=sc.nextInt(); 
		}
	}

	public void output() 
	{
		for(int i=0;i<n;i++) {
			System.out.println("a["+i+"]"+"="+a[i]);
		}
	}
	public void output1() 
	{
		for(int i=0;i<n;i++) 
		{
			if(a[i]%2==0) System.out.println("a["+i+"]"+"="+a[i]);
		}
	}
	public int ouput1() 
	{
		int s=0;
		for(int i=0;i<n;i++) 
		{
			if(a[i]%2!=0)
				s=s+1;
		}
		return s;
	}
	public int ouput2() 
	{
		int s=0;
		for(int i=0;i<n;i++) 
		{
			if(a[i]%2==0) 
				s=s+a[i];
		}
		return s;
	}
	public int ouput3() 
	{
		int s=0;
		int dem=0;
		for(int i=0;i<n;i++) 
		{
			if(a[i]%2==0 && a[i]%3==0)
			{
				s=(s+a[i]);
				dem++;
			}
		}
		return s/dem;
	}

	public int ouput4() 
	{
		int s=0;
		for(int i=0;i<n;i++) 
		{
			s=(s+a[i]);
		}
		return s;
	}
	public int max() 
	{
		int max = a[0];
		for(int i=0;i<n;i++) 
		{
			if(a[i]>max) max=a[i];
		}
		return max;
	}
	public boolean find(int x)
	{
		for(int i=0;i<n;i++) 
		{
			if(x==a[i]) return true;
		}
		return false;
	}
	public boolean findobbs()
	{
		for(int i=0;i<n;i++) 
		{
			if(a[i]%2!=0) return true;
		}
		return false;
	}
	public boolean findobbs1()
	{
		for(int i=0;i<n;i++) 
		{
			if(a[i]%2==0) return false;
		}
		return true;
	}
	public void remove() {
		int index;
		do {
			System.out.println("Enter index: ");
			index=sc.nextInt();
		}while(index<0);
		for(int i= index;i<n;i++) {
			a[i]=a[i+1];
		}
		n--;
		a[n]=0;
	}
	public void insert() 
	{
		int index;
		do {
			System.out.println("Enter index: ");
			index=sc.nextInt();
		}while(index<=0);
		System.out.println("Enter element that you want to insert");
		int X=sc.nextInt();	 
		for(int i=n;i>index ;i--) 
		{
			a[i]=a[i-1];
		}
		a[index]=X;
		n++;
	}
	public void sort() 
	{
		for(int i=0;i<n-1;i++) 
		{
			for( int j=n-1;j>i;j--) 
			{
				if(a[j]<a[j-1]) 
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public void sumOfArray() 
	{
		//calculate the max sum of the two index of near value
		int summax=a[0]+a[1];
		int index1 = 0,index2=1;
		for(int i=0;i<n-1;i++) 
		{
			index1=i;
			index2=i+1;
			int sum1=a[i]+a[i+1];
			if(sum1>summax) summax=sum1;

		}
		System.out.println("order: "+index1+ "&"+index2+"sum: "+summax);

	}
	public void sum() 
	{
		// calculate the max sum of two max number
		int index1=0; int index2=1;
		int summax=a[0]+a[1];
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) 
			{
				int sum1=a[i]+a[j];
				if(sum1>summax) summax=sum1;
				index2=j;
				index1=i;
			}
		}
		System.out.println("order: "+index1+ "&"+index2+"summax: "+summax );

	}
	// kiem tra so nguyen to
	private Boolean isFrime(int x) 
	{
		if(x<=1) return false;
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0) return false;	
		}return true;
	}
	public void listFrime() 
	{
		for(int i=0;i<n;i++) {
			Boolean kt=isFrime(a[i]);
			if(kt== true) System.out.println(a[i] +"la so nguyen to");

		}
	}
	//delete negative value
	private Boolean delete(int x)
	{
		if(x>=0) return true;
		else return false;
	}
	public void listPositiveNumber() 
	{
		for(int i=0;i<n;i++) {
			Boolean kt=delete(a[i]);
			if(kt==true) System.out.println("a["+i+"]"+"="+a[i]);
		}
	}
	//remove nagetive value
	public void removeNegative(int index) {
		for(int i= index;i<n-1;i++) {
			a[i]=a[i+1];
		}
		n--;
		a[n]=0;
	}
	public void removeNegative() 
	{
		for(int i=n-1;i>=0;i--) {
			if(a[i]<0 ) removeNegative(i);
		}
	}
	// check incremental array
	private Boolean  incrementalArray() 
	{
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) 
			{
				if(a[i]>a[j]) return false;
			}
		}
		return true;
	}
	// check mang doi xung
	public Boolean checkSymmertricalArry() 
	{
		for(int i=0;i<(n/2);i++) {
			if(a[i]!=a[n-i-1])
				return false;
		}
		return true;
	}
	// Dao Nguoc Mang
	public void reserveArray() 
	{
		for (int i=0;i<n/2;i++){
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
	}
	//chen X vao mang sao cho mang tang dan
	public void sortAndInsert() {
		for(int i=0;i<n;i++) 
		{
			for( int j=n-1;j>i;j--) 
			{
				if(a[j]<a[j-1]) 
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			System.out.println("a["+i+"]"+"="+a[i]);
		}
		int X;
		sc=new Scanner(System.in);
		System.out.println("enter value that u wanna insert: ");
		X=sc.nextInt();
		for(int i=0;i<n;i++) 
			if(X<a[i]) {
				for(int j=n;j>i;j--) {
					a[j]=a[j-1];
				}
				a[i]=X;
				break;
			}
			else a[n]=X;
		n++;
	}
	//tinh tong cac so doi xung trong mang
	private Boolean sumOfSymmertricNumberinaArray(int X) 
	{
		int s=0;
		int k=X;
		do {
			int sd=X%10;
			s=s*10+sd;
			X=X/10;
		}while (X>0);
		if(s==k)  return true;
		else return false;
	}
	public int sumOfSymmertricNumberinaArray() {
		int s1=0;
		for(int i=0;i<n;i++) {
			Boolean kt= sumOfSymmertricNumberinaArray(a[i]);
			if(kt==true) {
				System.out.println("The symmertric number  a["+i+"]= "+a[i]);
				s1=s1+a[i];
			}
		}
		return s1;
	}
	// trung binh cong cua cac so doi xung trong mang
	private Boolean sumOfSymmertricNumberInArray1(int X) 
	{
		int s=0;
		int k=X;
		do {
			int sd=X%10;
			s=s*10+sd;
			X=X/10;
		}while (X>0);
		if(s==k)  return true;
		else return false;
	}
	public int sumOfSymmertricNumberInArray1() {
		int s1=0;
		int dem=0;
		for(int i=0;i<n;i++) {
			Boolean kt= sumOfSymmertricNumberInArray1(a[i]);
			if(kt==true) {
				dem=dem+1;
				System.out.println("The symmertric number  a["+i+"]= "+a[i]);
				s1=s1+a[i];
			}
		}
		System.out.print("The arithmetical mean of symmetric number in array is: ");
		return s1/dem;
	}
	public static void main(String[]args) 
	{

		ArrayOfInteger yen=new ArrayOfInteger();
		yen.input();
		yen.sum();
		//System.out.println( "The sum of symmetric number in array is: "+yen.sumOfSymmertricNumberinaArray());
		//System.out.println("The arithmetical mean of symmetric number in array is: "+yen.sumOfSymmertricNumberInArray1());
		/*yen.sortAndInsert();
		yen.output();*/
		/*yen.removeNegative();
		yen.output();*/
		//yen.listpositivenumber();
		//yen.listpositivenumber();
		//System.out.println(yen.sumofsymmertricnumberinarray1());
		/*yen.sortAndInsert();
		yen.output();*/
		/*System.out.println("array after reserving: ");
		yen.reserveArray();
		yen.output();*/
		//yen.Symmetricarray1();
		/*Boolean S=yen.checkSymmertricalArry();
		if(S==true) System.out.println(" Symmetric array");
		else System.out.println(" No Symmetric array");
*/
		//yen.sum();
		//yen.sumOfArray();
		/*Boolean S1=yen.incrementalarray();
		if(S1==true) System.out.println("incremental array");
		else System.out.println("No incremental array");*/
		/*yen.sort();*/
		/*System.out.print("the quatity of obb number: ");
		System.out.println(yen.ouput1());
		System.out.print("the sum of even number: ");
		System.out.println(yen.ouput3());
		System.out.print("the average: ");
		System.out.println(yen.ouput2());
		System.out.print("the sum of number: ");
		System.out.println(yen.ouput4());
		System.out.print("max: ");
		System.out.println(yen.max());
		boolean s=yen.find(5);
		if(s==true) System.out.println("co trong mang");
		else System.out.println("khong co trong mang");
		boolean o=yen.findobbs();
		if(o==true) System.out.println("exsist obbs");
		else System.out.println("no exsist obbs number ");
		boolean c= yen.findobbs1();
		if(c==true) System.out.println("all obbs in array");
		else System.out.println("no all obbs");
		 */
	}

}
