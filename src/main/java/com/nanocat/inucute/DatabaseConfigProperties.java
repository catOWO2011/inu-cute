package com.nanocat.inucute;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("database-config")
public record DatabaseConfigProperties(String databaseUsername) {
}
