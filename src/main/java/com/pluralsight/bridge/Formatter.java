package com.pluralsight.bridge;

import java.util.List;

/**
 * Created by jingshanyin on 8/27/17.
 */
public interface Formatter {

    String format(String header, List<Detail> details);
}
