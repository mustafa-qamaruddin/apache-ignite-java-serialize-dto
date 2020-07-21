package com.qubits;

import com.qubits.util.CacheClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Apache Ignite!" );
        CacheClient client = new CacheClient();
        client.persist();
        System.out.println("#######################");
    }
}
