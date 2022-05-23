package hbasestartertest.hbase.engine;

public class mode3 extends Engine{
    static boolean isStart;


    public static void setIsStart(boolean isStart) {
        mode3.isStart = isStart;
    }

    @Override
    public String startEngine(){
        setIsStart(true);
        return "进入割接状态--，";
    }

    @Override
    public String shutDown(){
        setIsStart(false);
        return "mode3 stops!";
    }
}
