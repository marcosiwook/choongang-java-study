package ch11;
import java.util.*;

public class Lotto2 {

	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			int num = (int)(Math.random()*45) + 1;
			lotto.add(num); // 중복 체크 안해도 됨.
		} 
		System.out.println(lotto);
	}

}
