package hbasestartertest.hbase.engine;

public class mode2 extends Engine{
    static boolean isStart;


    public static void setIsStart(boolean isStart) {
        mode2.isStart = isStart;
    }

    @Override
    public String startEngine(){
        setIsStart(true);
        return "进入系统电压--，";
    }

    @Override
    public String shutDown(){
        setIsStart(false);
        return "mode2 stops!";
    }
}
