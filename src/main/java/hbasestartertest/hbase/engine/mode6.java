package hbasestartertest.hbase.engine;

public class mode6 extends Engine{
    static boolean isStart;


    public static void setIsStart(boolean isStart) {
        mode6.isStart = isStart;
    }

    @Override
    public String startEngine(){
        setIsStart(true);
        return "进入除尘风机--， ";
    }

    @Override
    public String shutDown(){
        setIsStart(false);
        return "mode6 stops!";
    }

}
