
package modelo.DAO;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.VO.PersonaEventoVO;
import modelo.VO.DiaAsistenciaVO;
import modelo.conexion.Conexion;


public class ReporteDAO {
    public static void main(String[] args) {
        System.out.println("");
    }
    Connection con = Conexion.getConnection();
    public ArrayList<PersonaEventoVO> numPersonaEvento() throws SQLException{
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
        }
    return listaReporte;
    }

    public ArrayList<PersonaEventoVO> eventoSexo(String dato, int num) throws SQLException{
        ArrayList<PersonaEventoVO> listaReporte = new ArrayList<PersonaEventoVO>();
        PersonaEventoVO reportes = null;
        try{
            PreparedStatement consulta = con.prepareStatement("select E.id_evento, E.Nombre,E.Tipo_Evento, E.Fecha,count(case when inv.sexo = 'F' then 1 else null end) Mujeres,\n" +
"count(case when inv.sexo = 'M' then 1 else null end) Hombres from asisten I left join \n" +
"invitados inv on inv.id_invitados = i.id_invitado inner join evento E on e.id_evento = i.id_evento\n limit ?" +
"group by i.id_evento");
        consulta.setInt(1, num);
        ResultSet response = consulta.executeQuery();
        while(response.next()){
            int idevento = response.getInt(1);
        String nombre = response.getString(2);
        int tipoevento = response.getInt(3);
        Date fecha = response.getDate(4);
        int cantidad = response.getInt(5);
        int mujeres = response.getInt(6);
        int hombres = response.getInt(7);
        if (dato == "mujeres" && mujeres > hombres){
        reportes = new PersonaEventoVO(idevento,nombre,tipoevento,fecha,cantidad);
        listaReporte.add(reportes);  
        } else if (dato == "hombres" && hombres > mujeres){
        reportes = new PersonaEventoVO(idevento,nombre,tipoevento,fecha,cantidad);
        listaReporte.add(reportes);  
        }
        }response.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Un Problema Feo");    
        }
        return listaReporte;
    }
    public ArrayList<DiaAsistenciaVO> diaMayorAsistencia() throws SQLException{
        ArrayList<DiaAsistenciaVO> listDiaMasAsistencia = new ArrayList<DiaAsistenciaVO>();
        DiaAsistenciaVO diaAsistencia = null;
        try{
            PreparedStatement consulta = con.prepareStatement("select E.id_evento, E.Nombre,E.Tipo_Evento, E.Fecha, Count(I.id_evento)'Cantidad'from asisten I inner join \n" +
"Evento E on i.id_evento = e.id_evento left join invitados inv on inv.id_invitados = i.id_invitado\n" +
"group by i.id_evento;");
        ResultSet response = consulta.executeQuery();
        while(response.next()){
        int idevento = response.getInt(1);
        Date fecha = response.getDate(4);
        int cantidad = response.getInt(5);
        diaAsistencia = new DiaAsistenciaVO(idevento,sacarDia(fecha),cantidad);
        listDiaMasAsistencia.add(diaAsistencia);         
        }response.close();}
        catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Un Problema Feo");    
        }   return listDiaMasAsistencia;
    }
    public String sacarDia(Date fch) {
    Calendar cal = new GregorianCalendar();
   cal.setTimeInMillis(fch.getTime());
    String[] strDays = new String[]{
"Domingo",
"Lunes",
"Martes",
"Miercoles",
"Jueves",
"Viernes",
"Sabado"};
    return strDays[cal.get(Calendar.DAY_OF_WEEK) - 1];
}
    
}
        

    

