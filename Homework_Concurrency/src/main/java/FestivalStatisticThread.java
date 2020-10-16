import java.util.concurrent.TimeUnit;

public class FestivalStatisticThread extends Thread{

    Gate gate;

    public FestivalStatisticThread(Gate gate) {
        this.gate = gate;
        GetStats();
    }

    public synchronized void GetStats(){
        Runnable task = () ->{
            try {
                System.out.println("Getting stats from Main gate.");
                TimeUnit.SECONDS.sleep(5);
                gate.GateStats();
                System.out.println("Got Stats");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task);
        thread.start();

    }
}
