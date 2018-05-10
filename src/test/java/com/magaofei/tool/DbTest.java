
package com.magaofei.tool;

import com.mysql.jdbc.Connection;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

public class DbTest {

    private Connection connection;

    public static void main(String[] args) throws ClassNotFoundException{

        QueryRunner queryRunner = new QueryRunner();

        Class.forName("org.h2.Driver");
        
        DbUtils dbUtils = new DbUtils();
        dbUtils.notify();
    }
}