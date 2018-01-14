package com.axatp.java.se.study.log;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.Vector;

/**
 * 
 *<p>
 *description:输出异常用
 *</p>
 * @author Martin
 * @since 2018年1月14日
 * @see
 */
public class LogThrowableInfo implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 异常信息
     */
    private transient Throwable throwable;

    /**
     * 异常信息
     */
    private String[] rep = null;

    /**
     * 输出用
     */
    private VectorWriter vw = new VectorWriter();

    /**
     * 构造函数
     */
    public LogThrowableInfo()
    {
        try
        {
            throw new Exception();
        }
        catch (Exception e)
        {
            this.throwable = e;
        }
    }

    /**
     * 取得异常信息
     * 
     * @return 异常信息
     */
    public Throwable getThrowable()
    {
        return throwable;
    }

    public String[] getThrowableStrRep()
    {
        if (rep != null)
        {
            return (String[]) rep.clone();
        }
        else
        {
            throwable.printStackTrace(vw);
            rep = vw.toStringArray();
            vw.clear();
            return rep;
        }
    }
}

/**
 * 
 * 
 */
class VectorWriter extends PrintWriter
{

    /**
     * 输出用Vector
     */
    private Vector<String> v;

    /**
     * 构造函数
     */
    VectorWriter()
    {
        super(new NullWriter());
        v = new Vector<String>();
    }

    /**
     * 打印
     */
    public void println(Object o)
    {
        v.addElement(o.toString());
    }

    /**
     * 打印
     */
    public void println(char[] s)
    {
        v.addElement(new String(s));
    }

    /**
     * 打印
     */
    public void println(String s)
    {
        v.addElement(s);
    }

    /**
     * 数组转换
     * 
     * @return
     */
    public String[] toStringArray()
    {
        int len = v.size();
        String[] sa = new String[len];

        for (int i = 0; i < len; i++)
        {
            sa[i] = (String) v.elementAt(i);
        }

        return sa;
    }

    /**
     * 清空Vector
     */
    public void clear()
    {
        v.setSize(0);
    }
}

/**
 * 输出空指针的Writer
 * 
 * 
 */
class NullWriter extends Writer
{

    /**
     * 关闭
     */
    public void close()
    {
    }

    /**
     * 刷新
     */
    public void flush()
    {
    }

    /**
     * 输出
     */
    public void write(char[] cbuf, int off, int len)
    {
    }
}
