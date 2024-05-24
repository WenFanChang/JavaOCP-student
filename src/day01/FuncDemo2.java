package day01;

public class FuncDemo2 {

	public static void main(String[] args) {
		//Math.pow(4,2) = 16.0 指數(次方)
		//Math.sqrt(16) = 4.0 開根號
		// a, b 兩點
		//a(x1, y1), b(x2,y2)
		//求a,b 兩點間的距離
		//設計一個方法來實現
		//方法名稱: getDistance
		
		int x1=10, y1=20, x2=-15, y2=50;
		// double distance = getDistance( x1, x2 , y1, y2);
		// System.out.println(distance);
		System.out.println(getDistance( x1, x2 , y1, y2));
		
		int a1=0, b1=5, a2=5, b2=0;
		double distance2 = getDistance(a1, a2, b1, b2);
		System.out.println(distance2);
		

	}
	private static double getDistance(int x1, int x2, int y1, int y2) {
		double a = Math.pow(x1 - x2, 2);
		double b = Math.pow(y1 - y2, 2);
		double c = a + b;
		
		double distance = Math.sqrt (c);
		return distance; 
		
		
		
	}
	

}
