package baitapp;
import java.lang.Math;
import java.util.Scanner;

public class baitap1 {
	 
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
           //bai 1
	        System.out.println("Bai 1 :Phuong trinh bat 2");

		        System.out.print("Nhập hệ số bậc 2, a = ");
		        float a = sc.nextFloat();
		        System.out.print("Nhập hệ số bậc 1, b = ");
		        float b = sc.nextFloat();
		        System.out.print("Nhập hằng số tự do, c = ");
		        float c = sc.nextFloat();
		        baitap1.giaiPTBac2(a, b, c);
		        //bai2
		        int n ;
		        System.out.println("\nbai 2 tinh giai thua ");
		        System.out.println("Nhap n: ");
		        n = sc.nextInt();
		        System.out.println(giaithua(n)); 
		        baitap1.giaithua(n);
		        //bai 3
		        System.out.println("\nBai 3: chương trình tìm số Fibonacci thứ n ");
		        int p;
		        System.out.print("Nhập p ");
		        p = sc.nextInt();
		        System.out.println("Số Fibonacci thứ " + p + " là: " + fibonacci(p)); 
		        baitap1.fibonacci(p);
	         //bai 4
		        System.out.println("\nBai 4: ước chung lớn nhất (UCLN) và bội số chung nhỏ nhất");
		        System.out.println("Nhập a va b:  ");
		        int e = sc.nextInt();
		        int d = sc.nextInt();
		        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln(e, d));  
		        System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn(e, d));
		        baitap1.bcnn(n, n);
		        baitap1.ucln(n, n);
		        //cau 5
		        System.out.println("\nBai 5: so luong so nguyen to nho hon n  ");
		        System.out.println("Nhập so luong so nguyen to nho hon n:  ");
		        n = sc.nextInt();
		        baitap1.SNTN(n);
		        //cau 6
		        System.out.println("\nBai 6:liet ke n so nguyen to dau tien ");
		        System.out.println("\nNhập số lượng số nguyên tố cần liệt kê: ");
		        n = sc.nextInt();
		        baitap1.SNTDT(n, n, n);
		        //cau7
		        System.out.println("\nBai 7: liet ke tất cả các số nguyên tố có 5 chữ số");
		        System.out.println(" Nhập số lượng số nguyên tố cần liệt kê co 5 chu so: ");
		        n = sc.nextInt();
		        for (int i = 10000; i <= 99999; i++) {
		            if (SNT5CH(i)) {
		                System.out.print(i+ " ");
		            }
		        }
		        baitap1.SNT5CH(n);
		        //cau 8
		        System.out.println("\nBai 8: tổng các chữ số của một số nguyên n  ");
		        System.out.println(" Nhap tính tổng các chữ số của một số nguyên n  ");
		        n = sc.nextInt();
		        baitap1.TCSN(n, n);
		        //bai 9
		        int number ;
		        System.out.println("\nBai 9 kiểm tra một số có phải là số thuần nghịch ");
		        number = sc.nextInt();
		        System.out.println("  nhap một số có phải là số thuần nghịch ");
		        System.out.println("Số " + number + " có phải là số thuần nghịch không: " + isPalindrome(number));
		        baitap1.isPalindrome(number);
		        //bai 10
		        
		        System.out.println("\nBai 10 :Hãy liệt kê các số Fibonacci nhỏ hơn n là số nguyên tố bằng java");
		        System.out.println("\nNhập số tự nhiên n");	
		        n= sc.nextInt();
		        baitap1.lietKe(n);
		       
	}
	//bai 1
	 public static void giaiPTBac2(float a, float b, float c) {
	        // kiểm tra các hệ số
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!"); 
	                System.out.println("Phương trình có một nghiệm: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        // tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	    }
	 //bai 2
	 public static long giaithua(int n)
	 {
	 {
		 if (n <= 1) {
		      return 1;
		    }
		    return n * giaithua(n-1);
		  }
	 }
	 // bai 3
	 public static int fibonacci(int p) {
		    if (p <= 1) {
		      return p;
		    }
		    return fibonacci(p-1) + fibonacci(p-2);
		  }

	 //bai 4
	 public static int bcnn(int e, int d) {
		    while (d != 0) {
		      int temp = d;
		      d = e % d;
		      e = temp;
		    }
		    return e;
		  }
	 public static int ucln(int e, int d) {
		    return e * d / bcnn(e, d);
		  }
	 //bai5
	 public static void SNTN (int n)
	 {
		 
		        for (int i = 2; i < n; i++) {
		            boolean laSNT = true;
		            for (int j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    laSNT = false;
		                    break;
		                }
		            }
		            if (laSNT) {
		                System.out.print(i + " ");
		            }
		        }
		    }
	 
	 //bai 6
	 public static void SNTDT(int n, int num, int count)
	 {
		   num = 2;
	         count = 0;
	        while (count < n) {
	            boolean SNT = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    SNT = false;
	                    break;
	                }
	            }
	            if (SNT) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }
	      
	 }
	 //bai 7
	 public static boolean SNT5CH(int n)
	 {
		   if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 //bai 8
	 public static void TCSN(int n, int sum)
	 {
	  sum =0;
	 {
		 while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }

	        System.out.println("Tổng các chữ số: " + sum);
	 }
	 }
// bài 9
	 public static boolean isPalindrome(int number)
	 {
		    int sogoc = number;
		    int daonguoc = 0;
		    while (number != 0) {
		      int socuoi = number % 10;
		      daonguoc = daonguoc * 10 + socuoi;
		      number /= 10;
		    }
		    return sogoc == daonguoc;
		  }

//bai 10
	 public static boolean snt(int n) {
			if(n<2)
				return false;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
			
		}
	public static boolean checkFibonacci(int n) {
			if (n ==0 || n == 1) return true;
			int f1 = 1;
			int f2 = 0;
			for (int i = 3; i<93; i++) {
				int f = f1 + f2;
				if (f == n) return true;
				f2 = f1;
				f1 = f;
			}
			return false;
		}
	public	static void lietKe(int n) 
	{
			System.out.print("So Fibonacci nho hon n va la so nguyen to: ");
			for (int i=0; i<n ;i++) {
				if (checkFibonacci(i) && snt(i))
					System.out.print(i + " ");
			}
			System.out.println("\n");
		}
}
	 

