/**
 * 
 */
package poc.web.jsf.prj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import poc.web.jsf.prj.entity.SampleData;

/**
 * @author Ashok Kumar Jha
 *
 */
@Repository
@Transactional
public class SampleDataDaoImpl implements ISampleDataDao {
    private SessionFactory sessionFactory;

    /**
     * Get  Session Factory
     *
     * @return SessionFactory -  Session Factory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * Set  Session Factory
     *
     * @param SessionFactory -  Session Factory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addSampleData(SampleData sampleData) {
        getSessionFactory().getCurrentSession().save(sampleData);
    }

    @Override
    public void updateSampleData(SampleData sampleData) {
        getSessionFactory().getCurrentSession().update(sampleData);

    }

    @Override
    public void deleteSampleData(SampleData sampleData) {
        getSessionFactory().getCurrentSession().delete(sampleData);
    }


    @SuppressWarnings("deprecation")
    @Override
    public SampleData getSampleDataById(int id) {
        return (SampleData) getSessionFactory().getCurrentSession().createQuery("from SampleData where id=?")
                .setParameter(0, id).list().get(0);
    }


    @SuppressWarnings({ "unchecked", "deprecation" })
    @Override
    
    public List<SampleData> getSampleDatas() {
        return getSessionFactory().getCurrentSession().createQuery("from poc.web.jsf.prj.entity.SampleData").list();
    }

}
