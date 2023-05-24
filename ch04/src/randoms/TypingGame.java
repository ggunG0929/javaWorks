package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"river", "mountain", "sky", "earth", "moon", "tree", "flower", "cow", "pig", "horse"};
	    int n = 1;
	    long start, end;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("영어타자 게임, 준비되면 엔터!");
	    sc.nextLine();
	    start = System.currentTimeMillis();		// 게임시작시간측정
	    while(n <= 10) {
	        int rand = (int)(Math.random()*words.length);
	        System.out.printf("문제 %d\n", n);
	        String question = words[rand];
	        System.out.println(question);
	        String user = sc.nextLine();
	        if(user.equals(question)) {
	            n++;
	            System.out.println("통과!");
	        }else {
	            System.out.println("오타! 다시 도전!");
	        }
	    }
	    end = System.currentTimeMillis();
	    System.out.printf("게임 소요 시간은 %d초입니다.", (end-start)/1000);
	    sc.close();
	}

}
