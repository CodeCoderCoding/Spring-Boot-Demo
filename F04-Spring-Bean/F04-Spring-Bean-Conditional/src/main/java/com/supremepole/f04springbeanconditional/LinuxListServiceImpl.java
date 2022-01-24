package com.supremepole.f04springbeanconditional;

/**
 * @author CodeCoderCoding
 */
public class LinuxListServiceImpl implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
