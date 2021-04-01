
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = args[0];
        String b = args[1];
        String s = b.replaceAll("\\*+", ".*");
        System.out.println(a.matches(s)? "OK":"KO");

	}

}
