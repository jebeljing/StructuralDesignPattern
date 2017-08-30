package com.pluralsight.proxy;

/**
 * Created by jingshanyin on 8/29/17.
 */
public class TwitterDemo {

    public static void main(String[] args) {
//        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("bh5k"));

        service.postToTimeline("bh5k", "Some message that shouldn't go through.");
    }
}
