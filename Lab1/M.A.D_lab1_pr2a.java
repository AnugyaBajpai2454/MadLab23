/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int rows=4, j=0;
		for(int i=1;i<=rows;++i,j=0)
		{
		    for (int space=1;space<=rows-i;++space)
		    {
		        System.out.print(" ");
		    }
		    while(j!=2*i-1)
		    {
		        System.out.print("*");
		        ++j;
		    }
		    System.out.println();
		    
		}
	}
}
