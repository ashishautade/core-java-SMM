package thrds3;
import static java.lang.Thread.currentThread;

public class MyRunnableTask implements Runnable {
	// MyRunnableTask IS NOT A Thread
	//MyRunnableTask IS-A Runnable : YES (i.e it has run() => B.L of a thread)
	

	@Override
	public void run()// throws InterruptedException
	{
		System.out.println(currentThread().getName() + " strted");
		// B.L
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(currentThread().getName() + " thrd , exec # " + i);
					Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " thrd got exc : " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}
}
