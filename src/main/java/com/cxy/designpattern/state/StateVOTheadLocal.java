package com.cxy.designpattern.state;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class StateVOTheadLocal {
    private static ThreadLocal<StateVO> threadLocal = new ThreadLocal<>();

    public static ThreadLocal<StateVO> getThreadLocal() {
        return threadLocal;
    }

    public static void setThreadLocal(StateVO stateVO) {
        StateVOTheadLocal.threadLocal.set(stateVO);
    }
}
