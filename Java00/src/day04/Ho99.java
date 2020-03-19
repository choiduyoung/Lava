package day04;
/*
 	반복문을 사용해서 다음 모양을 출력하세요.
 	
 	1.
 		*
 		**
 		***
 		****
 		*****
 		
 	2.
 		    *
 		   **
 		  ***
 		 ****
 		*****
 	3.
 		*****
 		****
 		***
 		**
 		*
 	4.
 		*****
 		 ****
 		  ***
 		   **
 		    *
 	5.
 			 *
 			***
 		   *****
 		  *******
 		 *********
 	6.
 		     *
 			***
 		   *****
 		  *******
 		 *********
 		  *******
 		   *****
 		    ***
 		     *
 		    
 	7. 
 		    1
 		    12
 		    123
 		    1234
 		    12345
   7-0
   			12345
   			12345
   			12345
   			12345
   7-1 		
 			1  2  3  4  5
 			6  7  8  9  10
 			11 12 13 14 15
 			16 17 18 19 20
 			
 	8. 			1
 			   12
 			  123
 			 1234
 			12345
 	9
 		12345
 		1234
 		123
 		12
 		1
 	10
 		1
 		2  3
 		4  5  6
 		7  8  9  10
 		11 12 13 14 15
 		
 	00
 		1 1 1 1 1
 		2 2 2 2 2
 		3 3 3 3 3
 		4 4 4 4 4
 		5 5 5 5 5
 */
public class Ho99 {

	public static void main(String[] args) {
		

		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------");
		for(int i=1;i<6;i++){
			for(int j=5;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------");
		for(int i=6;i>1;i--){
			for(int j=1;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
	}
		
		
		System.out.println("------------- 반장님 코드 ----------------");
		for(int i=5;i>0;i--){
			for(int j=5;j>0;j--){
				if(j>i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println("------------- 슨상님 코드 ----------------");
		for(int i=0;i < 5;i++){
			
			for(int j = 0 ; j < 5 ; j++) {
				String str = " ";
				if(j >= i) {
					str = "*"; 
				}
				System.out.print(str);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		System.out.println("-----------------------------------------");
		
		char a = 'A';
			for(int i = 0; i < 5 ; i++) {
				for(int j = 0 ; j < 5; j++) {
					System.out.print(" " + a++);
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------");
	
			for(int i = 1; i < 5 ; i++) {
				for(int j = 0 ; j < 5; j++) {
					System.out.printf("%3d " , i + j * 100);
				}
				System.out.println();
}
			System.out.println("-----------------------------------------");
			
			  
			  int n1, n2, n3;
			  n1 = 1;
			  n2 = 1;
			  
			  System.out.println(n1);
			  System.out.println(n2);
			  
			  for(int i = 3 ; i <= 10 ; i++){
			   n3 = n1 + n2;
			   System.out.println(n3);
			   n1 = n2;
			   n2 = n3;
			  }
			 }
			
}


