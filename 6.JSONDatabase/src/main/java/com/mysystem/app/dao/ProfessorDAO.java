package com.mysystem.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mysystem.app.dao.mysql.AbstractDAO;
import com.mysystem.app.models.Professor;

public class ProfessorDAO extends AbstractDAO<Professor, Integer> {
    private Connection conn;
    private static final Logger logger = LogManager.getLogger(ProfessorDAO.class);

    public ProfessorDAO() {
        try {
            conn = getConnection();
        }
        catch(SQLException ex) {
            logger.error(ex.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    @Override
    public void create(Professor entity) {
        try (Connection conn = getConnection()) {
            String query = "INSERT INTO Professors (id_department, first_name, last_name, hire_date, salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            if(entity.getIdDepartment() == null)
                pstmt.setNull(1, java.sql.Types.INTEGER);
            else
                pstmt.setInt(1, entity.getIdDepartment().intValue());
            pstmt.setString(2, entity.getFirstName());
            pstmt.setString(3, entity.getLastName());
            pstmt.setDate(4, entity.getHireDate());
            pstmt.setFloat(5, entity.getSalary());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Professor findById(Integer id) {
        Professor professor = null;
        try (Connection conn = getConnection()) {
            String query = "SELECT * FROM Professors WHERE id_professor = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int idProfessor = rs.getInt("id_professor");
                int idDepartment = rs.getInt("id_department");
                boolean isDepartmentNull = rs.wasNull();
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Date hireDate = rs.getDate("hire_date");
                float salary = rs.getFloat("salary");
                
                professor = new Professor(
                    idProfessor,
                    isDepartmentNull ? null : idDepartment,
                    firstName,
                    lastName,
                    hireDate,
                    salary
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return professor;
    }

    @Override
    public List<Professor> findAll() {
        List<Professor> professors = new ArrayList<>();
        try (Connection conn = getConnection()) {
            String query = "SELECT * FROM Professors";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int idProfessor = rs.getInt("id_professor");
                int idDepartment = rs.getInt("id_department");
                boolean isDepartmentNull = rs.wasNull();
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Date hireDate = rs.getDate("hire_date");
                float salary = rs.getFloat("salary");

                Professor professor = new Professor(
                    idProfessor,
                    isDepartmentNull ? null : idDepartment,
                    firstName,
                    lastName,
                    hireDate,
                    salary
                );
                professors.add(professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professors;
    }

    @Override
    public void update(Professor entity) {
        try (Connection conn = getConnection()) {
            String query = "UPDATE Professors SET id_department = ?, first_name = ?, last_name = ? WHERE id_professor = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            if(entity.getIdDepartment() == null)
                pstmt.setNull(1, java.sql.Types.INTEGER);
            else
                pstmt.setInt(1, entity.getIdDepartment().intValue());
            pstmt.setString(2, entity.getFirstName());
            pstmt.setString(3, entity.getLastName());
            pstmt.setInt(4, entity.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Professor entity) {
        try (Connection conn = getConnection()) {
            String query = "DELETE FROM Professors WHERE id_professor = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
