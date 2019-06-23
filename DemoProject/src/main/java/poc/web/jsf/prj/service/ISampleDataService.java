/**
 * 
 */
package poc.web.jsf.prj.service;

import java.util.List;

import poc.web.jsf.prj.bean.UserManagedBean;


/**
 * @author Ashok Kumar Jha
 *
 */
public interface ISampleDataService {
    /**
     * Add SampleData
     *
     * @param  SampleData sampleData
     */
    public String addSampleData(UserManagedBean sampleData);
    
    /**
     * Update SampleData
     *
     * @param  SampleData sampleData
     */
    public void updateSampleData(UserManagedBean sampleData);
    
    /**
     * Delete SampleData
     *
     * @param  SampleData sampleData
     */
    public void deleteSampleData(UserManagedBean sampleData);
    
    /**
     * Get SampleData
     *
     * @param  int SampleData Id
     */
    public UserManagedBean getSampleDataById(int id);
    
    /**
     * Get SampleData List
     *
     * @return List - SampleData list
     */
    public List<UserManagedBean> getSampleDatas();

}
