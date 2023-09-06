import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAO {

    public void addStudent(Student student) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSessionFactory();
        }
    }

    public Student getStudent(int id) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;
        Student student = null;

        try {
            transaction = session.beginTransaction();
            student = session.get(Student.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSessionFactory();
        }

        return student;
    }

    public void updateStudent(Student student) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSessionFactory();
        }
    }

    public void deleteStudent(Student student) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            HibernateUtil.closeSessionFactory();
        }
    }
}
