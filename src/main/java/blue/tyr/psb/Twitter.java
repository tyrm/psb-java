package blue.tyr.psb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import twitter4j.*;

import java.sql.Connection;
import java.util.List;

public class Twitter {
  Connection db = null;

  Logger logger = LoggerFactory.getLogger("twitter");
  twitter4j.Twitter twitter = new TwitterFactory().getInstance();
  User user = null;

  public Twitter(Connection d){
    db = d;

    try {
      user = twitter.verifyCredentials();
      logger.info("connected as @"+user.getName());
    } catch (TwitterException e) {
      logger.error("DB Connection Failed! Check output console");
      e.printStackTrace();
    }

  }

  private void seeStatus(Status s) {

  }

}
