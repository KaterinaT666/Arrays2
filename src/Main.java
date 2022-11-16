
public class Main {
	public static void main(String[] args) {
		// Задача 1
		System.out.println("Задача 1");
		{
			java.util.Random random = new java.util.Random();
			int[] arr = new int[30];
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(100_000) + 100_000;
				sum += arr[i];
			}
			System.out.println(" Сумма трат за месяц составила " + sum + " рублей");
		}
		// Задача 2
		System.out.println("Задача 2");
		{
			java.util.Random random = new java.util.Random();
			int[] arr = new int[30];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(100_000) + 100_000;
			}
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
			System.out.println(" Минимальная сумма трат за день составила " + min + " рублей");
		}
		int max = arr [0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(" Максимальная сумма трат за день составила " + max + " рублей" );

		// Задача 3
		System.out.println("Задача 3");
		{
			java.util.Random random = new java.util.Random();
			int[] arr0 = new int[30];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(100_000) + 100_000;
			}
			double ave = 0;
			for (int i = 0; i < arr.length; i++) {
				ave += arr [i]/arr.length;
			}
			System.out.println(" Средняя сумма трат за месяц составила " + ave + " рублей" );
		}
		// Задача 4
		System.out.println("Задача 4");
		{
			char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
			int n = reverseFullName.length;
			char temp;
			for (int i = 0; i < n/2; i++) {
				temp = reverseFullName[n - i - 1];
				reverseFullName[n - i - 1] = reverseFullName[i];
				reverseFullName[i] = temp;
			}
				for (int i = 0; i < reverseFullName.length; i++) {
					System.out.print(reverseFullName[i]);
				}


		}


	}
	static int[] arr = generateRandomArray();

	public static int[] generateRandomArray() {
		java.util.Random random = new java.util.Random();
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100_000) + 100_000;
		}
		return arr;
	}
}