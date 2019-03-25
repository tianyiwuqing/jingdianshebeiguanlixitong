package seriveTest;

import com.lynu.bean.TableEmployee;
import com.lynu.service.TableEmployeeServcie;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author 28449
 * @since 2019-01-21 16:37
 */
public class ServiceTest {

    @Test
    public void serviceTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml", "spring-service.xml");
        TableEmployeeServcie servcie = context.getBean(TableEmployeeServcie.class);
        TableEmployee employee=new TableEmployee();
        employee.setEmployeename("zzzzzzzzzzzz22222");
        employee.setUsername("aszaz");
        employee.setPassword("azas");
        employee.setSex(0);
        employee.setTelephone("");
        employee.setAddress("");
        employee.setIsValid(0);
        employee.setIsLeader(0);
        employee.setDescription("");
        employee.setType(0);
        employee.setDelFlag(0);
        employee.setPhotograph("");
        employee.setCreateTime(new Date());
        employee.setUpdateTime(new Date());
        servcie.insertEmployee(employee);


    }

}
