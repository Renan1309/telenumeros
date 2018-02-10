import java.util.Scanner;

public class main {
	
  





public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  		String palavras = null ;
	
	  char a	= 'A' ; 
	  char b	= 'B' ;
	  char c	= 'C' ;
	  char d    = 'D' ;
	  char e    = 'E' ;
	  char f    = 'F' ;
	  char g    = 'G' ;
	  char h    = 'H' ;  
	  char i    = 'I' ;
	  char j    = 'J' ;
	  char k   =  'K' ;
	  char l    = 'L' ;   
	  char m    = 'M' ;
	  char n   =  'N' ;
	  char o    = 'O' ;
	  char p    = 'P' ;
	  char q  =   'Q' ;
	  char r    = 'R' ;
	  char s    = 'S' ;
	  char t   =  'T' ;
	  char u    = 'U' ;
	  char v    = 'V' ;
	  char x   =  'X' ;
	  char z    = 'Z' ;
	  char w   =   'W';
	  char y =     'Y';
	  char ziro =  '0' ; 
	  char number =   '1';
	 
	  
	  
	 
	
	while (sc.hasNext() ) {
		String digitado = sc.next();
		if(digitado.equals(null)) {
			
			System.out.print("não deu ");
		}
		else {
		
		StringBuilder buffer = new StringBuilder();
		char [] letras = digitado.toCharArray();
		
		
	
	  
	  for (int op = 0; op < letras.length; op++) {
		  
		  if (letras[op] == a || letras[op]== b|| letras[op]==c  ) {
			  
			  buffer.append('2');
			  
		  }
		  else  if (letras[op] == d || letras[op]== e|| letras[op]== f ) {
			  
			  buffer.append('3');
			  
		  }
         else  if (letras[op] == g || letras[op]== h|| letras[op]== i ) {
			  
        	 buffer.append('4');
			  
		  }
         else  if (letras[op] == j || letras[op]== k|| letras[op]== l ) {
			  
        	 buffer.append('5');
			  
		  }
         else  if (letras[op] == m || letras[op]== n|| letras[op]== o ) {
			  
        	 buffer.append('6');
			  
		  }
         else  if (letras[op] == p || letras[op]== q|| letras[op]== r ||letras[op] == s ) {
			  
        	 buffer.append('7');
			  
		  }
         else  if (letras[op] == t || letras[op]== u|| letras[op]== v ) {
			  
        	 buffer.append('8');
			  
		  }
         else  if (letras[op] == w || letras[op]== x|| letras[op]== y || letras[op]== z) {
			  
        	 buffer.append('9');
			  
		  }
         else if (letras[op] == number ) {
        	 
        	 buffer.append('1');
         }
         else if (letras[op]== ziro) {
        	 buffer.append('0');
         }
         
		  
		  else   {
			  buffer.append('-');
			  
		  }
		
		
			
	}
	  System.out.println(buffer );
		

	  
	  
	  
}
		
 	
} 
	
	
	
}

}

