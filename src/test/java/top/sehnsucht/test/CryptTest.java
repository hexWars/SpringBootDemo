package top.sehnsucht.test;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.DigestUtils;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2021/10/9
 * ~~(^_^)~~
 */

public class CryptTest {
    @Test
    public void test() {
//        spring提供的,加盐需要自己设置
//        String s = DigestUtils.md5DigestAsHex("123456".getBytes());
//        System.out.println(s);

//        spring安全框架提供的
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode1 = passwordEncoder.encode("123456");
        String encode2 = passwordEncoder.encode("123456");

        System.out.println(encode1);
        System.out.println(encode2);




    }
}
