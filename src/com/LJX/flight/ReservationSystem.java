package com.LJX.flight;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 定期航班预约←

 * 允许用户有下面两种选择。
 *  1----“向航班或者等候名单增加乘客。←
 * 要求输入乘客的名字。←
 * 以表格形式显示飞机中的座位图。“
 * 如果还有座位，允许乘客选择，把乘客加入到座位图表里。“
 * 如果没有座位，则把乘客加入等候名单里。←
 * 2------从航班中移除乘客。←
 * 要求输入乘客的名字。←
 * 根据某乘客的名字查找座位图并删除之。←
 * 如果等候名单为空，则更新等候列表，以让座位有剩余。
 * 如果等候名单不为空，则把名单中的第一个人移除掉，并给他这个新腾出的座位。←
 */
public class ReservationSystem implements Proxy{

    //座位图表的二维数组
    private static int[][] seatChart;



    //等待名单，使用队列
    private static Queue<String> waitingQueue;

    //乘客信息表
   private static GenericList<MessagePassEnger> passengerMesg;

    static {
        seatChart = new int[constant.COLS][constant.ROWS];
        //遍历-----让座位为空
        for (int i = 0; i < constant.COLS; i++) {
            for (int j = 0; j < constant.ROWS; j++) {
                seatChart[i][j] = constant.BLANK_SYMBOL;
            }
        }
        waitingQueue = new ArrayDeque<>();

        //初始话乘客信息表
        passengerMesg = new GenericList();

    }


    @Override
    public boolean insertToWaitingQueue(String name) {
      if( waitingQueue.add("name")){
          return true;
      }
      return false;
    }

    @Override
    public boolean insertToFlightQueue(MessagePassEnger msg) {
        if(passengerMesg.add(msg) != -1){
            seatChart[msg.getRows()-1][msg.getCols()-1] = 1;
            return true;
        }
        return false;
    }

    @Override
    public void showSeatChart() {
        System.out.println("座位图:");
        for (int i = 0; i < seatChart.length; i++) {
            System.out.print("第 " + (i + 1) + " 排: ");
            for (int j = 0; j < seatChart[i].length; j++) {
                if (seatChart[i][j] == 0) {
                    System.out.print("空 ");
                } else {
                    System.out.print("有 ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public MessagePassEnger deletePassenger(String name) {
        MessagePassEnger msg = passengerMesg.delete(name);
        return msg;
    }

    public int[][] getSeatChart() {
        return seatChart;
    }

    public Queue<String> getWaitingQueue() {
        return waitingQueue;
    }
}
