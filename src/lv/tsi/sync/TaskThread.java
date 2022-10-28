package lv.tsi.sync;

public class TaskThread extends Thread {
    private Thread thread;
    private int taskId;
    private TaskManager myTask;

    public TaskThread(int taskId, TaskManager myTask, String thrName) {
        super(thrName);
        this.taskId = taskId;
        this.myTask = myTask;
    }

    public void run() {
        myTask.performTask(taskId);
    }
}