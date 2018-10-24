package com.ljx.springboot;

import com.ljx.springboot.config.DatabaseConfig;
import com.ljx.springboot.config.SpringBootConfigWithComponentScan;
import com.ljx.springboot.config.TestConfig;
import com.ljx.springboot.pojo.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/18 20:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringBootConfigWithComponentScan.class, DatabaseConfig.class);
        Dog dog = ac.getBean(Dog.class);
        dog.service();

//        DataSource ds = ac.getBean(DataSource.class);
//        ds.pringUsername();

//
//        Dog dog1 = (Dog)ac.getBean("dog");
//        dog1.service();
//
//        Dog dog2 = ac.getBean("dog", Dog.class);
//        dog2.service();

//        Person person = ac.getBean(Person.class);
//        person.service();

//        testDatasource(ac);

        TestConfig bean = ac.getBean(TestConfig.class);
        System.out.println(bean.getPwd());


    }

    private static void testDatasource(AnnotationConfigApplicationContext ac) {
        DatabaseConfig config = ac.getBean(DatabaseConfig.class);
        System.out.println(config.getUrl());

        DataSource dataSource = ac.getBean("dataSourceA",DataSource.class);
        try (Connection connection = dataSource.getConnection()) {

            String sql = "select count(*) AS num from student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int num = resultSet.getInt("num");
                System.out.println(num);
            }

        } catch (Exception e) {

        }
    }

    /**
     * 自JDK6后，Driver已作为SPI，定义在mysql-connector-java.jar中
     * 所以，加载jar时会自动加载Driver驱动包
     * 因此可以不用通过Class.forName("com.mysql.jdbc.Driver")加载相关驱动类
     */
    public void testJdbc() {

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";

        String user = "root";

        String password = "root";


        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            String sql = "select count(*) AS num from people";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int num = resultSet.getInt("num");
                System.out.println(num);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
