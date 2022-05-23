package hbasestartertest.hbase.engine;

public class mode1 extends Engine{
    static boolean isStart;


    public static void setIsStart(boolean isStart) {
        mode1.isStart = isStart;
    }

    @Override
    public String startEngine(){
        setIsStart(true);
        return "进入行走状态--，";
    }

    @Override
    public String shutDown(){
        setIsStart(false);
        return "mode1 stops!";
    }
}
