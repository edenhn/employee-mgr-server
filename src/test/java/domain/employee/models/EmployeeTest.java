package domain.employee.models;

import com.negusse.eden.employeemgrserver.domain.employee.models.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void constructorTest01(){
        Employee employee = new Employee("Demo", "User", "demo@user.com");
        employee.setId(1L);

        String expected = "1 Demo User demo@user.com";
        String actual = employee.toString();

        Assertions.assertEquals(expected, actual);
    }
}
