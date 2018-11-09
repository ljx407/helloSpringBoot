package com.ljx.springboot.datasource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private RowMapper<Student> geteRowMapper() {
        RowMapper<Student> rowMapper = (ResultSet rs, int rowcount) -> {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String sex = rs.getString("sex");
            String note = rs.getString("note");
            Student student = Student.builder().id(id)
                    .name(name)
                    .sex(SexEnum.getValue(sex))
                    .note(note).build();
            return student;
        };
        return rowMapper;
    }

    @Override
    public int addStudent(Student s) {
        String sql = "insert into t_student(name,sex,note) values(?,?,?)";
        int updateCount = jdbcTemplate.update(sql, s.getName(), s.getSex(), s.getNote());
        return updateCount;
    }

    @Override
    public int deleteStudent(int id) {
        String sql = "delete from t_student where id = ?";
        int updateCounts = jdbcTemplate.update(sql, id);
        return updateCounts;
    }

    @Override
    public int updateStudent(Student s) {

        String sql = "UPDATE t_student SET NAME = ?,sex = ? ,note = ? WHERE id = ?";

        int updateCount = jdbcTemplate.update(sql, s.getName(), s.getSex(), s.getNote(), s.getId());

        return updateCount;
    }

    @Override
    public List<Student> findAll() {
        String sql = "SELECT * FROM t_student;";
//        List<Student> students = jdbcTemplate.queryForList(sql, Student.class);
        List<Student> students = jdbcTemplate.query(sql, geteRowMapper());
        log.info("student size -> {}", students.size());
        return students;
    }

    @Override
    public Student findById(int id) {
        String sql = "SELECT * FROM t_student WHERE id = ?; ";
        Object[] params = {id};
        List<Student> result = jdbcTemplate.query(sql, params, geteRowMapper());
        Student student = result.stream().findFirst().orElseGet(null);
        return student;
    }
}
