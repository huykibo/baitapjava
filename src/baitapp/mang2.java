package baitapp;

import java.util.Scanner;

public class mang2 {

	public static void main(String[] args) {
		int cot, dong;
		System.out.println("Nhap so dong: ");
		Scanner nhapDuLieu =  new Scanner(System.in);
		dong = nhapDuLieu.nextInt();
		System.out.println("Nhap so cot: ");
		cot = nhapDuLieu.nextInt();
		int matran1[][] = new int[dong][cot];
		mang2 m = new mang2();
		m.nhapMaTran(matran1);
		

	}

	
	public static void nhapMaTran(int matran[][])
	{
		
		Scanner nhapDuLieu = new Scanner(System.in);
		for (int i=0; i < matran.length; i++);
			int i = 0;
			for (int j=0; j< matran[i].length; j++)
		{
			
			System.out.print(String.format("phan tu thu [%d,%d]: ", i+1, j+1));
			matran[i][j]=nhapDuLieu.nextInt();
		}
	}
}
