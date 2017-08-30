package com.pluralsight.bridge;

import java.util.List;

/**
 * Created by jingshanyin on 8/27/17.
 */
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
