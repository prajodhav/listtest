import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Integer middleIndex(List<Integer> integers) {
		
		Integer [] a = new Integer [integers.size()];
		integers.toArray(a);
		Arrays.sort (a);
		int sumLeft = 0;
		int currIndex = -1;
		int currValue = 0;
		int sumRight = (integers.stream().mapToInt(x -> x.intValue()).sum()) - a[0];
		
		for (int i=1; i< (a.length -1); i++) {
			sumLeft += a[i-1];
			sumRight -= a[i+1];
			if (sumLeft == sumRight) {
				if (currIndex == -1) {
					currIndex = 0;
					currValue = a[i]; 
				} else {
					if (currValue > a [i]) {
						currValue = a[i];
					}
				}
			}
		}
		return integers.indexOf(currValue);
	}
}
