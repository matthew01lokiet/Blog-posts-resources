import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TestingJDBC
{
    public static void main(String... args) throws SQLException
    {
        
        var jdbc = new TestingJDBC();
        
        var connection = jdbc.createConnection();
        
        jdbc.fetchAllFromTableStatement(connection);
        
        
        
    }
    
    public Connection createConnection() throws SQLException
    {
        //append with your database name
        String url = "jdbc:postgresql://localhost/ExampleDatabase";
        
        Properties props = new Properties();
        props.setProperty("user","postgres");
        //include your password
        props.setProperty("password","_your_password_");
        
        return DriverManager.getConnection(url, props);
    }
    
    public void fetchAllFromTableStatement(Connection connection) throws SQLException
    {
        
        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");
        
        
        List<Client> clients = new ArrayList<>();
        
        while(resultSet.next())
        {
            Client client = new Client();
            
            client.setId(resultSet.getInt("client_id"));
            client.setFirst_name(resultSet.getString("first_name"));
            client.setLast_name(resultSet.getString("last_name"));
            client.setAge(resultSet.getInt("age"));
            client.setPhone_number(resultSet.getString("phone_number"));
            
            clients.add(client);
        }
        
        System.out.printf("%20s%20s%20s%20s%20s\n\n", "client_id", "first_name", "last_name", "age", "phone_number");
        
        for(int i = 0; i < clients.size(); i++)
        {
            System.out.printf("%20d%20s%20s%20d%20s\n\n",
                    clients.get(i).getId(),
                    clients.get(i).getFirst_name(),
                    clients.get(i).getLast_name(),
                    clients.get(i).getAge(),
                    clients.get(i).getPhone_number());
        }
        
        resultSet.close();
        statement.close();
    }
    
    
}
