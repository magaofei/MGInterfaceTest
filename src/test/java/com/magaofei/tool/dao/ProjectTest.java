package com.magaofei.tool.dao;

import com.magaofei.tool.dao.mapper.ProjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectTest {

    @Autowired
    private ProjectMapper projectMapper;

//    @Before
//    public void testCreateProject() {
//
//        Project project = new Project("测试", "test@test.com", "http://baidu.com", "1",
//                "http://www.baidu.com", "http=http://127.0.0.1", 0);
//
//        try {
//            int id = projectMapper.create(project);
//            System.out.println("id" + id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    public void testUpdateProject () {
//
//        final String TEST_EMAIL = "admin@test.com";
//        List<Project> projects = projectMapper.all();
//        if ( projects.isEmpty() ) {
//            return;
//        }
//
//        Project project = projects.get(0);
//        project.setEmail(TEST_EMAIL);
//
//        System.out.println(project);
//
//        projectMapper.update(project);
//        assert project.getEmail().equals(TEST_EMAIL);
//
//    }


//    @Test
//    public void testProjectAll() {
//        List<Project> projects = projectMapper.all();
//        for (Project p : projects) {
//            System.out.println(p);
//        }
//    }


}
