package com.menuview.menuview.main;

import com.menuview.menuview.support.SqlSessionSupport;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class mainpageSvc extends SqlSessionSupport {

    public Object test01() {
        HashMap<String,Object> hMap = new HashMap<String,Object>();
        Object ret = selectDataSource("mainPageMapper.selectTest", hMap);
        return ret;
    }

}
