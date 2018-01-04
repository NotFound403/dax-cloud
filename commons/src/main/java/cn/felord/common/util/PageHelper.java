package cn.felord.common.util;

import com.baomidou.mybatisplus.plugins.Page;

/**
 * 分页工具类
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/16 17:03
 */
public class PageHelper {

    private PageHelper() {
    }


    /**
     * <p>
     * 获取默认分页对象 默认容量15
     * </p>
     *
     * @param <T>        the type parameter
     * @param pageNumber the page number
     * @return the page
     */
    public static <T> Page<T> defaultPage(int pageNumber) {
        return getPage(pageNumber, 15);
    }

    /**
     * 获取默认分页对象 默认容量15.
     * <p>
     * 用于自定义分页
     *
     * @param <T>        the type parameter
     * @param pageNumber the page number
     * @param total      the total
     * @return the page
     */
    public static <T> Page<T> defaultPage(int pageNumber, int total) {
        return getPage(pageNumber, 15, total);
    }

    /**
     * <p>
     * 获取分页对象
     * </p>
     *
     * @param <T>        the type parameter
     * @param pageNumber the page number
     * @param pageSize   the page size
     * @return page page
     */
    public static <T> Page<T> getPage(int pageNumber, int pageSize) {
        return new Page<>(pageNumber, pageSize);
    }


    /**
     * 用于自定义分页.
     *
     * @param <T>        the type parameter
     * @param pageNumber the page number
     * @param pageSize   the page size
     * @param total      the total
     * @return the page
     */
    public static <T> Page<T> getPage(int pageNumber, int pageSize, int total) {
        Page<T> page = new Page<>(pageNumber, pageSize);
        page.setTotal(total);
        return page;
    }
}
