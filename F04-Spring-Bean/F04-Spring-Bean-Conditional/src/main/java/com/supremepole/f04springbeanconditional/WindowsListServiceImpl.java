package com.supremepole.f04springbeanconditional;

/**
 * @author CodeCoderCoding
 */
public class WindowsListServiceImpl implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
