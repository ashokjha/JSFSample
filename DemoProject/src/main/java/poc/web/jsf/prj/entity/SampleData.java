/**
 * 
 */
package poc.web.jsf.prj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ashok Kumar Jha
 *
 */
@Entity
@Table(name = "sampledata")
public class SampleData {


    private int id;
    private String name;
    private String surname;

    public SampleData(int id, String name, String surname) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    
    public SampleData() {
        super();

    }
    /**
     * Get User Id
     *
     * @return int - User Id
     */
    @Id
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    /**
     * Set User Id
     *
     * @param int - User Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get User Name
     *
     * @return String - User Name
     */
    @Column(name = "name", unique = true, nullable = false)
    public String getName() {
        return name;
    }

    /**
     * Set User Name
     *
     * @param String - User Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get User Surname
     *
     * @return String - User Surname
     */
    @Column(name = "surname", unique = true, nullable = false)
    public String getSurname() {
        return surname;
    }

    /**
     * Set User Surname
     *
     * @param String - User Surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }


}
