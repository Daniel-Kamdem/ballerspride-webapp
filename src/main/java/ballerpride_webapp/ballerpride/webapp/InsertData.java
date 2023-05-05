package ballerpride_webapp.ballerpride.webapp;

import java.sql.*;
public class InsertData
{
    public static void main(String args[])
    {
        try
        {
            //étape 1: charger la classe driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //étape 2: créer l'objet de connexion
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ballerpride_webapp?enabledTLSProtocols=TLSv1.2", "root", "root");
            //étape 3: créer l'objet statement
            Statement stmt = conn.createStatement();
            //étape 4: exécuter la requête
            System.out.println("Insertion...");

//            String sql = "INSERT INTO football " +
//                    "VALUES (1, 2, 3, 4, 5, 6, 7)";
//
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO basketball " +
//                    "VALUES (1, 2, 3, 4, 5, 6, 7)";
//
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO volleyball " +
//                    "VALUES (1, 2, 3, 4, 5, 6, 7)";
//
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO handball " +
//                    "VALUES (1, 2, 3, 4, 5, 6, 7)";
//            stmt.executeUpdate(sql);


//            String sql = "INSERT INTO prix " +
//                    "VALUES (1, 9.99, 19.99, 15.99)";
//            stmt.executeUpdate(sql);



//            String sql = "INSERT INTO client " +
//                    "VALUES (1, 'Aallou', 'Aniss', 34090, 'montpellier', 'aniss@gmail.com', 06382400)," +
//                            "(2, 'Ades', 'Khalil', 31000, 'toulouse', 'abdeskhalil@gmail.com', 06382401), " +
//                    "(3, 'Ngankou', 'Kevin', 34090, 'montpellier', 'kev237@gmail.com', 06382402) ";



            String sql = "INSERT INTO client " +
                    "VALUES (1, 34090, 'aniss@gmail.com', 'Aallou', 'Aniss',  06382400, 'montpellier')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO client " +
                    "VALUES (2, 31070, 'junior@gmail.com', 'junior', 'jeff', 06382400, 'toulouse' )";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO client " +
                    "VALUES (3, 34090, 'kev237@gmail.com', 'Ngankou', 'Kevin', 06382402,  'montpellier')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO client " +
                    "VALUES (4, 30000, 'emily@gmail;com','Emily', 'julie',  07070707,  'nimes')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO client " +
                    "VALUES (5, 31070, 'solar@gmail.com', 'solar', 'rodrigue', 07000001, 'toulouse' )";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO client " +
                    "VALUES (6, 34090, 'ludo37@gmail.com', 'Ngankou', 'ludo', 07000002,  'montpellier')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO client " +
                    "VALUES (7, 30000, 'amelie@gmail;com','laporte', 'amelie',  07000003,  'nimes')";
            stmt.executeUpdate(sql);

            System.out.println("Données insérés dans la table...");


            //étape 5: fermez l'objet de connexion
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
