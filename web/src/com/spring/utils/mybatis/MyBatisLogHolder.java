/**
 * com.dobandsmanutils.mybatis.MyBatisLogHolder.java
 * @since 2014年6月13日
 */
package com.spring.utils.mybatis;

import org.apache.ibatis.logging.LogFactory;

/**
 * @desc mybatis日志工具
 * @since 2014年
 */
public class MyBatisLogHolder {
	/**
     * 使用log4j
     */
    public void useLog4JLogger(){
            LogFactory.useLog4JLogging();
    }
}
