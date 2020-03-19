package day07;
import java.util.Arrays;

/*
 	깊은 복사
 */
import javax.swing.*;
public class Test02 {
		public Test02() {
			exec1();
		}
	public static void main(String[] args) {
		new Test02();
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] num2 = new int[20];
		
		//num1의 여섯번째에서 10번째  데이터를 복사해서 num2에 저장한다.
		System.arraycopy(num1, 5, num2, 10, 5);
		
		//복사가 된 이후에 num[7] 을  77로 변경해주자.
		num1[7] = 77;
		//두 배열의 내욜을 문자열로 만들어서 변수에 담아주세요
		String msg = "num1\t:" + Arrays.toString(num1) +
					"num2\t" + Arrays.toString(num2);
		
		JOptionPane.showMessageDialog(null,msg);

	}
	public void exec1() {
		
	}
	public void exec2(){
	int[] num1 = {1, 2, 3, 4, 5};
	
	int[] num2 = num1;
	for(int i= 0; i < 5; i++) {
		num2[10+ i] = num1[5+i];
		
	}
	String msg = "num1\t:" + Arrays.toString(num1) +
			"num2\t" + Arrays.toString(num2);

	JOptionPane.showMessageDialog(null,msg);
	}
		}

