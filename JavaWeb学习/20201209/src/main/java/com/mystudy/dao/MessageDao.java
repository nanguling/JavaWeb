package com.mystudy.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mystudy.entity.Message;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MessageDao {
    static DataSource dataSource = null;
    static {
        dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://localhost:3306/db2020?user=root&password=19991230&useUnicode=true&useSSL=false&characterEncoding=UTF-8");

    }
    //查询
    public static List select() {
        List list = new ArrayList();
        String sql = "select  * from message";
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = dataSource.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Message message = new Message();
                message.setId(rs.getInt("id"));
                message.setWho(rs.getString("who"));
                message.setWhen(rs.getString("when_time"));
                message.setWhat(rs.getString("what"));
                list.add(message);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    connection.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return list;
    }
}
