package com.mystudy.dao;


import com.mystudy.entity.Questions;
import com.mystudy.util.JdbcUtil;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class QuestionDao {
    JdbcUtil ju = new JdbcUtil();
    //新增
    public int add(Questions questions, HttpServletRequest request) {
        String sql = "insert into question (title,optionA,optionB,optionC,optionD,answer) values (?,?,?,?,?,?)";
        //创建数据库连接池&创建sql命令对象
        PreparedStatement ps = ju.createPs(sql,request);
        int res = 0;
        try {
            //传参数
            ps.setString(1,questions.getTitle());
            ps.setString(2,questions.getOptionA());
            ps.setString(3,questions.getOptionB());
            ps.setString(4,questions.getOptionC());
            ps.setString(5,questions.getOptionD());
            ps.setString(6,questions.getAnswer());
            //执行sql
            res = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ju.close(request);
        }
        return res;
    }
    //查询
    public List select(HttpServletRequest request) {
        List list = new ArrayList();
        String sql = "select * from question";
        //创建数据库连接&sql命令对象
        PreparedStatement ps = ju.createPs(sql,request);
        ResultSet rs = null;
        try {
            //执行sql
            rs = ps.executeQuery();
            //遍历rs，将结果添加到list中，防止资源关闭时结果也被销毁
            while (rs.next()) {
                Questions q = new Questions();
                q.setId(rs.getInt("id"));
                q.setTitle(rs.getString("title"));
                q.setOptionA(rs.getString("optionA"));
                q.setOptionB(rs.getString("optionB"));
                q.setOptionC(rs.getString("optionC"));
                q.setOptionD(rs.getString("optionD"));
                q.setAnswer(rs.getString("answer"));
                list.add(q);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ju.close(request);
        }
        return list;
    }
    //删除
    public int delete(int id,HttpServletRequest request) {
        String sql = "delete from question where id = ?";
        //创建数据库连接&sql命令对象
        PreparedStatement ps = ju.createPs(sql,request);
        int res = 0;
        try {
            //传参
            ps.setInt(1,id);
            //执行sql
            res = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ju.close(request);
        }
        return res;
    }
    //更新
    public int upDate(Questions q,HttpServletRequest request) {
        String sql = "update question set title = ?,optionA = ?,optionB = ?,optionC = ?,optionD = ?,answer = ? where id = ?";
        //创建数据库连接&sql命令对象
        PreparedStatement ps = ju.createPs(sql,request);
        int res = 0;
        try {
            //传参
            ps.setString(1,q.getTitle());
            ps.setString(2,q.getOptionA());
            ps.setString(3,q.getOptionB());
            ps.setString(4,q.getOptionC());
            ps.setString(5,q.getOptionD());
            ps.setString(6,q.getAnswer());
            ps.setInt(7,q.getId());
            //执行sql
            res = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ju.close(request);
        }
        return res;
    }
}
