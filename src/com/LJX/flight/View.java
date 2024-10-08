package com.LJX.flight;

/**
 * 定期航班预约←
 * 为定期航班写一个预定系统。确保飞机有 10排，每行有4个位子。用一个二维字符串数组来保存座位图表。“
 * 另外，创建用于存放飞机满座时的等候名单。等候名单应该以“先到先服务"为原则，也就是说，先加入名单的人比后加入名单的人有优先权。允许用户有下面两种选择。“向航班或者等候名单增加乘客。←
 * 要求输入乘客的名字。←
 * 以表格形式显示飞机中的座位图。“
 * 如果还有座位，允许乘客选择，把乘客加入到座位图表里。“
 * 如果没有座位，则把乘客加入等候名单里。←
 * 从航班中移除乘客。←
 * 要求输入乘客的名字。←
 * 根据某乘客的名字查找座位图并删除之。←
 * 如果等候名单为空，则更新等候列表，以让座位有剩余。
 * 如果等候名单不为空，则把名单中的第一个人移除掉，并给他这个新腾出的座位。←
 */

/**
 * 开发一个航班座位预定系统，基本信息包括：航班号、座位编号、座位是否预订、
 * 预订人姓名、剩余座位编号等基本信息（也可以根据自己情况进行扩充）。使之能
 * 提供以下基本功能：
 * 1)乘客可在本系统查询航班座位预订信息。
 * 2)
 * 数据包括：航班号、座位编号、座位是否预订、预订人姓名。
 * 3)
 * 可在线预订座位。
 * 4)
 * 可修改预订座位信息。
 * 5)
 * 可显示所有航班预订数据。
 * 计算器
 */


public class View {
    public static void main(String[] args) {
        new ReservationSystemProxy().startReservationSystem();
    }
}
