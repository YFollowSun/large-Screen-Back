package hbasestartertest.hbase.controller;

import com.alibaba.fastjson.JSON;
import hbasestartertest.hbase.engine.Engine;
import lgh.springboot.starter.hbase.entity.HBaseEntityHelper;
import lgh.springboot.starter.hbase.template.HBaseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hbasestartertest.hbase.engine.*;

@RestController
@RequestMapping("/table")
public class TableController {

    @Autowired
    HBaseTemplate hBaseTemplate;

    Integer r1=1;
    Integer r2=2;
    Integer r3=3;

    @CrossOrigin
    @GetMapping("/getJSON")
    public JSON getJSON(@RequestParam String s) {
        s="mode1";
        List<Map<String,String>> l = new ArrayList<>();
        Map<String,String> m= new HashMap<>();
        String str;
        if(hBaseTemplate.getByRowKey("test","row"+r3.toString()).isEmpty()){
            r1--;
            r2--;
            r3--;
        }
        l.add(hBaseTemplate.getByRowKey("test", "row"+r1.toString()));
        l.add(hBaseTemplate.getByRowKey("test", "row"+r2.toString()));
        l.add(hBaseTemplate.getByRowKey("test", "row"+r3.toString()));
        r1++;
        r2++;
        r3++;
        switch (s){
            case "mode1": {
                m.put("mode1",new mode1().startEngine());
                l.add(m);
            }
            case "mode2": m.put("mode2",new mode2().startEngine());
        }

        return (JSON) JSON.toJSON(l);
    }
}
