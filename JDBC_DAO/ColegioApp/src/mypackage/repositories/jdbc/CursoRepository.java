package mypackage.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mypackage.entities.persistence.Curso;
import mypackage.enums.Dia;
import mypackage.enums.Turno;
import mypackage.repositories.interfaces.I_CursoRepository;

public class CursoRepository implements I_CursoRepository {

    private Connection conexionDB;

    public CursoRepository(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }

    @Override
    public void save(Curso curso) {
        if(curso==null){
            return ;
        }
        try (
                 PreparedStatement ps = conexionDB.prepareStatement("INSERT INTO cursos(titulo,profesor,dia,turno)"
                        + "values(?,?,?,?)",
                        PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());

            ps.execute();

            //consultamos el id generado, nos genera un resultSet
            //Nos devuelve un registro con las claves generadas
            ResultSet rs = ps.getGeneratedKeys();

            //Corremos el apuntador en ese primer registro, devuelve un booleano
            //La clave generada se la colocamos al objeto curso        
            if (rs.next()) {
                curso.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public void remove(Curso curso) {
        if(curso==null){
            return ;
        }
        try(
            PreparedStatement ps=conexionDB
                    .prepareStatement("DELETE FROM cursos WHERE id=?"))
        
        {
            ps.setInt(1, curso.getId());
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Curso curso) {
        if(curso==null){
            return ;
        }
        try(
            PreparedStatement ps=conexionDB
                    .prepareStatement(
                        "UPDATE cursos SET titulo=?, profesor=?, dia=?, turno=? "
                            + "WHERE id=?"))
        {
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());
            ps.setInt(5, curso.getId());
            
            ps.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Curso> getAll() {
        List<Curso>list=new ArrayList();

        try (
            ResultSet rs=conexionDB
                .createStatement()
                .executeQuery("SELECT * FROM cursos"))
        {
            
            while(rs.next()){
                list.add(new Curso(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("profesor"),
                        Dia.valueOf(rs.getString("dia")),//Convertimos el objeto del tipo enum dia
                        Turno.valueOf(rs.getString("turno"))//lo convertimos a enum
                ));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
