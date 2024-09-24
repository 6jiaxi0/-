package com.LJX.flight;

/**
 * 目标类和代理类要实现的公共接口
 * 编写通用的业务逻辑
 */
public interface Proxy {

    /**
     * 添加进入等待队列
     * @param name
     * @return
     */
    boolean insertToWaitingQueue(String name);

    /**
     * 有航班坐的幸运儿
     * @param msg
     * @return
     */
    boolean insertToFlightQueue(MessagePassEnger msg);

    /**
     * 展示当前座位图表
     */
    void showSeatChart();

    /**
     * 删除乘客
     * @param name
     */
    MessagePassEnger deletePassenger(String name);



}
