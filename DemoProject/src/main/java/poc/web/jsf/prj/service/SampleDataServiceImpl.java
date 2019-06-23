/**
 * 
 */
package poc.web.jsf.prj.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import poc.web.jsf.prj.bean.UserManagedBean;
import poc.web.jsf.prj.dao.ISampleDataDao;
import poc.web.jsf.prj.entity.SampleData;

/**
 * @author Ashok Kumar Jha
 *
 */
@Service
@ManagedBean(name = "sampleDataService")
@SessionScoped
public class SampleDataServiceImpl implements ISampleDataService {

    private ISampleDataDao sampleDataDao;
    final static Logger logger = LoggerFactory.getLogger(SampleDataServiceImpl.class);

    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    public void setSampleDataDao(ISampleDataDao sampleDataDao) {
        this.sampleDataDao = sampleDataDao;
    }

    @Override
    public String addSampleData(UserManagedBean sampleDataUB) {
        // sampleData.addSampleData();
        try {
            SampleData sampledata = new SampleData();
            sampledata.setId(sampleDataUB.getId());
            sampledata.setName(sampleDataUB.getName());
            sampledata.setSurname(sampleDataUB.getSurname());
            this.sampleDataDao.addSampleData(sampledata);
            return SUCCESS;
        } catch (DataAccessException exp) {
            logger.error("Sample Data creation failed ",exp);
        }
        return ERROR;

    }

    @Override
    public void updateSampleData(UserManagedBean sampleDataUB) {
        SampleData sampleData = new SampleData();
        sampleData.setId(sampleDataUB.getId());
        sampleData.setName(sampleDataUB.getName());
        sampleData.setSurname(sampleDataUB.getSurname());
        this.sampleDataDao.updateSampleData(sampleDataUB.getSampleData());

    }

    @Override
    public void deleteSampleData(UserManagedBean sampleDataUb) {

        this.sampleDataDao.deleteSampleData(sampleDataUb.getSampleData());

    }

    @Override
    public UserManagedBean getSampleDataById(int id) {
        UserManagedBean ub = new UserManagedBean();
        BeanUtils.copyProperties(this.sampleDataDao.getSampleDataById(id),ub);
        return ub;
    }

    @Override
    public List<UserManagedBean> getSampleDatas() {
      //  System.out.println("this.sampleDataDao =" + this.sampleDataDao);
        List<UserManagedBean> userList = new ArrayList<UserManagedBean>();
        this.sampleDataDao.getSampleDatas().forEach(sd -> {
            UserManagedBean ub = new UserManagedBean();
            BeanUtils.copyProperties(sd, ub);
            userList.add(ub);
        });
        return userList;
    }

}