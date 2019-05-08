class Ir {
	public static void main(String args[] ) {
		int table [] [] = new int [7] [] ;
		table[0] = new int [10] ;
		table[1] = new int [10] ;
		table[2] = new int [10] ;
		table[3] = new int [10] ;
		table[4] = new int [10] ;
		table[5] = new int [2] ;
		table[6] = new int [2] ;

		for(int i=0;i<5;i++)
			for(int j=0;j<10;j++)
		  	    table [i] [j] = i + j + 10 ;

		for(int i=5;i<7;i++)
			for(int j=0;j<2;j++)
			table [i] [j] = i + j + 10 ;

		System.out.println("Tables per trip during this week :");

		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) 
			    System.out.print(table [i] [j] + " ") ;
		System.out.println();
		} 
		for(int i=5;i<7;i++) {
			for(int j=0;j<2;j++) 
			    System.out.print(table [i] [j] + " ") ;
		System.out.println();
		} 
	}
}