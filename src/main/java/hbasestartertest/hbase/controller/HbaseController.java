package hbasestartertest.hbase.controller;

import hbasestartertest.hbase.engine.Engine;
import lgh.springboot.starter.hbase.template.HBaseTemplate;
import org.apache.hadoop.hbase.io.compress.Compression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/hbase")
public class HbaseController {

    @Autowired
    HBaseTemplate hBaseTemplate;

    Integer r1=1;
    Integer r2=2;
    Integer r3=3;

    @GetMapping("/createTable")
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("cf1");
        list.add("cf2");
        list.add("cf3");



        Compression.Algorithm algorithm = Compression.Algorithm.NONE;
        hBaseTemplate.createTable("guzhong",list,algorithm);
    }

//    @GetMapping("/getHbase")
//    public List<Map<String,String>> get(){
//        List<Map<String,String>> l = new ArrayList<>();
//        l.add(hBaseTemplate.getByRowKey("test","row1"));
//        return l;
//    }

    @CrossOrigin
    @GetMapping("/getJSON")
    public JSON getJSON() {
        List<Map<String,String>> l = new ArrayList<>();
        if(hBaseTemplate.getByRowKey("test",r3.toString()).isEmpty()){
//            r1--;
//            r2--;
//            r3--;
            r1 = 1;
            r2 = 2;
            r3 = 3;
        }
        l.add(hBaseTemplate.getByRowKey("test", r1.toString()));
        l.add(hBaseTemplate.getByRowKey("test", r2.toString()));
        l.add(hBaseTemplate.getByRowKey("test", r3.toString()));
        r1++;
        r2++;
        r3++;
        return (JSON) JSON.toJSON(l);
    }


}
