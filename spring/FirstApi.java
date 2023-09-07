package com.sb.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi {

@RequestMapping("name")
String getname() {
	return "Finzly";
}

@RequestMapping("list")
ArrayList<String> getList(){
	List<String> arr = new ArrayList<>();
	for(int i=65;i<=90;i++) {
		char a = (char) i;
		arr.add(String.valueOf(a));
	}
	return (ArrayList<String>) arr;
}

@RequestMapping("map")
Map<Integer,String> getMap(){
	
	Map<Integer,String> map = new HashMap<>();
	for(int i=65;i<90;i++) {
		char a = (char)i;
		map.put(i, String.valueOf(a));
	}
	return (Map<Integer,String>)map;
	}

@RequestMapping("loginsql")
ArrayList<String> getSql() throws ClassNotFoundException, SQLException{
	List<String> list = new ArrayList<>();
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Class Loaded");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","password");
	System.out.println("Connected");
	Statement st = connection.createStatement();
	ResultSet result = st.executeQuery("select * from student");
	result.close();
	st.close();
	connection.close();
	System.out.println("over");
	return (ArrayList<String>)list;
}
}




