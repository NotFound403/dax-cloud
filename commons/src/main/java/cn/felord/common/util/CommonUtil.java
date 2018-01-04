package cn.felord.common.util;


import com.xiaoleilu.hutool.util.ArrayUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.io.File;
import java.security.MessageDigest;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * 通用工具类
 *
 * @author Gaojun.Zhou
 * @date 2016年12月27日 上午11:51:21
 */
public class CommonUtil {

    private final static Pattern PAT = Pattern.compile("-");

    private CommonUtil() {
    }

    /**
     * UUID生成方法
     *
     * @return string string
     */
    public static String uuid() {
        UUID uid = UUID.randomUUID();
        return PAT.matcher(uid.toString()).replaceAll("").toLowerCase();
    }

    /**
     * 格式化异常
     *
     * @param e the e
     * @return the string
     */
    public static String formatException(Exception e) {

        String message = e.getMessage();

        if (StringUtils.isBlank(message)) {

            return "系统繁忙,请稍后重试";
        }

        String runtimeStr = "java.lang.RuntimeException: ";
        message = message.replaceAll(runtimeStr, "");
        return message;
    }

    /**
     * md5加密
     *
     * @param s the s
     * @return string string
     */
    public final static String md5(String s) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 文件重命名
     *
     * @param fileName the file name
     * @return string string
     */
    public static String renameFile(String fileName) {
        // TODO Auto-generated method stub
        String now = formatDate(new Date(), "yyyyMMdd");
        String ext = fileName.substring(fileName.lastIndexOf("."));
        return now + File.separator + RandomStringUtils.randomAlphanumeric(32) + ext;
    }

    /**
     * 日期格式化
     *
     * @param date   the date
     * @param format the format
     * @return string string
     */
    public static String formatDate(Date date, String format) {
        FastDateFormat fastDateFormat = FastDateFormat.getInstance(format);
        return fastDateFormat.format(date);
    }

    /**
     * Format date time string.
     *
     * @param date the date
     * @return the string
     */
    public static String formatDateTime(Date date) {
        return formatDate(date, "yyyy-MM-dd hh:mm:ss");
    }

    /**
     * Date format date.
     *
     * @param source the source
     * @return the date
     * @throws ParseException the parse exception
     */
    public static Date dateFormat(String source) throws ParseException {
       int length=   source.split(" ").length;
       if (length==1){
           source+=" 00:00:00";
       }
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss");
       return  fastDateFormat.parse(source);
    }

    /**
     * 过滤非法字符
     *
     * @param str the str
     * @return the string
     */
    public static String filterValidateChar(String str) {

        if (StringUtils.isBlank(str)) {
            return "";
        }
        //统一转为小写
        str = str.toLowerCase().trim();

        String badStr = "'|exec|execute|insert|select|delete|update|drop|*|%|master|truncate|" +
                "declare|sitename|net user|xp_cmdshell";
        String[] badStrs = badStr.split("\\|");
        for (int i = 0; i < badStrs.length; i++) {
            if (str.contains(badStrs[i])) {
                str = str.replaceAll(badStrs[i], "");
            }
        }
        return str;
    }

    /**
     * 转换逻辑符号
     *
     * @param where the where
     * @return string string
     */
    public static String formatWhereSQL(String where) {
        // TODO Auto-generated method stub

        if (StringUtils.isBlank(where)) {
            return "";
        }
        where = where.replaceAll("eq", " = ");
        where = where.replaceAll("nq", " != ");
        where = where.replaceAll("lt", " < ");
        where = where.replaceAll("lq", " <= ");
        where = where.replaceAll("gt", " > ");
        where = where.replaceAll("gq", " >= ");

        return where;
    }

    /**
     *  把src 中 包含的所有的 repeat 元素 清理出去.
     *
     * @param src    原始数组
     * @param repeat 排除重复元素集合
     * @return the string [ ]
     */
    public static String[] eliminate(String[] src, String[] repeat) {
        String[] result = null;
        for (String str : repeat) {
            result = ArrayUtil.removeEle(src, str);
            src = result;
        }
        return result;
    }
}
