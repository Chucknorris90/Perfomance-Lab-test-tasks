import java.io.IOException;

public class Task1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		if (args.length!=2) {
			NonValidInput();
			System.exit(1);
		}
			
        int i = Integer.parseInt(args[0]);
        
        String sNu = args[1];
        
        
        if (sNu.equals("01")) {
        	int q = 2;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        
        if (sNu.equals("012")) {
        	int q = 3;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        
        if (sNu.equals("0123")) {
        	int q = 4;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        
        if (sNu.equals("01234")) {
        	int q = 5;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equals("012345")) {
        	int q = 6;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equals("0123456")) {
        	int q = 7;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equals("01234567")) {
        	int q = 8;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equals("012345678")) {
        	int q = 9;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equals("0123456789")) {
        	int q = 10;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("0123456789a")) {
        	int q = 11;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("0123456789ab")) {
        	int q = 12;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("0123456789abc")) {
        	int q = 13;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("0123456789abcd")) {
        	int q = 14;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("0123456789abcde")) {
        	int q = 15;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("0123456789abcdef")) {
        	int q = 16;
        	System.out.println("В "+q+"-ной системе счисления " + i + " выглядит как " + Integer.toString(i, q));
        	System.exit(0);
        }
        if (sNu.equalsIgnoreCase("котики")) {
        	int q = 10;
        	System.out.println("В котеечной системе счисления " + i + " выглядит как " + Integer.toString(i, q)+" котеек.");
        	System.exit(0);
        }
        
			NonValidInput();
		
	}

	private static void NonValidInput() {
		System.out.println("Ошибка ввода аргументов! Функция имеет 2(!) аргумента и следующий прототип:\r\n"
				+ "String intoBase(unsigned int nb, String base); nb - это подаваемое число, base - система исчисления.\r\n"
				+ "Например, 01 - двоичная, 012 - троичная, 0123456789abcdef - шестнадцатиричная, котики - система исчисления в котиках.");
	}
}
