package com.sabel.BitconRechner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RateService {

    private static final String url = "jdbc:sqlite:\\d:\\wagenhuberg\\sqlite\\XXX.DB";

    Connection connection;
    PreparedStatement preparedStatementSelct;
    PreparedStatement preparedStatementInsert;


    public RateService() throws SQLException {
        this.connection = DriverManager.getConnection(url);

    }




}
