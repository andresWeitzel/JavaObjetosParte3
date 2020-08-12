
package mypackage.repositories.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import mypackage.entities.persistence.Alumno;
import mypackage.entities.persistence.Curso;
import mypackage.repositories.interfaces.I_AlumnoRepository;


public class AlumnoRepository implements I_AlumnoRepository{
    
    private Connection conexionDB;

    public AlumnoRepository(Connection conexionDB) {
        this.conexionDB=conexionDB;
    }
    
    
    @Override
    public void save(Alumno alumno) {
        if(alumno==null){
            return;
        }
        try(PreparedStatement ps=conexionDB.prepareStatement(
                "INSERT INTO alumnos(nombre, apellido, edad, idCurso)"
                        + "VALUES(?,?,?,?)",
           PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());

            ps.execute();

            //consultamos el id generado, nos genera un resultSet
            //Nos devuelve un registro con las claves generadas
            ResultSet rs = ps.getGeneratedKeys();

            //Corremos el apuntador en ese primer registro, devuelve un booleano
            //La clave generada se la colocamos al objeto curso        
            if (rs.next()) {
                alumno.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public void remove(Alumno alumno) {
         if(alumno==null){
            return ;
        }
        try(
            PreparedStatement ps=conexionDB
                    .prepareStatement("DELETE FROM alumnos WHERE id=?"))
        
        {
            ps.setInt(1, alumno.getId());
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }}

    @Override
    public void update(Alumno alumno) {
        if(alumno==null){
            return ;
        }
        try(
            PreparedStatement ps=conexionDB
                    .prepareStatement(
                        "UPDATE alumnos SET nombre=?, apellido=?, edad=?, idCurso=? "
                            + "WHERE id=?"))
        {
             ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.setInt(5, alumno.getId());
            
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }  }

    @Override
    public List<Alumno> getAll() {
         List<Alumno>list=new ArrayList();

        try (
            ResultSet rs=conexionDB
                .createStatement()
                .executeQuery("SELECT * FROM alumnos"))
        {
            
            while(rs.next()){
                list.add(new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getInt("idCurso")
                ));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}