import javax.swing.text.Utilities;
import java.util.Scanner;

public class StopWatch
{
      public long startTimer=0;
      public long  endTimer=0;
      public long elapsed;
      //start timer
    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is :"+startTimer);
    }

    public void stop()
    {
        endTimer=System.currentTimeMillis();
        System.out.println("End Time is "+endTimer);
    }

    public long getElapsedTime()
    {
        elapsed=endTimer-startTimer;
        return elapsed;
    }


public class Main {

    public static void main(String[] args) {
            StopWatch sw = new StopWatch();
             Scanner u=new Scanner(System.in);
             System.out.println("Press 1 to Start time");
             u.nextInt();
             sw.start();

            System.out.println();
            System.out.println("Press 2 to Stop time");
            u.nextInt();
            sw.stop();

            long l=sw.getElapsedTime();
            System.out.println();
            System.out.println("Total Elapsed(in millisec) is"+l);
            System.out.println();
            System.out.println("Converting millisec to second"+(1/1000)+"sec");

        }
    }
}