package com.mysystem.app.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysystem.app.interfaces.GenericDAO;

public abstract class AbstractDAO<T, ID> implements GenericDAO<T, ID> {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/EducationalInstitution";
    private static final String USER = "root";
    private static final String PASS = "root";

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
