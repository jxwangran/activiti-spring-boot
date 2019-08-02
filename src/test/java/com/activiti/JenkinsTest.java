/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.activiti;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.acitivi.App;
import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Job;

/** 
* @ClassName: JenkinsTest 
* @Description: 
* @author wangran
* @date Aug 1, 2019 3:02:23 PM 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class JenkinsTest {

	@Test
	public void apiTest() throws URISyntaxException, IOException {
		JenkinsServer server = new JenkinsServer(new URI("http://127.0.0.1:8080"), "admin", "admin");
		if (!server.isRunning()) {
//			return;
		}
		Map<String,Job> params = server.getJobs();
		for (Map.Entry<String, Job> param : params.entrySet()) {
			System.err.println(param.getKey() + "   " + param.getValue().getFullName());
		}
		Map<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("Branch", "origin/master");
		server.getJob("mintiest").build(requestParams, true);
		server.close();
	}
	
}
