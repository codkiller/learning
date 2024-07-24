package com.lambda;

import org.junit.Test;

import java.util.Optional;


public class OptionalTest {
    /**
     * Optional.of(T t) t必须为非空
     * Optional.empty() 创建一个空的optional实例
     * Optional.ofNullable(T t) t可以为null
     * isPresent()判断是否包含对象
     */
    @Test
    public void test1() {
        Girl girl = new Girl();
//        girl = null;
        Optional<Girl> girlOptional = Optional.of(girl);
        System.out.println(girlOptional.get());
    }

    @Test
    public void test2() {
        Girl girl = new Girl();
        girl = null;

        Optional<Girl> girlOptional = Optional.ofNullable(girl);

        System.out.println(girlOptional);
    }
    public String getGirlName(Boy boy) {
        return boy.getGirl().getName();
    }

    // 优化之前的判断
    public String getGirlName1(Boy boy) {
        if (boy != null) {
            Girl girl = boy.getGirl();
            if (girl!= null) {
                return girl.getName();
            }
        }
        return null;
    }

    public String getGirlName2(Boy boy) {
        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        Boy boy1 = boyOptional.orElse(new Boy(new Girl("迪丽热巴")));
        Girl girl = boy1.getGirl();
        Optional<Girl> girl1 = Optional.ofNullable(girl);
        Girl girl2 = girl1.orElse(new Girl("古力娜扎"));


        return girl2.getName();
    }

    @Test
    public void test3() {

    }
}
