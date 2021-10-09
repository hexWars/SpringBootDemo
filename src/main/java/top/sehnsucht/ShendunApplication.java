package top.sehnsucht;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.sehnsucht.*.mapper")
public class ShendunApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShendunApplication.class, args);
    }

}
