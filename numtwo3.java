import java.util.*;

public class numtwo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1부터 100사이의 정수를 입력");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 입력하시오.");
			}
			if(input < answer) {
				System.out.println("더 큰 수로 입력하시오.");
			}
		}
			while(input!=answer);
		
			System.out.println("정답입니다.");
	}

}

