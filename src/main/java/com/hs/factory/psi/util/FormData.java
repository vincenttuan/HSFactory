package com.hs.factory.psi.util;

import org.springframework.util.MultiValueMap;

public class FormData {
    public static String get(MultiValueMap<String, String> formData, String key) throws Exception {
        // 解決中文轉碼問題
        //return new String(formData.getFirst(key).getBytes("ISO-8859-1"), "UTF-8");
        return formData.getFirst(key);
    }
}
