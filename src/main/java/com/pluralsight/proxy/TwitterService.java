package com.pluralsight.proxy;

/**
 * Created by jingshanyin on 8/29/17.
 */
public interface TwitterService {

    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
