package blue.tyr.psb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
  Logger logger = LoggerFactory.getLogger("database");

  public Connection connection = null;

  public Database(String h, String u, String p) {
    try {
      connection = DriverManager.getConnection("jdbc:mysql://" + h + "/psb?user=" + u + "&password=" + p);
    } catch (SQLException e) {
      logger.error("DB Connection Failed! Check output console");
      e.printStackTrace();
      return;
    }

    if (connection != null) {
      logger.info("You made it, take control your database now!");
    } else {
      logger.error("Failed to make connection!");
    }
  }

  public Database(String u, String p) {
    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost/psb?user=" + u + "&password=" + p);
    } catch (SQLException e) {
      logger.error("DB Connection Failed! Check output console");
      e.printStackTrace();
      return;
    }

    if (connection != null) {
      logger.info("You made it, take control your database now!");
    } else {
      logger.error("Failed to make connection!");
    }
  }
}
