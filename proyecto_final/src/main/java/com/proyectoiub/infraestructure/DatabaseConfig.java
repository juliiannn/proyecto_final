package com.proyectoiub.infraestructure;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.proyectoiub.entidades.*;

public class DatabaseConfig {
    private JdbcConnectionSource conexion;
    private Dao<Profesor, Integer> profesorDao;
    private Dao<Estudiante, Integer> estudianteDao;
    private Dao<Curso, Integer> cursoDao;
    private Dao<Aula, Integer> aulaDao;
    private Dao<Horario, Integer> horarioDao;
    private Dao<CursoEstudiante, Integer> cursoestDao;

    public DatabaseConfig() throws Exception {
        try{
            inicializarConexion();
            crearTablas();
            crearDAOs();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void inicializarConexion() throws Exception {
        String url = "jdbc:sqlite:bd_examen_final.db";
        this.conexion = new JdbcConnectionSource(url);
    }

    private void crearTablas() throws Exception {
        TableUtils.createTableIfNotExists(conexion, Profesor.class);
        TableUtils.createTableIfNotExists(conexion, Estudiante.class);
        TableUtils.createTableIfNotExists(conexion, Curso.class);
        TableUtils.createTableIfNotExists(conexion, Aula.class);
        TableUtils.createTableIfNotExists(conexion, Horario.class);
        TableUtils.createTableIfNotExists(conexion, CursoEstudiante.class);
    }

    private void crearDAOs() throws Exception {
        this.profesorDao = DaoManager.createDao(conexion, Profesor.class);
        this.estudianteDao = DaoManager.createDao(conexion, Estudiante.class);
        this.cursoDao = DaoManager.createDao(conexion, Curso.class);
        this.aulaDao = DaoManager.createDao(conexion, Aula.class);
        this.horarioDao = DaoManager.createDao(conexion, Horario.class);
        this.cursoestDao = DaoManager.createDao(conexion, CursoEstudiante.class);
    }

    // Getters para todos los DAOs
    public Dao<Profesor, Integer> getProfesorDao() {
        return profesorDao;
    }

    public Dao<Estudiante, Integer> getEstudianteDao() {
        return estudianteDao;
    }

    public Dao<Curso, Integer> getCursoDao() {
        return cursoDao;
    }

    public Dao<Aula, Integer> getAulaDao() {
        return aulaDao;
    }

    public Dao<Horario, Integer> getHorarioDao() {
        return horarioDao;
    }

    public Dao<CursoEstudiante, Integer> getCursoestDao() {
        return cursoestDao;
    }
    
    public void cerrar() throws Exception {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch ( Exception e){
            e.printStackTrace();
        }
    }

}
