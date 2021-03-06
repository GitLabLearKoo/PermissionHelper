package com.henley.permissionhelper;

/**
 * 提供给用户选择权限请求如何进行的工具类接口(必须且只能调用其中的一个方法)
 * <ul>
 * <strong>方法介绍：</strong>
 * <li>{@link #resume()}表示继续请求
 * <li>{@link #cancel()}表示取消请求
 * </ul>
 *
 * @author Henley
 * @date 2017/7/31 13:41
 */
public interface Rationale {

    /**
     * 继续操作
     */
    void resume();

    /**
     * 取消操作
     */
    void cancel();
}
