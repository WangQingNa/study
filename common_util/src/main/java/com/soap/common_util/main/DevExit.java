package com.soap.common_util.main;

import com.soap.common_util.systemInfo.SysInfo;

import java.io.IOException;


public class DevExit {
    public static void devExit(){
        if(SysInfo.getSysInfo().getOsName().trim().toLowerCase().startsWith("win")){
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);
        }
    }
}
