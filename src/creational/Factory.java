package creational;

import javax.xml.crypto.Data;

interface Query{

}
class MySQLQuery implements Query{
    @Override
    public String toString() {
        return "My SQL Query";
    }
}
class MongoDBQuery implements Query{
    @Override
    public String toString() {
        return "Mongo DB Query";
    }
}

interface Database{
    void setUrl();
    void setCredentials(String username, String password);

    // Factory Method
    Query createQuery();
}
class MySQLDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void setCredentials(String username, String password) {

    }

    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
class MongoDBDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void setCredentials(String username, String password) {

    }
    @Override
    public Query createQuery() {
        return new MongoDBQuery();
    }
}

class UserService{
    Database database;
    public UserService(Database database){
        this.database=database;
    }
    public Query createQuery(){
        Query query = database.createQuery();
        return query;
    }
}
public class Factory {
    public static void main(String[] args) {
        UserService userService=new UserService(new MySQLDatabase());
        System.out.println(userService.createQuery());
    }
}
