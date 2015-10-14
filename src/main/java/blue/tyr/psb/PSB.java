package blue.tyr.psb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PSB {
  public static void main(String[] arg) {
    //LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    //StatusPrinter.print(lc);

    Logger logger = LoggerFactory.getLogger("PSB");
    logger.info("Hello World");
    logger.error("whoops");

    Database db = new Database(System.getProperty("db.host"),System.getProperty("db.username"),System.getProperty("db.password"));
    Twitter twitter = new Twitter(db.connection);




    System.exit(-1);

  }

}
