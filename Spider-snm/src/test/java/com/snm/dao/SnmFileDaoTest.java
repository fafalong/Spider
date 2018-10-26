package com.snm.dao;

import com.snm.BaseJunit4Test;
import com.snm.entity.SnmFile;
import junit.framework.TestCase;
import org.junit.Test;

import javax.annotation.Resource;

public class SnmFileDaoTest extends BaseJunit4Test {

    @Resource
    SnmFileDao snmFileDao;

    @Test
    public void save(){
        SnmFile snmFile = new SnmFile();
        snmFile.setName("11");
        snmFileDao.save(snmFile);
    }

}