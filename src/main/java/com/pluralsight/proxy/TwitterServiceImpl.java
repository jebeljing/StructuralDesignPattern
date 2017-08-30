package com.pluralsight.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * Created by jingshanyin on 8/29/17.
 */
public class TwitterServiceImpl implements TwitterService {

    private static final String TWITTER_CONSUMER_KEY = "uxY1yS7srWnqTLtLoYlVxWyMl";
    private static final String TWITTER_SECRET_KEY = "pn0a16PTGdJBgSAnIDx2GzLf0b81jQEOUgSTp3QsgL32i1hX1d";
    private static final String TWITTER_ACCESS_TOKEN = "851630373511606273-vVMOQLnGP2aO3IBQtOoKIqZksaVm3hh";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "hGPeUbNlPCOsBjW0FGB6e2PUkzN2wzSfyM3Eew2ErSSuj";

    @Override
    public String getTimeline(String screenName) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        //we aren't going to allow this
        System.out.println(message);
    }
}
