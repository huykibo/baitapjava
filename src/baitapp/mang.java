package baitapp;

import java.util.Scanner;

public class mang {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	//tinhtong
	float[]a = {1,4,3,5,6,4};
	float b[];
	b= new float[3];
	b[0]=1;
	b[1]=5;
	b[2]=8;
	float sA = mang.tong(a);
	float sB = mang.tong(b);
	System.out.printf("tinh tong cua mang");
	System.out.printf("\nA=%f",sA);
	System.out.printf("\nb=%f",sB);
	float[] ks = mang.MinMaxAver(a);
	System.out.printf("\nmax= %f, min=%f, ave=%f", ks[0], ks[1],ks[2]);
	float s = mang.tsnt(a);
	float s= mang.ktsnt(sA);
	
	//tim min max raverage
	}
 
	/**
	 * tinh tong cua cac phan tu may tinh
	 */
	
	
	public static float tong(float[] mang)
	{
		int n = mang.length;
		float s=0;
		
		for (int i=0;i<n;i++)
		{
			s = s+mang[i];
		}
		return s;
	}
	/**
	 * tim min, max averrage cua mang
	 * @param mang Mang dau vao
	 * @return mag lu 3 gia tri min max average
	 */
	public static float[]MinMaxAver(float [] mang) {
		float[] mma=new float [3];
		mma[0]=min(mang);
		mma[1]=max(mang);
		mma[2]=average(mang);
		return mma;
	}
		static float min(float[] mang)
		{
		{
			float m = mang[0];
			for(int i=1;i<mang.length;i++)
			{
				if(m<mang[i])
				{
					m= mang[i];
				}
			}
			return m;
		}
	}
		//max
		static float max(float[] mang)
		
		{
		{
			float m = mang[0];
			for(int i=1;i<mang.length;i++)
			{
				if(m>mang[i])
				{
					m= mang[i];
				}
			}
			return m;
		}
	}
		static float average(float[] mang)
		{
			float s=0;
			float ave=0;
			for ( int i=0; i<mang.length;i++)
			{
				s+=mang[i];
				float aver1 = s/mang.length;
				
			}
			return ave;
		}
		/**
		 * tinh tong cac so nguyen to
		 */
		public static boolean ktsnt(float a)
		{
			int n= (int )a;
			if (n==a)
			{
				if(n<2)
				{
					return false;
				}
				int d=(int) Math.sqrt(n);
				for (int i=0;i<=d;i++)	
				{
					if(n%i==0)
					{
						return false;
					}
					return true;
				}
				return false;
			}
			return false;
		}
		public static float tsnt(float[] mang)
		
		{
			float s=0;
			for ( int i=2;i<mang.length;i++)
			{
				if(ktsnt(mang[i]))
				{
					s=s+mang[i];
				}
			
			}
			return s;
		}
}
