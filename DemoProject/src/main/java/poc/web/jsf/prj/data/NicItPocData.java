/**
 * 
 */
package poc.web.jsf.prj.data;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import poc.web.jsf.prj.bean.NicItPoc;
import poc.web.jsf.prj.ds.conn.DbDataSource;

/**
 * @author Ashok Kumar Jha
 *
 */
@ManagedBean(name = "nicItPocData", eager = true)
@SessionScoped
public class NicItPocData implements Serializable {

    private static final long serialVersionUID = 3785879256094804757L;
    final static Logger logger = LoggerFactory.getLogger(NicItPocData.class);

    public List<NicItPoc> getNicItPocs() {
        ResultSet rs = null;
        PreparedStatement pst = null;
        String stm = "Select * from NicItPoc";
        List<NicItPoc> records = new ArrayList<NicItPoc>();

        try {
            Connection con = DbDataSource.getConnection();
            pst = con.prepareStatement(stm);
           // logger.debug("SQL executed "+ stm +"  Debug level");
            logger.trace("SQL executed "+ stm+"  trace level");
           // logger.warn("SQL executed "+ stm+"  warn level");
           // logger.error("SQL executed "+ stm+"  error level");

            pst.execute();
            rs = pst.getResultSet();
            while (rs.next()) {
                NicItPoc nicItPoc = new NicItPoc();
                nicItPoc.setId(rs.getInt(1));
                nicItPoc.setName(rs.getString(2));
                records.add(nicItPoc);
            }
            rs.close();
            rs = null;
            pst.close();
            pst = null;
            con.close();
            logger.trace("Returned Result  ", records);

        } catch (SQLException ex) {
            logger.error("Error happens during execution ", ex);
        }
        return records;
    }

}
