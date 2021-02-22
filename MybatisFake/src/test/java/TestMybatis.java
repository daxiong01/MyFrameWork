import com.daysn.demo.bean.User;
import com.daysn.demo.mapper.UserMapper;
import com.daysn.demo.sqlsession.MySQLSession;

public class TestMybatis {

    public static void main(String[] args) {
        MySQLSession sqlsession=new MySQLSession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}