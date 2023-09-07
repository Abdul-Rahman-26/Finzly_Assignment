package library_inventory;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Operations {

    public void addBook(Book book) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();}
    }

    public List<Book> searchBook(String title) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Query<Book> query = session.createQuery("from book where title like: title", Book.class);
            return query.list();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    public List<Book> searchBooksByYearRange(int startYear, int endYear) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;

        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            criteria.add(Restrictions.between("publicationYear", startYear, endYear));
            List<Book> books = criteria.list();
            session.getTransaction().commit();
            return books;
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            throw e;
        }
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            criteria.add(Restrictions.eq("author", authorName));
            List<Book> books = criteria.list();
            session.getTransaction().commit();
            return books;
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            throw e;
        }
    }
    public List<Book> searchBooksByTitleOrKeywords(String searchString) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            criteria.add(Restrictions.ilike("title", "%" + searchString + "%"));
            List<Book> books = criteria.list();
            session.getTransaction().commit();
            return books;
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            throw e;
        }
    }

    public Book searchBookByISBN(int isbn) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            criteria.add(Restrictions.eq("isbn", isbn));
            Book book = (Book) criteria.uniqueResult();
            session.getTransaction().commit();
            return book;
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            throw e;
        }
    }

    public List<Book> getAllBooks() {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Book.class);
            List<Book> books = criteria.list();
            session.getTransaction().commit();
            return books;
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            throw e; // Handle or log the exception appropriately
        }
    }
    public void updateBook(Book updatedBook) {
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Book existingBook = session.get(Book.class, updatedBook.getIsbn());

            if (existingBook != null) {
                existingBook.setTitle(updatedBook.getTitle());
                existingBook.setAuthor(updatedBook.getAuthor());
                existingBook.setPublicationYear(updatedBook.getPublicationYear());
                existingBook.setIsbn(updatedBook.getIsbn());
                session.update(existingBook);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw e;
        }
    }

    public  void deleteBook(int isbn){
        SessionFactory factory = Hibernate.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction transaction = null;
        try {
            if (transaction != null){
                transaction = session.beginTransaction();
                Book bookToDelete = session.get(Book.class,isbn);
                if(bookToDelete != null){
                    session.delete(bookToDelete);
                    transaction.commit();
                }
            }
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
            throw e;
        }

    }


}
