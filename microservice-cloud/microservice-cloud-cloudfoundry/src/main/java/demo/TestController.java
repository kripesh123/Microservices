package demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public Map<String,String> hello() {
		Map<String,String> result = new HashMap();
		result.put("A","Apple");
		result.put("B","Ball");
		result.put("C","Cat");
		result.put("D","Dog");
		result.put("E","Elephant");
		result.put("F","Fish");
		result.put("G","Gun");
		result.put("H","Horror");
		result.put("I","Iris");
		result.put("J","Judge");
		return result;
	}

}
