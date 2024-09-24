package com.LJX.flight;

public class MessagePassEnger {
    private String name;
    private int cols;
    private int rows;

    public MessagePassEnger() {
    }

    public MessagePassEnger(String name, int cols, int rows) {
        this.name = name;
        this.cols = cols;
        this.rows = rows;
    }

    @Override
    public boolean equals(Object obj) {
        String name = (String)obj;
        return name.equals(this.name);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return cols
     */
    public int getCols() {
        return cols;
    }

    /**
     * 设置
     * @param cols
     */
    public void setCols(int cols) {
        this.cols = cols;
    }

    /**
     * 获取
     * @return rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * 设置
     * @param rows
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    public String toString() {
        return "MessagePassEnger{name = " + name + ", cols = " + cols + ", rows = " + rows + "}";
    }
}
