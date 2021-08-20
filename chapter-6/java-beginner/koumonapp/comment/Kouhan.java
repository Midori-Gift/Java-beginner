package comment;

public class Kouhan {
	//	メソッド3つ目
	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	}

	//  メソッド4つ目
	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		class PrimeThread extends Thread {
			long minPrime;

			PrimeThread(long minPrime) {
				this.minPrime = minPrime;
			}

			public void run() {
				// compute primes larger than minPrime
				PrimeRun p = new PrimeRun(1);
				new Thread(p).start();
			}
		}
		Zenhan.doTogame();
	}
}

