package com.songsir.rpc.utils;

import org.apache.commons.lang.StringUtils;

import java.util.StringTokenizer;

/**
 * @PackageName com.songsir.rpc.utils
 * @ProjectName songsir-rpc-parent
 * @Author: SongYapeng
 * @Date: Create in 15:22 2020/1/16
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
public class SongsirStringUtils extends StringUtils {

    /**
     * 判断一个字符串是否为空
     * 1.如果对象str==null 则为空
     * 2.如果字符串长度 小于1 ，str.length()<1 则为空
     * 3.如果字符串 为 "null" ,则为空
     * 4.如果字符串为"  ",含有空格，则为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null || str.length() <= 0 || "null".equals(str) || str.trim().length() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断一个字符串是否为空
     * 1.如果对象str!=null 则不为空
     * 2.如果字符串长度 大于0 ，str.length()>0 则不为空
     * 3.如果字符串 为 "null" ,
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        if (null != str && str.length() > 0 && !"null".equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断一个字符串的编码格式
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String getEncoding(String str) {
        if (SongsirStringUtils.isEmpty(str)) {
            return str;
        }
        String[] encodeArr = new String[]{"ISO-8859-1", "GB2312", "GBK", "UTF-8", "UTF-16"};
        try {
            for (String encode : encodeArr) {
                if (str.equals(new String(str.getBytes(encode), encode))) {
                    return encode;
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    /**
     * 此方法将给出的字符串source使用delim划分为单词数组。
     *
     * @param source 需要进行划分的原字符串
     * @param delim  单词的分隔字符串
     * @return 划分以后的数组，如果source为null的时候返回以source为唯一元素的数组，
     * 如果delim为null则使用逗号作为分隔字符串。
     * @since 0.1
     */
    public static String[] split(String source, String delim) {
        String[] wordLists;
        if (source == null) {
            wordLists = new String[1];
            wordLists[0] = source;
            return wordLists;
        }
        if (delim == null) {
            delim = ",";
        }
        StringTokenizer st = new StringTokenizer(source, delim);
        int total = st.countTokens();
        wordLists = new String[total];
        for (int i = 0; i < total; i++) {
            wordLists[i] = st.nextToken();
        }
        return wordLists;
    }


    public static String SubString(String source, int limit) {
        String result = source;
        if (result == null || "".equals(result)) {
            result = "";
        } else if (source.length() > limit) {
            result = result.substring(0, limit);
        }
        return result;
    }

}
