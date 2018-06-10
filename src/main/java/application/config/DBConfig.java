package application.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {
	@Bean
	public DataSource dataSource() {
		@SuppressWarnings("unchecked")
		DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.sqlite.JDBC");
		dataSourceBuilder.url("jdbc:sqlite:bibliotheque.sqlite");
		return dataSourceBuilder.build();
	}
}
