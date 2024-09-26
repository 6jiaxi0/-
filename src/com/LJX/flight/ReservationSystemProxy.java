package com.LJX.flight;

import java.util.Queue;
import java.util.Scanner;

public class ReservationSystemProxy implements Proxy{

    private ReservationSystem reservationSystem;
    public void startReservationSystem(){
        reservationSystem = new ReservationSystem();
        //页面展示
        this.run0();

    }
    public void  run0(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n请选择操作:");
            System.out.println("1 - 向航班或者等候名单增加乘客");
            System.out.println("2 - 从航班中移除乘客");
            System.out.println("3 - 查看座位图");
            System.out.println("4 - 退出");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除输入缓冲区


            /*
            *
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
            *
            * */

            switch (choice) {
                case 1:
                    System.out.print("请输入乘客的名字: ");
                    String nameToAdd = scanner.nextLine();
                    //添加乘客
                    if(hasBlankSeat()){
                        showSeatChart();
                        //有位置,选位置
                        //这里不处理用户选择了已经被选的座位 ------s13
                        //那个排
                        System.out.println(" 选择哪个排= ");
                        int rows = scanner.nextInt();
                        System.out.println("选择第几个位置= ");
                        int cols = scanner.nextInt();
                        MessagePassEnger messagePassEnger = new MessagePassEnger(nameToAdd, cols, rows);
                        insertToFlightQueue(messagePassEnger);
                        //再展示
                        showSeatChart();
                    }else{
                        //没位置,加入等待名单
                        System.out.println("你已加入等待名单 ----" + nameToAdd);
                        insertToWaitingQueue(nameToAdd);
                    }
                    break;
                case 2:
                    System.out.print("请输入要移除的乘客名字: ");
                    String nameToRemove = scanner.nextLine();
                    //删除乘客
                   MessagePassEnger msg = deletePassenger(nameToRemove);
                   //根据等待名单是否为空
                    if(hasWaitingList()){
                        showSeatChart();
                    }else{
                        //不是空的话，进行候补
                        Alternate(msg.getRows(), msg.getCols());
                    }
                    break;
                case 3:
                   //展示座位表
                    showSeatChart();
                    break;
                case 4:
                    System.out.println("退出程序。");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选项，请重新输入。");
            }
        }
    }

    private void Alternate(int rows, int cols) {
        Queue<String> waitingQueue = reservationSystem.getWaitingQueue();
        String poll = waitingQueue.poll();
        insertToFlightQueue(new MessagePassEnger(poll, cols, rows));
    }

    /**
     * 是否有候补人员
     * @return
     */
    private boolean hasWaitingList() {
        return reservationSystem.getWaitingQueue().isEmpty();
    }


    @Override
    public boolean insertToWaitingQueue(String name) {
        return reservationSystem.insertToWaitingQueue(name);
    }

    @Override
    public boolean insertToFlightQueue(MessagePassEnger msg) {
       return reservationSystem.insertToFlightQueue(msg);
    }

    @Override
    public void showSeatChart() {
        reservationSystem.showSeatChart();
    }

    @Override
    public MessagePassEnger deletePassenger(String name) {
        MessagePassEnger msg = reservationSystem.deletePassenger(name);
        if(msg == null){
            throw new RuntimeException("删除有误？？？？？？");
        }
        reservationSystem.getSeatChart()[msg.getRows()-1][msg.getCols()-1] = 0;
        return msg;
    }

    /**
     * 是否有空的座位
     * @return yes or no
     */
    public boolean hasBlankSeat(){
        for (int[] row : reservationSystem.getSeatChart()) {
            for (int element : row) {
                if (element == 0) {
                    return true; // 找到0，返回true
                }
            }
        }
        return false; // 没有找到0，返回false
    }
}
