package hbasestartertest.hbase.engine;

public class mode5 extends Engine{
    static boolean isStart;


    public static void setIsStart(boolean isStart) {
        mode5.isStart = isStart;
    }

    @Override
    public String startEngine(){
        setIsStart(true);
        return "进入油缸温度--，";
    }

    @Override
    public String shutDown(){
        setIsStart(false);
        return "mode5 stops!";
    }
}
