package round1b;
import java.util.Scanner;


public class CounterCulture {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://code.google.com/codejam/contest/8224486/dashboard#s=p0
		int tests= Integer.parseInt(s.nextLine());
		long[] input = new long[tests];
		long[] output = new long[tests];
		getInput(input);
		for (int i=0;i<tests;++i){
			output[i]  = getMinNum(input[i]);
		}
		prlongOutput(output);
	}

	private static void getInput(long[] input) {
		// TODO Auto-generated method stub
		for(int i=0;i<input.length;i++){
			input[i] = Long.parseLong(s.nextLine());
		}
	}

	private static void prlongOutput(long[] output) {
		// TODO Auto-generated method stub
		for(int i=0;i<output.length;++i){
			System.out.println("Case #"+(i+1)+": "+ output[i]);
		}
	}

	private static long getMinNum(long N) {
		long count =0;
		long start =1;
		while(start<=N){
			long reverse = getReverse(start+"");
			if(reverse>(start+1) && reverse <=N){
				start = reverse;
				
			}else{
				start++;
			}
			count++;
//			System.out.prlongln(count+":"+start);
		}
		
		return count;
	}

	private static long getReverse(String start) {
		if(start.substring(start.length()-1).equals("0")){
			return 0;
		}
		StringBuilder temp= new StringBuilder(start);
		
		/*for(long i=start.length()-1; i>=0;i--){
			temp.append(start.substring(i, i+1));
		}*/
		temp = temp.reverse();
		
		return Long.parseLong(temp.toString());
	}

}
