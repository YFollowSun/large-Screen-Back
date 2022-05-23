package hbasestartertest.hbase;

import lgh.springboot.starter.hbase.template.HBaseTemplate;
import org.apache.hadoop.hbase.io.compress.Compression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HbaseApplicationTests {

    @Autowired
    HBaseTemplate hBaseTemplate;

    @Test
    void contextLoads() {
        List<String> list = new ArrayList<>();
        list.add("cf1");
        list.add("cf2");
        list.add("cf3");



        Compression.Algorithm algorithm = Compression.Algorithm.SNAPPY;
        hBaseTemplate.createTable("dmd",list,algorithm);
    }

}
