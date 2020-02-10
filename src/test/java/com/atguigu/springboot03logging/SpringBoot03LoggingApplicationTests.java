package com.atguigu.springboot03logging;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    @Test
    //记录器
   public void contextLoads() {
        Logger logger = LoggerFactory.getLogger(getClass());


        //日志的级别；
        //日志的级别由低到高 trace<debug<info<warn<error
        //可以调整输出的日志级别:日志就只会在这个级别以后的高级别生效
        //2.0以上必须采用这种写法 ()->
        logger.trace(()->"trace日志..");
        logger.debug(()->"debug日志");
        //springboot默认给我们使用的是info级别的,
        // 没有指定级别的就用springBoot默认规定的级别;
        // root级别
        logger.info(()->"这是Info日志...");
        logger.warn(()->"这是warn日志");
        logger.error(()->"这是error日志");

    }

}
