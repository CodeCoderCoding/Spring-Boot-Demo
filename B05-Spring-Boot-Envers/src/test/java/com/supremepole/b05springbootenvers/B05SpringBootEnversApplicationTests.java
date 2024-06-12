package com.supremepole.b05springbootenvers;

import com.supremepole.b05springbootenvers.dao.StudentDao;
import com.supremepole.b05springbootenvers.dao.TeacherDao;
import com.supremepole.b05springbootenvers.dao.WebsiteDao;
import com.supremepole.b05springbootenvers.dao.WebsiteEntityRepository;
import com.supremepole.b05springbootenvers.entity.Student;
import com.supremepole.b05springbootenvers.entity.Teacher;
import com.supremepole.b05springbootenvers.entity.Website;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class B05SpringBootEnversApplicationTests {

    @Autowired
    private WebsiteDao websiteDao;
    @Autowired
    private WebsiteEntityRepository websiteEntityRepository;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;



    @Test
    public void addTeacher(){
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("yi");
        teacherDao.save(teacher);
    }

    @Test
    public void addStudent(){
        Student student = new Student();
        student.setId(13);
        student.setName("shisan");
        studentDao.save(student);
    }

    @Test
    public void add(){
        List<Website> websites=new ArrayList<>();
        Website website=new Website();
        website.setId(11);
        website.setName("supremepole website");
        website.setUrl("https://www.supremepole.com");
        websites.add(website);
        websiteDao.save(website);
    }

    @Test
    public void update(){
        Website website=new Website();
        website.setId(1);
        website.setName("supremepole website v2");
        website.setUrl("https://www.supremepole.com");
        websiteDao.save(website);
    }

    @Test
    public void getRepository(){
        Revisions<Integer, Website> revisions=websiteDao.findRevisions(6);
        System.out.println("revisions");
        for(Revision<Integer, Website> revision:revisions){
            System.out.println(revision);
        }
        System.out.println("Single revision");
        Optional<Revision<Integer, Website>> optional=websiteDao.findRevision(6, 1);
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }

    @Test
    public void getWebsiteByName() {
        System.out.println(websiteDao.getWebsiteByName("supremepole"));
    }

    @Test
    public void getWebsiteByName_Dao(){
        System.out.println(websiteDao.getWebsiteByName("supremepole"));
    }

    @Test
    public void getWebsiteListById(){
        List<Website> websiteList=websiteDao.getWebsiteListById(1, "supremepole");
        System.out.println(websiteList.size());
    }

}
