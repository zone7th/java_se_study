/**
 * <p>
 * Copyright(c) @2017 TIANPING AUTO INSURANCE CO.,LTD.
 * </p>
 */
package com.axatp.java.se.study.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * description:魔盒排序
 * </p>
 * 
 * @author ex_liuruili
 * @since 2017年2月14日
 * @see
 */
public class MagicBoxSort {
    public static void main(String[] args) {
        List<Box> boxList = new ArrayList<Box>();
        //数据组装
        boxList.add(parseBox(enterBox(enterCell())));
        boxList.add(parseBox(enterBox(enterCell1())));
        //归并
        MergeSort(boxList);
    }

    // 组装原始数据Box中的Cell
    private static Cell[] enterCell() {
        Cell cell = new Cell("金星");
        Cell cell1 = new Cell("木星");
        Cell cell2 = new Cell("水星");
        Cell cell3 = new Cell("火星");
        Cell cell4 = new Cell("土星");

        Cell[] cellList = { cell, cell1, cell2, cell3, cell4 };
        return cellList;
    }
    
 // 组装原始数据Box中的Cell
    private static Cell[] enterCell1() {
        Cell cell = new Cell("冥王星");
        Cell cell3 = new Cell("火星");
        Cell cell1 = new Cell("海王星");
        Cell cell4 = new Cell("土星");
        Cell cell2 = new Cell("恒星");

        Cell[] cellList = { cell, cell1, cell2, cell3, cell4 };
        return cellList;
    }

    // 组装BoxTree
    private static Box enterBox(Cell[] cellList) {
        Box boxTree = new Box();
        boxTree.setName("行星");
        boxTree.setCellArray(cellList);
        return boxTree;
    }

    // 解析box
    private static Box parseBox(Box box) {
        Cell[] cellList = box.getCellArray();
        for (int i = 0; i < cellList.length; i++) {
            Cell cell = cellList[i];
            Cell beforeCell = null;
            Cell afterCell = null;

            if (i == 0) {
                beforeCell = new Cell("****");
                afterCell = cellList[i + 1];
            } else if (i == cellList.length - 1) {
                beforeCell = cellList[i - 1];
                afterCell = new Cell("****");
            } else {
                beforeCell = cellList[i - 1];
                afterCell = cellList[i + 1];
            }

            cell.setBeforeCell(beforeCell);
            cell.setAfterCell(afterCell);

            System.out.println("前：" + cellList[i].getBeforeCell().getName() + ",本位：" + cellList[i].getName() + ",后："
                    + cellList[i].getAfterCell().getName());
        }
        
        return box;
    }
    
    //不确定合并排序
    private static Box MergeSort(List<Box> boxList){
        Box box = new Box();
        for (Box boxTmp : boxList) {
            
        }
        
        
        return box;
    }
}
