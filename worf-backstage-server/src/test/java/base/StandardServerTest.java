package base;

import orj.worf.container.spring.server.StandardServer;

import org.junit.Test;

/**
 * 测试启动程序
 * @author PERCY
 */
public class StandardServerTest {

	@Test
	public void testStartContainer() throws Exception {
        StandardServer standardServer = new StandardServer();
        standardServer.setContainerDefaultConfigPath("classpath:test/container-spring_config_default.xml");
        standardServer.setContainerConfigPath("classpath:test/container-spring_config.xml");
        standardServer.start();
	}

	@Test
	public void testStopContainer() {
	}
}
