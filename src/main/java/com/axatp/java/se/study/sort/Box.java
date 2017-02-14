/**
 * <p>
 * Copyright(c) @2017 TIANPING AUTO INSURANCE CO.,LTD.
 * </p>
 */
package com.axatp.java.se.study.sort;

/**
 * <p>
 * description:魔盒树
 * </p>
 * 
 * @author ex_liuruili
 * @since 2017年2月14日
 * @see
 */
public class Box {
    private String id;
    private String name;
    private String number;
    private Cell[] cellArray;
    private Box brforeBox;
    private Box afterBox;
    private Box[] beforeBoxArray;
    private Box[] afterBoxArray;

    /**
     * 
     */
    public Box() {
        super();
    }

    /**
     * @param id
     * @param name
     * @param number
     * @param cellArray
     * @param brforeBox
     * @param afterBox
     * @param beforeBoxArray
     * @param afterBoxArray
     */
    public Box(String id, String name, String number, Cell[] cellArray, Box brforeBox, Box afterBox,
            Box[] beforeBoxArray, Box[] afterBoxArray) {
        super();
        this.id = id;
        this.name = name;
        this.number = number;
        this.cellArray = cellArray;
        this.brforeBox = brforeBox;
        this.afterBox = afterBox;
        this.beforeBoxArray = beforeBoxArray;
        this.afterBoxArray = afterBoxArray;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     *            the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the cellArray
     */
    public Cell[] getCellArray() {
        return cellArray;
    }

    /**
     * @param cellArray
     *            the cellArray to set
     */
    public void setCellArray(Cell[] cellArray) {
        this.cellArray = cellArray;
    }

    /**
     * @return the brforeBox
     */
    public Box getBrforeBox() {
        return brforeBox;
    }

    /**
     * @param brforeBox
     *            the brforeBox to set
     */
    public void setBrforeBox(Box brforeBox) {
        this.brforeBox = brforeBox;
    }

    /**
     * @return the afterBox
     */
    public Box getAfterBox() {
        return afterBox;
    }

    /**
     * @param afterBox
     *            the afterBox to set
     */
    public void setAfterBox(Box afterBox) {
        this.afterBox = afterBox;
    }

    /**
     * @return the beforeBoxArray
     */
    public Box[] getBeforeBoxArray() {
        return beforeBoxArray;
    }

    /**
     * @param beforeBoxArray
     *            the beforeBoxArray to set
     */
    public void setBeforeBoxArray(Box[] beforeBoxArray) {
        this.beforeBoxArray = beforeBoxArray;
    }

    /**
     * @return the afterBoxArray
     */
    public Box[] getAfterBoxArray() {
        return afterBoxArray;
    }

    /**
     * @param afterBoxArray
     *            the afterBoxArray to set
     */
    public void setAfterBoxArray(Box[] afterBoxArray) {
        this.afterBoxArray = afterBoxArray;
    }

    /*
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Box [id=" + id + ", name=" + name + ", number=" + number + ", cellArray=" + cellArray + ", brforeBox="
                + brforeBox + ", afterBox=" + afterBox + ", beforeBoxArray=" + beforeBoxArray + ", afterBoxArray="
                + afterBoxArray + "]";
    }

}
