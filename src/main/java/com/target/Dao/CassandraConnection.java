package com.target.Dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CassandraConnection {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    Session getConnection() {
        String serverIP = "127.0.0.1";
        String keyspace = "targetdb";

        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIP)
                .build();
        Session session = cluster.connect(keyspace);
        logger.info("Successfully connected to the Cassandra keyspace");
        return session;
    }
}
