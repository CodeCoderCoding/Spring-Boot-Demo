package com.supremepole.a03springboothttp;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author CodeCoderCoding
 */
@RestController
public class HttpRequest {
    private Map<String,Object> params = new HashMap<>();

    /**
     * 功能描述：测试restful协议，从路径中获取字段
     * localhost:8081/request-mapping/value1/value2
     */
    @RequestMapping(path = "/request-mapping/{param1}/{param2}", method = RequestMethod.GET)
    public Object findUser(@PathVariable("param1") String param1,
                           @PathVariable("param2") String param2 ){
        params.clear();
        params.put("param1", param1);
        params.put("param2", param2);
        return params;
    }

    /**
     * 功能描述：测试GetMapping
     * 路径含有参数: localhost:8081/get-mapping/param-in-path?param1=1&param2=2
     */
    @GetMapping(value="/get-mapping/param-in-path")
    public Object pageUser(int param1, int param2){
        params.clear();
        params.put("param1", param1);
        params.put("param2", param2);
        return params;
    }

    /**
     * 功能描述：默认值，是否必须的参数
     * 路径含有参数: localhost:8081/get-mapping/default-value
     */
    @GetMapping(value="/get-mapping/default-value")
    public Object pageUserV2(@RequestParam(defaultValue="0",name="alias1") int param1, int param2 ){
        params.clear();
        params.put("param1", param1);
        params.put("param2", param2);
        return params;
    }

    /**
     * 功能描述：bean对象传参
     * 注意：1、注意需要指定http头为 content-type为application/json
     * 		2、使用body传输数据
     * 	请求的url: localhost:8081/request-mapping/bean-transfer
     * 	body内容：
     * {
     *     "id": "1",
     *     "name": "supremepole",
     *     "url": "https://cs.supremepole.com"
     * }
     */
    @RequestMapping("/request-mapping/bean-transfer")
    public Object saveUser(@RequestBody Website website){
        params.clear();
        params.put("website", website);
        return params;
    }

    /**
     * 功能描述：测试获取http头信息
     * localhost:8081/get-mapping/http-header?id=123456
     * http头含有参数：access-token: my-token
     */
    @GetMapping("/get-mapping/http-header")
    public Object getHeader(@RequestHeader("access-token") String accessToken, String id){
        params.clear();
        params.put("access_token", accessToken);
        params.put("id", id);
        return params;
    }

    /**
     * HttpServletRequest request自动注入获取参数
     * localhost:8081/get-mapping/http-servlet-request?id=myid
     */
    @GetMapping("/get-mapping/http-servlet-request")
    public Object testRequest(HttpServletRequest request){
        params.clear();
        String id = request.getParameter("id");
        params.put("id", id);
        return params;
    }

    /**
     * 功能描述：测试PostMapping
     * localhost:8081/post-mapping/post
     */
    @PostMapping("/post-mapping/post")
    public Object login(String id, String name, String url){
        params.clear();
        params.put("id", id);
        params.put("name", name);
        params.put("url", url);
        return params;
    }

    /**
     * 功能描述：测试PutMapping
     * localhost:8081/put-mapping/put
     */
    @PutMapping("/put-mapping/put")
    public Object put(String id){
        params.clear();
        params.put("id", id);
        return params;
    }

    /**
     * 功能描述：测试DeleteMapping
     * localhost:8081/delete-mapping/del
     */
    @DeleteMapping("/delete-mapping/del")
    public Object del(String id){
        params.clear();
        params.put("id", id);
        return params;
    }
}
