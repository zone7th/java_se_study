/**
 * <p>
 * Copyright(c) @2017 TIANPING AUTO INSURANCE CO.,LTD.
 * </p>
 */
package com.axatp.java.se.study.sort;

/**
 * <p>
 * description:Box元素
 * </p>
 * 
 * @author ex_liuruili
 * @since 2017年2月14日
 * @see
 */
public class Cell {
    private String id;
    private String boxId;// Box编号
    private String number;// 编号
    private String name;// 名称
    private String imgUrl;
    private Cell beforeCell;
    private Cell afterCell;
    private Cell[] beforeCellArray;//
    private Cell[] afterCellArray;

    /**
     * 
     */
    public Cell() {
        super();
    }

    /**
     * @param name
     */
    public Cell(String name) {
        super();
        this.name = name;
    }

    /**
     * @param id
     * @param boxId
     * @param number
     * @param name
     * @param imgUrl
     * @param beforeCell
     * @param afterCell
     * @param beforeCellArray
     * @param afterCellArray
     */
    public Cell(String id, String boxId, String number, String name, String imgUrl, Cell beforeCell, Cell afterCell,
            Cell[] beforeCellArray, Cell[] afterCellArray) {
        super();
        this.id = id;
        this.boxId = boxId;
        this.number = number;
        this.name = name;
        this.imgUrl = imgUrl;
        this.beforeCell = beforeCell;
        this.afterCell = afterCell;
        this.beforeCellArray = beforeCellArray;
        this.afterCellArray = afterCellArray;
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
     * @return the boxId
     */
    public String getBoxId() {
        return boxId;
    }

    /**
     * @param boxId
     *            the boxId to set
     */
    public void setBoxId(String boxId) {
        this.boxId = boxId;
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
     * @return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     *            the imgUrl to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return the beforeCell
     */
    public Cell getBeforeCell() {
        return beforeCell;
    }

    /**
     * @param beforeCell
     *            the beforeCell to set
     */
    public void setBeforeCell(Cell beforeCell) {
        this.beforeCell = beforeCell;
    }

    /**
     * @return the afterCell
     */
    public Cell getAfterCell() {
        return afterCell;
    }

    /**
     * @param afterCell
     *            the afterCell to set
     */
    public void setAfterCell(Cell afterCell) {
        this.afterCell = afterCell;
    }

    /**
     * @return the beforeCellArray
     */
    public Cell[] getBeforeCellArray() {
        return beforeCellArray;
    }

    /**
     * @param beforeCellArray
     *            the beforeCellArray to set
     */
    public void setBeforeCellArray(Cell[] beforeCellArray) {
        this.beforeCellArray = beforeCellArray;
    }

    /**
     * @return the afterCellArray
     */
    public Cell[] getAfterCellArray() {
        return afterCellArray;
    }

    /**
     * @param afterCellArray
     *            the afterCellArray to set
     */
    public void setAfterCellArray(Cell[] afterCellArray) {
        this.afterCellArray = afterCellArray;
    }

    /*
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Cell [id=" + id + ", boxId=" + boxId + ", number=" + number + ", name=" + name + ", imgUrl=" + imgUrl
                + ", beforeCell=" + beforeCell + ", afterCell=" + afterCell + ", beforeCellArray=" + beforeCellArray
                + ", afterCellArray=" + afterCellArray + "]";
    }

}
