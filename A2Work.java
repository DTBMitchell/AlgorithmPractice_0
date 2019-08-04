import java.util.Random;

public class A2Work {
	/*
	 * Grading:
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static long sum1(int N)//f(N) = 5N + 4 ; O(N) = N
	{
		long opCount = 0;

		opCount++;//1 - assignment
		long sum = 0;

		opCount+=2;//2: 1 - assignment, 1 - compare
		for(int i = 0; i < N; i++) //5N + 2 : 5 inside loop + 2 initialize
		{
			opCount+=2;
			sum++; //2 - increment

			opCount+=3; //3: 2 - increment, 1 - compare
		}
		//1 - Return statement
		opCount++;
		System.out.println("OpCount : "+opCount);
		return sum;
	}
	/*
	 * Grading:
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static long sum2(int N)//f(N) = 5N^2 + 5N + 4 ; O(N) = N^2
	{
		long opCount = 0;

		opCount++; //1 - assignment
		long sum = 0;

		opCount+=2; //2: 1 - assignment, 1 - compare
		for(int i = 0; i < N; i++)//5N^2 + 5N + 2
			//
		{

			opCount+=2; //2 - initialize
			for(int j = 0; j < N; j++) //5N, 5 - iNside loop
			{
				opCount+=2; //2 - increment
				sum++;

				opCount+=3;//3: 2 - increment, 1 - compare
			}

			opCount+=3;//3: 2 - increment, 1 - compare
		}

		opCount++; //1 - return
		System.out.println("OpCount : "+opCount);
		return sum;
	}
	/*
	 * Grading:
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static long sum3(int N)//f(N) = 5N^3 + 5N + 4 ; O(N) = N^3
	{
		long opCount = 0;

		opCount++; //1 - assignment
		long sum = 0;

		opCount+=2; //2: 1 - assignment, 1 - compare
		for(int i = 0; i < N; i++)
		{
			opCount+=2; //2: 1 - assignment, 1 - compare
			for(int j = 0; j < N*N; j++) // N^2 //5 inside loop that runs N^2 times
			{
				opCount+=2; //2 - increment
				sum++;

				opCount+=3;//3: 2 - increment, 1 - compare
			}

			opCount+=3;//3: 2 - increment, 1 - compare
		}

		opCount++; //1 - return statement
		System.out.println("OpCount : "+opCount);
		return sum;
	}
	/*
	 * Grading:
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static long sum4(int N)//f(N) = 5(((N^2)-N)/2) + 5N + 4 ; O(N) = (((N^2)-N)/2)
	{
		long opCount = 0;

		opCount++; //1 - assignment
		long sum = 0;

		opCount+=2; //2: 1 - assignment, 1 - compare
		for(int i = 0; i < N; i++)//5((N^2)-N)/2) + 5N + 2 // 5(((N/2)(N-1)) + N) + 2
		{
			opCount+=2; //2: 1 - assignment, 1 - compare
			for(int j = 0; j < i; j++)//5(N-1)
			{
				opCount+=2; //2 - increment
				sum++;

				opCount+=3;//3: 2 - increment, 1 - compare
			}
			opCount+=3;//3: 2 - increment, 1 - compare
		}

		opCount++; //1 - return statement
		System.out.println("OpCount : "+opCount);
		return sum;
	}
	/*
	 * Grading:
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static long sum5(int N)//f(N) =  ; O(N) = 
	{
		long opCount = 0;
		//opCount++; //1 - assignment
		long sum = 0;

		//opCount+=2; //2: 1 - assignment, 1 - compare
		for(int i = 0; i < N; i++)
		{
			opCount+=2; //2: 1 - assignment, 1 - compare
			for(int j = 0; j < i*i; j++)//5
			{
				opCount+=2; //2: 1 - assignment, 1 - compare
				for(int k = 0; k < j; k++) //5J
				{
					opCount+=2; //2 - increment
					sum++;

					opCount+=3;//3: 2 - increment, 1 - compare
				}
				opCount+=3;//3: 2 - increment, 1 - compare
			}
			opCount+=3;//3: 2 - increment, 1 - compare
		}

		//opCount++; //1 - return statement
		System.out.println("OpCount : "+opCount);
		return sum;
	}
	/*
	 * Grading:
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static long sum6(int N)//f(N) =  ; O(N) = 
	{
		long opCount = 0;
		long sum = 0;
		for(int i = 1; i < N; i++)//i starts at 1 to prevent division error in if statement
		{
			for(int j = 0; j < i*i; j++)
			{
				if(j%i == 0)
				{
					for(int k = 0; k < j; k++)
					{
						sum++;
					}
				}
			}
		}
		System.out.println("OpCount : "+opCount);
		return sum;
	}
	/*
	 * Grading:
	 * Correctly follow the described algorithm to complete the method - 1.5pt
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static int[] algorithm1(int N)//f(N) =  ; O(N) = 
	{
		long opCount = 0;
		int[] arr = new int[N];
		Random rand = new Random();
		/*
		 * Use the following method to fill the array
		 * For each position in the array, generate a random number between zero and N
		 * - If N = 10, random numbers should be 0-9
		 * Check if that random number is used in any previous position in the array
		 * - If it is used anywhere else, generate a new number and try again
		 * - If it is not used anywhere else, place it into the position and move forward
		 */
		for (int i = 0; i < N; i++) {
			int r = rand.nextInt(N);
			//opCount++;
			for (int j = 0; j < i; j++) {
				if(arr[j] == r){
					i--;
					opCount++;
					break;
				}
				arr[i] = r;
				opCount++;
			}
		}
		System.out.println("OpCount : "+opCount);
		return arr;
	}
	/*
	 * Grading:
	 * Correctly follow the described algorithm to complete the method - 1.5pt
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static int[] algorithm2(int N)//f(N) =  ; O(N) = 
	{
		long opCount = 0;
		int[] arr = new int[N];
		boolean[] used = new boolean[N];
		Random rand = new Random();
		/*
		 * Use the following method to fill the array
		 * For each position in the array, generate a random number between zero and N
		 * - If N = 10, random numbers should be 0-9
		 * Check if that used[random] is true
		 * - If it is, generate a new number and try again
		 * - If it is not, place it into the position, set used[random] = true, and move forward
		 */
		for (int i = 0; i < N; i++) {
			int r = rand.nextInt(N);
			//opCount++;

			if(!used[r]){
				used[r] = true;
				opCount++;

				arr[i] = r;
				opCount++;
			}
			else {
				i--;
				opCount++;
			}
		}

		System.out.println("OpCount : "+opCount);
		return arr;
	}
	/*
	 * Grading:
	 * Correctly follow the described algorithm to complete the method - 1.5pt
	 * Add operation counts - 0.5pt
	 * f(N) formula (show your work) - 0.5pt
	 * O(N) reduction - 0.5pt
	 */
	public static int[] algorithm3(int N)//f(N) = 5N ; O(N) =
	{
		long opCount = 0;
		int[] arr = new int[N];
		Random rand = new Random();
		/*
		 * Use the following method to fill the array
		 * Fill the arr with zero to N-1 in order
		 * Run a loop through each position
		 * - For each position, swap that position and a randomly chosen position
		 */

		for (int i = 0; i < N; i++) {
			arr[i] = i;
			opCount++;
		}

		for (int i = 0; i < N; i++) {
			int store = arr[i];
			opCount++;
			int r = rand.nextInt(N);
			opCount++;
			arr[i] = arr[r];
			opCount++;
			arr[r] = store;
			opCount++;
		}

		System.out.println("OpCount : "+opCount);
		return arr;
	}
}
