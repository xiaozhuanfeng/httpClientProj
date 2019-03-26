package test.java.com.abp;

import java.util.HashMap;
import java.util.Map;

import main.java.com.abp.util.HttpClientResult;
import main.java.com.abp.util.HttpClientUtils;

import org.junit.Test;

/**
 * 常用高并发测试
 * @author xiaoz
 *
 */
public class HttpClientTest {
	
	@Test
	public void testGet(){
		HttpClientResult result = null;
		try {
			result = HttpClientUtils.doGet("http://localhost:8080/hello");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testPost(){
		HttpClientResult result = null;
		try {
			Map<String, String> params = new HashMap<String,String>();
			params.put("username", "admin");
			params.put("password", "123456");
			result = HttpClientUtils.doPost("http://localhost:8080/login",params);
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
