package application.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBInitializeConfig {

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void initialize() {
		try {
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			statement.execute(StringsCatalog.DROP_LIVRES);
			statement.execute(StringsCatalog.DROP_USAGERS);

			statement.executeUpdate(StringsCatalog.CREATE_BOOKS_TABLE_REQUEST);
			statement.executeUpdate(StringsCatalog.CREATE_USERS_TABLE_REQUEST);

			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
