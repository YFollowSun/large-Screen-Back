package hbasestartertest.hbase.engine;

public class Engine {
    static boolean isStart;

    public static void setIsStart(boolean isStart) {
        Engine.isStart = isStart;
    }

    public String startEngine(){
        setIsStart(true);
        return "ongoing.....";
    }
    public String shutDown(){
        setIsStart(false);
        return "stop!";
    }
}
