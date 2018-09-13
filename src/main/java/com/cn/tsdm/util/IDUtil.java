package com.cn.tsdm.util;

import java.util.UUID;

/**
 * Created by xn.L on 2018/9/13.
 */
public class IDUtil {
    /**
     * 获取生成的UUID
     */
    public static String  getId(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-","");
        return uuid;
    }


}
