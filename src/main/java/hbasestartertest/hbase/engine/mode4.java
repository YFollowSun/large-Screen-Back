package hbasestartertest.hbase.engine;

public class mode4 extends Engine{
    static boolean isStart;


    public static void setIsStart(boolean isStart) {
        mode4.isStart = isStart;
    }

    @Override
    public String startEngine(){
        setIsStart(true);
        return "进入掘进机控制系统--，";
    }

    @Override
    public String shutDown(){
        setIsStart(false);
        return "mode4 stops!";
    }
}
