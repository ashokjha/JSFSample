/**
 * 
 */
package poc.web.jsf.prj.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import poc.web.jsf.prj.entity.SampleData;

/**
 * @author Ashok Kumar Jha
 *
 */
/**
 * @author USER
 *
 */
@ManagedBean(name = "sampleData")
@RequestScoped
public class UserManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
     * private static final String SUCCESS = "success"; private static final String
     * ERROR = "error";
     * 
     * // Spring SampleData Service is injected...
     * 
     * @ManagedProperty(value = "#{SamplerDataService}") ISampleDataService
     * sampleDataService;
     */

   // List<UserManagedBean> sampleDataList;

    private int id;
    private String name;
    private String surname;

    /**
     * Add Sample Data
     *
     * @return String - Response Message
     */
    public SampleData getSampleData() {
            SampleData sampledata = new SampleData();
            sampledata.setId(getId());
            sampledata.setName(getName());
            sampledata.setSurname(getSurname());
      //      sampleDataList.add(sampledata);
            //getSampleDataService().addSampleData(sampledata);
            return sampledata;
    }

    /**
     * Reset Fields
     *
     */
    public void reset() {
        this.setId(0);
        this.setName("");
        this.setSurname("");
    }

  

    /**
     * Get sDataList Id
     *
     * @return int - Sample Data Id
     */
    public int getId() {
        return id;
    }

    /**
     * Set Sample Data Id
     *
     * @param int - Sample Data Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get Sample Data Name
     *
     * @return String - Sample Data Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set Sample Data Name
     *
     * @param String - Sample Data Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Sample Data Surname
     *
     * @return String - Sample Data Surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set Sample Data Surname
     *
     * @param String - Sample Data Surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "UserManagedBean [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }

}
