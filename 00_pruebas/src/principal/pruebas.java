package principal;

interface readable {
	public void r1();
	public void r2();
}

abstract class book implements readable {
	public void r1() {		
	}
	
}
abstract class Ebook extends book {
	public void r1 () {}
	
}