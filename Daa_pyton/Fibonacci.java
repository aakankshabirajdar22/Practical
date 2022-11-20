
//non-recursive
class Fibonacci
{


	static int fib(int n)
	{
		long start =System.currentTimeMills();
	     int a=0,b=1,c;
	     if(n==0){
		return a;
		}
	     for(int i=2; i<=n;i++){
		c=a+b;
		a=b;
		b=c;
long end =System.currentTimeMills();
			}
return b;
	
}
public static void main(String args[])
{
	lon
	int n=8;
	System.out.print(fib(n));
	System.out.print(stopWatch.getTime());

}


}

/*
//Using recursion
class Fibonacci
{
	static int fib(int n)
	{
	     if(n<=1){
	                      return n;
		}
                         return fib(n-1)+ fib(n-2);
	}
public static void main(String args[])
{
	int n=1;
	System.out.print(fib(n));
}
}


*/

