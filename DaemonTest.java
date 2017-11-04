/*created class as DaemonTest extend this class with runnable interface making first thread object as deamon and showing difference between the two created thread object*/
package threadobject;//created package as threadobject

  public class DaemonTest extends Thread//created class as daemontest
                                      //classes are the basics of opps(object oriented programming)
{
	public void run(){//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread : " + Thread.currentThread().getName());//system is used to return code
	        //out is a static member
			   //println is used to print text and gives output
		}
		else
		{
			System.out.println("user thread : " + Thread.currentThread().getName());//prints
		}
	}

          public static void main(String[]args)
          {
        	  DaemonTest test1 = new DaemonTest();//deamontest
        	  test1.setName("Thread 1");//thread1
        	  DaemonTest test2 = new DaemonTest();//deamontest2
        	  test2.setName("Thread 2");//thread2
        	  
        	  test1.setDaemon(true);//true
        	  test1.start();//starting test1
        	  test2.start();//starting test2
          }
}