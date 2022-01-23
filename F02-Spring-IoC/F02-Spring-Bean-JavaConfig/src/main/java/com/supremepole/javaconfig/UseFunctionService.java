package com.supremepole.javaconfig;

/**
 * @author CodeCoderCoding
 */
public class UseFunctionService {
    FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
