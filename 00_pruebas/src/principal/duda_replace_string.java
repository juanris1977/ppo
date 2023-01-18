package principal;

public class duda_replace_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta= ta.concat(tb);
		System.out.println(ta);
		ta.replace('C', 'D');
		System.out.println(ta);
		ta = ta.concat(tb);
		System.out.println(ta);
		// A B C D 
		// A C D 
		// A B C C     , RESULTADO
		// A B D 
		// A B D C    , YO CREIA
	}

}
