/**
 * 
 */
package poc.web.jsf.prj;

import javax.faces.bean.ManagedBean;

/**
 * @author Ashok Kumar Jha
 *
 */
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    public HelloWorld() {
        System.out.println("Hello World from NIC Digital India!");
    }

    public String getMessage() {
        return "Hello World from NIC KOLKATA to Digital India!";
    }
}
