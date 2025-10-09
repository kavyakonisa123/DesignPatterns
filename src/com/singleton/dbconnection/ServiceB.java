package com.singleton.dbconnection;

public class ServiceB {

    public void doSomething() {
    DBConnection connection = DBConnection.INSTANCE;
    connection.executeQuery("INSERT INTO LOGS(MESSAGE) VALUES('Hello from ServiceB');");
}

}
