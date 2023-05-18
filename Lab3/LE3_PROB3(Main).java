/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		RubberDucks a=new RubberDucks();
		WoodenDucks w=new WoodenDucks();
		RedHeadDucks r=new RedHeadDucks();
		LakeDucks l=new LakeDucks();
		a.swim();
		//a.fly();
		a.quack();
		w.swim();
		//w.fly();
		//w.quack();
		r.swim();
		r.fly();
		r.quack();
		l.swim();
		l.fly();
		l.quack();
	}
}