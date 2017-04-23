package cn.lonecloud.util;

import cn.lonecloud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lonecloud on 17/4/17.
 *
 */
public class DBUtils {
    private static JdbcTemplate jdbcTemplate;

    public  JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public  void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        DBUtils.jdbcTemplate = jdbcTemplate;
    }

    public static Object insertOrUpdate(String sql, Object... objs) {
        return jdbcTemplate.update(sql, objs);
    }

    public static void delete(String sql, String id) {
        jdbcTemplate.update(sql, id);
    }

    public static List<? extends Object> query(String sql, Class<? extends Object> clazz, Object... args) {

        RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
        return args.length!=0?jdbcTemplate.query(sql,rowMapper,args):jdbcTemplate.query(sql,rowMapper);
    }
}
