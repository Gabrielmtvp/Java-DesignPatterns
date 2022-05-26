package StringsAreImmutable;

public class StringsAreImmutableMain {

	//In java String Object are IMMUTABLE but STRINGBUFFER are mutable. That's the diference.
	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("Gabriel");
		StringBuffer lastName = new StringBuffer("Pacheco");
		System.out.println("A"+name+"B"+lastName);
		swap(name,lastName);
		System.out.println("A"+name+"B"+lastName);
	}

	public static void swap(StringBuffer a, StringBuffer b) {
		StringBuffer nameA = new StringBuffer(a);
		StringBuffer nameB = new StringBuffer(b);
		
		a.delete(0, a.length());
		b.delete(0, b.length());
		
		a.insert(0, nameB);
		b.insert(0, nameA);
	}
		
}
