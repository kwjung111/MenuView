package com.menuview.menuview.support;


import com.menuview.menuview.main.mainpageCtr;
import jakarta.annotation.Resource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

// 서비스에서 상속하여 사용

public class SqlSessionSupport {

    @Resource
    private SqlSessionTemplate sqlSessionSupport;

    final static Logger logger =  LogManager.getLogger(SqlSessionSupport.class);

    protected Object selectDataSource(String queryId,HashMap<String, Object> hMap){
        Object retObj = null;
        retObj = sqlSessionSupport.selectOne(queryId, hMap);
        return retObj;
    }
}
