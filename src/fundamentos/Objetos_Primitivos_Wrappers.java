package fundamentos;

public class Objetos_Primitivos_Wrappers {
	public static void main(String[] args) {
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3; 
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		System.out.println(c.toString().length());
		System.out.println(bo.toString());
		System.out.println(b.toString());
		System.out.println(s.toString());
		System.out.println(i.toString());
		System.out.println(l.toString());
		System.out.println(f.toString());
		System.out.println(d.toString());
	}
}
