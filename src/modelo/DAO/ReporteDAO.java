
package modelo.DAO;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.VO.PersonaEventoVO;
import modelo.conexion.Conexion;


public class ReporteDAO {
    Connection con = Conexion.getConnection();
    public void numPersonaEvento() throws SQLException{
        ArrayList<PersonaEventoVO> listaReporte = new ArrayList<PersonaEventoVO>();
        PersonaEventoVO reportes = null;
        try{
    PreparedStatement consulta = con.prepareStatement("select E.id_evento, E.Nombre,E.Tipo_Evento, E.Fecha, Count(I.id_evento)'Cantidad' from asisten I \n" +
"inner join evento E on I.id_evento  = E.id_evento\n" +
"where I.status = 'Presente'\n" +
"Group by I.id_evento;");
      ResultSet response = consulta.executeQuery();
        while(response.next()){
        int idevento = response.getInt(1);
        String nombre = response.getString(2);
        int tipoevento = response.getInt(3);
        Date fecha = response.getDate(4);
        int cantidad = response.getInt(5);
         
        reportes = new PersonaEventoVO(idevento,nombre,tipoevento,fecha,cantidad);
        listaReporte.add(reportes);
             
    response.close();}

        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Un Problema Feo");       
        }}
    
    public ArrayList<PersonaEventoVO> numPersona(String dato, int num){
        
    }
}
        

    

