package com.atguigu.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;

import java.io.File;

public class TestRead {

    public static void main(String[] args) {
        //设置文件名称和路径
        String fileName = "I:\\java\\ggkt_parent\\data\\stu01.xlsx";
        File f=new File("stu01.xls");

        String f1=f.getAbsolutePath();
        //调用方法进行读操作
        ExcelReaderBuilder read = EasyExcel.read(fileName, User.class, new ExcelListener());
        ExcelReaderSheetBuilder sheet = read.sheet();
        sheet.doRead();
    }
}
