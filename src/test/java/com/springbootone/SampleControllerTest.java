package com.springbootone;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SampleController.class, loader = SpringApplicationContextLoader.class)
@WebAppConfiguration
@TestExecutionListeners(listeners = DependencyInjectionTestExecutionListener.class)
public class SampleControllerTest {
	

	@Autowired
	SampleController sampleController;

	@SuppressWarnings("static-access")
	@Test
	public void test_getVersion() throws Exception {
		String[] str = new String[0];
		sampleController.main(str);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
