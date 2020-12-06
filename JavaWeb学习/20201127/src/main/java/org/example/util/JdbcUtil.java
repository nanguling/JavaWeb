package org.example.util;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 将JDBC规范下相关对象【创建】与【关闭】封装到方法
 */
public class JdbcUtil {
    private Connection con = null;
    private PreparedStatement ps = null;
    //创建数据库连接
    public Connection createCon() {
        //创建数据库连接池
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://localhost:3306/chong?user=root&password=19991230&useUnicode=true&useSSL=false&characterEncoding=UTF-8");
        //创建数据库连接
        try {
            this.con = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return this.con;
    }
    //创建sql命令对象
    public PreparedStatement createPs(String sql) {
        try {
            this.ps = createCon().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return this.ps;
    }
    //关闭资源
    public void close() {
        try {
            if (this.ps != null) {
                this.ps.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if (this.con != null) {
                this.con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //关闭ResultSet资源
    public void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close();
    }
}
