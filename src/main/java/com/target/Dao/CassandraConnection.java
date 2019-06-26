package com.target.Dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

class CassandraConnection {
    Session getConnection() {
        String serverIP = "127.0.0.1";
        String keyspace = "targetdb";

        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIP)
                .build();
        Session session = cluster.connect(keyspace);
        return session;
    }
}
