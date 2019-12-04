package com.mp.util;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 */
public class JsonUtil {

    // 建立Jackson的ObjectMapper对象
    private static ObjectMapper objectMapper = new ObjectMapper();

    // 建立Json操作中的日期格式
    private static final String JSON_STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";
    // DateTimeUtil.STANDARD_FORMAT = "yyyy-mm-dd HH:mm:ss";
    // 日期格式如果设置为这个，会出现月份出错的问题（先是5月变3月，然后就不断增加，甚至超过12月），具体原因待查

    static {

        //对象的所有字段全部列入
        objectMapper.setSerializationInclusion(JsonSerialize.Inclusion.ALWAYS);

        //取消默认转换timestamps形式
        objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);

        //忽略空Bean转json的错误
        objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);

        //所有的日期格式都统一为以下的样式
        objectMapper.setDateFormat(new SimpleDateFormat(JSON_STANDARD_FORMAT));

        //反序列化
        //忽略 在json字符串中存在，但是在java对象中不存在对应属性的情况。防止错误
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * 完成对象序列化为字符串
     * @param obj 源对象
     * @param <T>
     * @return
     */
    public static <T> String obj2String(T obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * 完成对象序列化为字符串，但是字符串会保证一定的结构性（提高可读性，增加字符串大小）
     * @param obj 源对象
     * @param <T>
     * @return
     */
    public static <T> String obj2StringPretty(T obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * 完成字符串反序列化为对象
     * @param str 源字符串
     * @param clazz 目标对象的Class
     * @param <T>
     * @return
     */
    public static <T> T string2Obj(String str, Class<T> clazz) {
        if (StringUtils.isEmpty(str) || clazz == null) {
            return null;
        }
        try {
            return (clazz == String.class) ? (T) str : objectMapper.readValue(str, clazz);
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }



}