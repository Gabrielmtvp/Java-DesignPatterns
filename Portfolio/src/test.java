
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Gabriel";
		String b = "Pacheco";
		System.out.println("a"+a + "b"+ b);
		swap(a,b);
		System.out.println("a"+a + "b"+ b);
	}
	
	 public static void swap(String a, String b) {
		 String nameA = a;
		 String nameB = b;
		 
		 a = nameA;
		 b = nameB;
		 
		 return;
	 }

}
