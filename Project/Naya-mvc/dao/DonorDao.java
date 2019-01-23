package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Bean.Donor_Request;
import dto.User;

@Repository
public class DonorDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public DonorDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void createDonor(final Donor_Request donor) {
		
		hibernateTemplate.execute(new org.springframework.orm.hibernate4.HibernateCallback<List<User>>() {

			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(donor);
				t.commit();
				session.flush();
				session.close();

				return null;
			}
		});
	}
}
