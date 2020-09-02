package com.example.springdatajdbc.springdatajdbcdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {
    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseSeeder.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertData() {
        jdbcTemplate.execute("INSERT INTO Person(first_name,last_name) VALUES('Toma', 'Alimos')");
        jdbcTemplate.execute("INSERT INTO Person(first_name,last_name) VALUES('Mircea', 'Barbat')");
        jdbcTemplate.execute("INSERT INTO Person(first_name,last_name) VALUES('Dan', 'Capitan')");
        jdbcTemplate.execute("INSERT INTO Person(first_name,last_name) VALUES('Ion', 'Haiduc')");
    }
}
