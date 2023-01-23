package co.in.CoreJava;

import java.io.IOException;

public class CommandLineExp {
public static void main(String[] args) throws IOException {
	int ch = System.in.read();
	System.out.println("Selected char ASCII code " + ch);
	if (ch == 'A' || ch == 'a') {
		Add.main(args);
	}else if(ch == 'D' || ch == 'd') {
		DivisionExp.main(args);
	}
}
}
