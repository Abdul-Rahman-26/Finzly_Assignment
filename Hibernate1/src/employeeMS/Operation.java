package employeeMS;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Operation {
    private final SessionFactory sessionFactory;

    public Operation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addEmployee(Employee employee) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    public Employee getEmployeeById(int employeeId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Employee.class, employeeId);
        }
    }

    public List<Employee> getAllEmployees() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Employee", Employee.class).list();
        }
    }

    public void updateEmployee(Employee updatedEmployee) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(updatedEmployee);
            transaction.commit();
        }
    }

    public void deleteEmployee(int employeeId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Employee employeeToDelete = session.get(Employee.class, employeeId);
            if (employeeToDelete != null) {
                session.delete(employeeToDelete);
                transaction.commit();
            }
        }
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        try (Session session = sessionFactory.openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee WHERE salary > :salary", Employee.class);
            query.setParameter("salary", salary);
            return query.list();
        }
    }

    public List<Employee> getEmployeesWithDepartments(String... departments) {
        try (Session session = sessionFactory.openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee WHERE department IN :departments", Employee.class);
            query.setParameterList("departments", departments);
            return query.list();
        }
    }

    public List<Employee> getEmployeesFromDepartmentsOtherThan(String department) {
        try (Session session = sessionFactory.openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee WHERE department != :department", Employee.class);
            query.setParameter("department", department);
            return query.list();
        }
    }

    public List<Employee> getEmployeesSortedBySalaryDesc() {
        try (Session session = sessionFactory.openSession()) {
            Query<Employee> query = session.createQuery("FROM Employee ORDER BY salary DESC", Employee.class);
            return query.list();
        }
    }
}

