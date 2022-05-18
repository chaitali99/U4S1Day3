package com.masai;

public class VowelConsonent {
	public static void main(String args[]) {
		VowelConsonent vc=new VowelConsonent();
		vc.vowelConsonent('a');
	}
	void vowelConsonent(char ch){
		if(ch == 'a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			System.out.println("Vowel");
		}else if(ch=='b'||ch=='B'||ch=='c'||ch=='C'||ch=='d'||ch=='D'||ch=='f'||ch=='F'||ch=='g'||ch=='G'||ch=='h'||ch=='H'||ch=='j'||ch=='J'||ch=='k'||ch=='K'||ch=='l'||ch=='L'||ch=='m'||ch=='M'||ch=='n'||ch=='N'||ch=='p'||ch=='P'||ch=='Q'||ch=='q'||ch=='r'||ch=='R'||ch=='s'||ch=='S'||ch=='t'||ch=='T'||ch=='v'||ch=='V'||ch=='w'||ch=='W'||ch=='x'||ch=='X'||ch=='y'||ch=='Y'||ch=='z'||ch=='Z') {
			System.out.println("Consonent");
		}else {
			System.out.println("Inavalid Character");
		}
	}
}
