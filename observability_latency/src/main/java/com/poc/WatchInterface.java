package com.poc;

public interface WatchInterface {
    void start(String methodName);
    void error();
    void warning();
    void stop(String methodName);

}
