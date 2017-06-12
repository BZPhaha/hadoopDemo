package bzphahacn.rpc;

import java.util.LinkedList;

public class test {
	public static void main(String[] args)
	{
		for(int i = 1;i<6;i++){
			if(i < 4){
				for(int j = 0;j<(4-(i-1)*2);j++){
					System.out.print(" ");
				}
				for(int j1 = 0;j1<(2+(i-1)*4);j1++){
					System.out.print("*");
				}
				System.out.println();
			}
			if(i>3){
				for(int j2 = 0;j2 <((i-1)*2-4);j2++){
					System.out.print(" ");
				}
				for(int j3=0;j3<(2+(5-i)*4);j3++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

//2+(n-1)*4
//4--2
//5--1
//2+(6-n)*4


//4  2 0 2 4
