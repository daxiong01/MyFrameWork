package com.daysn.demo.sqlsession;
import java.lang.reflect.Proxy;

public class MySQLSession {
    //首先我们需要一个SQL解析器
    private Excutor excutor= new MyExcutor();

    private MyConfiguration myConfiguration = new MyConfiguration();

    public <T> T selectOne(String statement,Object parameter){
        return excutor.query(statement, parameter);
    }

    @SuppressWarnings("unchecked")
    public <T> T getMapper(Class<T> clas){
        //动态代理调用
        return (T)Proxy.newProxyInstance(clas.getClassLoader(),new Class[]{clas},
                new MyMapperProxy(myConfiguration,this));
    }

}