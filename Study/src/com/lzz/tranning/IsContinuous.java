package com.lzz.tranning;

import java.util.Arrays;
import java.util.Scanner;

/**
   *   ÆË¿ËÅÆË³×Ó
 * @author CunsiALIEN
 *
 */
public class IsContinuous {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cards = new int[5];
		while(sc.hasNext()) {
			cards[0] = sc.nextInt();
			cards[1] = sc.nextInt();
			cards[2] = sc.nextInt();
			cards[3] = sc.nextInt();
			cards[4] = sc.nextInt();
			System.out.println(isContinuous(cards));
		}
		sc.close();
	}
	
	public static boolean isContinuous(int[] numbers) {
		Arrays.sort(numbers);
		int countZero = 0;
		for(int i = 0 ; i < numbers.length - 1 ; i++) {
			if(numbers[i] == 0) {
				countZero++;
				continue;
			}
			if(numbers[i+1] - numbers[i] < 1 || numbers[i+1] - numbers[i] - 1> countZero) {
				return false;
			}
			else if(numbers[i+1] - numbers[i] > 1){
				countZero -= (numbers[i+1] - numbers[i] - 1);
			}
		}
		return true;
	}
}
