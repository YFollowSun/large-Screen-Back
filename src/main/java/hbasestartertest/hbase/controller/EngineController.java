package hbasestartertest.hbase.controller;


import com.alibaba.fastjson.JSON;
import hbasestartertest.hbase.engine.Engine;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hbasestartertest.hbase.engine.*;

@RestController
@RequestMapping("/engine")

public class EngineController {
    List<String> l= new ArrayList<>();
    @CrossOrigin
    @GetMapping("/start")
    public JSON getStart(@RequestParam String mode){
        if (mode.equals("all")){
            return (JSON) JSON.toJSON(l);
        }
        switch (mode){
            case "mode1":{
                l.add(new mode1().startEngine());
                break;
            }
            case "mode2":{
                l.add(new mode2().startEngine());
                break;
            }
            case "mode3":{
                l.add(new mode3().startEngine());
                break;
            }
            case "mode4":{
                l.add(new mode4().startEngine());
                break;
            }
            case "mode5":{
                l.add(new mode5().startEngine());
                break;
            }
            case "mode6":{
                l.add(new mode6().startEngine());
                break;
            }
            default:{
                l.add("Wrong Request!");
//                return (JSON) JSON.toJSON(l);
            }
        }
        return (JSON) JSON.toJSON(l);
    }

    @CrossOrigin
    @GetMapping("/stop")
    public String toStop(){
        String str = new Engine().shutDown();
        return str;
    }
}
