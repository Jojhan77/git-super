
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Jojhan
 */

//traer los valores de la tabla departamento y visualizarlo en un combobox
public class Combo extends Conexion {
    public DefaultComboBoxModel getValues() throws SQLException{
        
    
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    try{
        Connection con = this.getConexion();
        String sql = "{call dbo.proc_combobox}";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            modelo.addElement(rs.getString(1));
        }
        
}catch(SQLException e){
    System.out.println(e);
}
        return modelo;
}
}
