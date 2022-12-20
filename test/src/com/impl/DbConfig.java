package com.impl;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DbConfig {
	
	public static final String DRIVER = "org.sqlite.JDBC";
	
	String URL = "jdbc:sqlite:";
	File f = new File(this.getClass().getResource("../..").getPath());
	String str=f.getAbsolutePath();
	public Connection dbConfig() throws SQLException{
		try {
			str=URLDecoder.decode(str, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}

		System.out.println(str);
		str=str.replace("\\", "/");
		for(int i=0;i<2;i++){
			int index = str.lastIndexOf("/");
			str = str.substring(0, index);
		}
		System.out.println(str);
		str=str+"/db/test.db";
		URL=URL+str;
		System.out.println(URL);
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return DriverManager.getConnection(URL);
		return DriverManager.getConnection("jdbc:sqlite:C:\\Users\\周\\Desktop\\验收待完善(1)\\验收待完善\\test\\WebContent\\db\\test.db");
	}
}
