package com.bjpowernode;

import com.bjpowernode.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet01 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student s1=new Student();
        s1.setId(001);
        s1.setAge(23);
        s1.setName("张飞");
        Student s=new Student();
        s.setId(002);
        s.setAge(24);
        s.setName("张fen");
        //{"s1":{"id":"?","name":"?","age":"?"},"s2":{"id":"?","name":"?","age":"?"}}
        //{"id":"002","name":"zhang","age":"34"}
        String str = "{\"id\":\""+s.getId()+"\",\"name\":\""+s.getName()+"\",\"age\":"+s.getAge()+"}";

        PrintWriter out = response.getWriter();
        out.print(str);
        out.close();
       /* String a1="{\"s1\":{\"id\":\""+s1.getId()
                +"\",\"name\":\""+s1.getName()
                +"\",\"age\":\""+s1.getAge()
                +"\"},\"s2\":{\"id\":\""+s2.getId()
                +"\",\"name\":\""+s2.getName()
                +"\",\"age\":\""+s2.getAge()+"\"}}";*/
        /*String a2="{\"id\":\"002\",\"name\":\"咋还能干\",\"age\":\"34\"}";
        response.getWriter().print(a2);*/
    }
}
