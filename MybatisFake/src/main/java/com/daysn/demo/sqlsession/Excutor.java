package com.daysn.demo.sqlsession;

public interface Excutor {
    public <T> T query(String statement,Object parameter);
}