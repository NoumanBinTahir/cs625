class Riders{
	public static void main(String[] args) {
		int ride[][]=new int[7][];
		ride[0]=new int [10];
		ride[1]=new int [10];
		ride[2]=new int [10];
		ride[3]=new int [10];
		ride[4]=new int [10];
		ride[5]=new int [2];
		ride[6]=new int [2];
	for(int i=0; i<5;i++ ) { 
		for(int j=0; j<10;j++ ) {
			ride[i][j]=(i*10)+j+1;
		}
	}
	for (int i=5; i<7;i++) {
		for (int j=0;j<2 ;j++ ) {
		ride[i][j]=(i*10)+j+1;			
			}		
		}
		for(int i=0; i<5;i++ ) {
		for(int j=0; j<10;j++ ) {
		System.out.print(ride[i][j]+"  ");
		}
		System.out.println("");
	}
	for (int i=5; i<7;i++) {
		for (int j=0;j<2 ;j++ ) {
		System.out.print(ride[i][j]+"  ");			
			}		
			System.out.println("");
		}
	}

}
