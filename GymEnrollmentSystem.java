/*
PostgreSQL JDBC Driver Documentation - https://jdbc.postgresql.org/documentation/

Team 475 - Gym Enrollment System
1) Adam Chhor
2) Ian McNeal
3) Sandesh Rai
4) Sovannara Tav
 */
import java.sql.*; // Imports all packages tied to the PostgreSQL JDBC Driver
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class GymEnrollmentSystem
{
    static Connection conn;
    public static void main(String[] args)
    {

        // Retrieves the PostgreSQL database properties
        Properties properties = new Properties();
        String fileName = "DatabaseProperties.properties";
        try
        {
            FileInputStream inputFile = new FileInputStream(fileName);
            properties.load(inputFile);
            inputFile.close();
        }
        catch (IOException e)
        {
            System.err.println("Input file error: " + e.getMessage());
            return;
        }
        String url = properties.getProperty("database.url");
        String user = properties.getProperty("database.user");
        String password = properties.getProperty("database.password");

        // Establishes the connection between JDBC and PostgreSQL database
        try
        {
            conn =
                    DriverManager.getConnection(url, user, password);
            System.out.println("Database connection established");
            //PRINT OUT TEST QUERIES HERE:
//           System.out.println(getMembersInClass("CLS001", 4));


            conn.close();
            System.out.println("Database connection closed");
        }
        catch (SQLException e)
        {
            System.err.println("Database connection error: " + e.getMessage());
        }
    }

    /** #1
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean addInstructorToClass(String classNumber, String instructorNumber) {
        try {
        PreparedStatement query = conn.prepareStatement("""
                
                """
        );
        ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #2
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean updateInstructorInClass(String classNumber, String newInstructorNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #3
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean removeInstructorFromClass(String classNumber, String instructorNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #4
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean addMemberToClass(String classNumber, String memberNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #5
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean updateMemberClassEnrollment(String oldClassNumber, String newClassNumber, String memberNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #6
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean removeMemberFromClass(String classNumber, String memberNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #7
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean addMember(String firstName, String lastName, String email, String phoneNumber, String memberNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #8
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean updateMemberEmail(String memberNumber, String newValue) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #9
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean updateMemberPhoneNumber(String memberNumber, String newValue) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #10
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean updateMemberLastPayment(String memberNumber, String newValue) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #11
     * @Author Sandesh Rai
     * @return returns true if
     */
    public static boolean removeMember(String memberNumber) {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #12
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean addInstructor(String firstName, String lastName, String email, String phoneNumber, String instructorNumber)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #13
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateInstructorEmail(String instructorNumber, String newValue)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #14
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateInstructorphoneNumber(String instructorNumber, String newValue)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #15
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean removeInstrutor(String instructorNumber)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #16
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean addClass(String classTypeName, String instructorNumber, String roomNumber, String startTime, String duration, String classNumber)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #17
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateClassStartTIme(String classNumber, String newValue)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #18
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateClassDuration(String classNumber, String newValue)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #19
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateClassRoomNumber(String classNumber, String newValue)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #20
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean removeClass(String classNumber)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #21
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean addRoom(String roomNumber, int capacity)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #22
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateRoomNumber(String roomNumber, String newValue) // Ask professor on this???
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #23
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean updateRoomCapacity(String roomNumber, int newValue) // Ask professor on this)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #24
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean removeRoom(String roomNumber)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #25
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean addClassType(String name)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #26
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean removeClassType(String name)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #27
     * @Author Sovannara Tav
     * @return returns true if
     */
    public static boolean checkGymMembership(String memberNumber)
    {
        try {
            PreparedStatement query = conn.prepareStatement("""
                
                """
            );
            ResultSet result = query.executeQuery();
        } catch(SQLException e) {
            return false;
        }
        return true;
    }
    /** #28
     * @Author Adam Chhor
     * @return Formatted String Table of
     */
    public static String getInstructorForClass(String classNumber) throws SQLException {
        PreparedStatement query = conn.prepareStatement("""
                
                """
        );
        ResultSet result = query.executeQuery();
        return Util.parseDataBase(result);
    }
    /** #29
     * @Author Adam Chhor
     * @return Formatted String Table of members' information of "classNumber" and limits column by "numberOfRowsToReturn"
     */
    public static String getMembersInClass(String classNumber, int numberOfRowsToReturn) throws SQLException {
        PreparedStatement query = conn.prepareStatement("""
                SELECT firstName, lastName, email, phoneNumber, startDate, memberNumber
                FROM Member M
                    JOIN Participants P ON P.memberId = M.id
                    JOIN Class C ON C.id = P.classId
                WHERE C.classNumber = ?
                LIMIT ?
                """
        );
        query.setString(1, classNumber);
        query.setInt(2, numberOfRowsToReturn);
        ResultSet result = query.executeQuery();
        return Util.parseDataBase(result);
    }

}