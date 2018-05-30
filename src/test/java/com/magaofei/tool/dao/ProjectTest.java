package com.magaofei.tool.dao;

import com.magaofei.tool.dao.mapper.ProjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectTest {

    @Autowired
    private ProjectMapper projectMapper;

    @Before
    public void testCreateProject() {
        Project project = new Project("测试", "test@test.com", "http://baidu.com", "1",
                "http://www.baidu.com", "http=http://127.0.0.1", 0, new Date());

        try {
            projectMapper.create(project);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testProjectAll() {
        List<Project> projects = projectMapper.all();
        for (Project p : projects) {
            System.out.println(p);
        }
    }


}
