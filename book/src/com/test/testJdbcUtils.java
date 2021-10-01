package com.test;

import com.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class testJdbcUtils {
    @Test
    public void JdbcUtilsTest(){
        for (int i=0;i < 100;i++){

            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
//            JdbcUtils.close(conn);
        }
    }
}
