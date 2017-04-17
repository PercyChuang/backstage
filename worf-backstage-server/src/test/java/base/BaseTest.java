package base;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基础测试类.不支持事务不作为设置.
 * @author PERCY
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/worf-app_context.xml" })
public class BaseTest {
    protected Logger logger = LoggerFactory.getLogger(BaseTest.class);
    
    
    /**
     * test before run.
     */
    @Before
    public void before() {
        logger.info("测试程序触发成功!");
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println("程序即将开始:"+i);
        }
    }
    
    @Test
    public void test() {
        logger.info("test hello word!");
    }
}
