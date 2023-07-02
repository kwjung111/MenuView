package com.menuview.menuview.mybatis;

import com.menuview.menuview.support.SqlSessionSupport;
import jakarta.annotation.Resource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

public class mybatisTest {

    final static Logger logger =  LogManager.getLogger(mybatisTest.class);

    @Resource
    private SqlSessionTemplate sqlSession;

    @Test
    @DisplayName("DB connection Test")
    void test01(){
        //given
        logger.info("given");
        //when
        logger.info("when");
        //then
        logger.info("then");
    }
}
