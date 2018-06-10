package application.config;

public final class StringsCatalog {

	public static final String DB_URL = "jdbc:sqlite:bibliotheque.sqlite";
	public static final String DB_DRIVER = "org.sqlite.JDBC";

	public static final String DB_TABLENAME_LIVRES = "usagers";
	public static final String DB_TABLENAME_USAGERS = "livres";

	public final static String CREATE_USERS_TABLE_REQUEST = "CREATE TABLE IF NOT EXISTS " + DB_TABLENAME_USAGERS
			+ " ( id INTEGER PRIMARY KEY , nom TEXT NOT NULL,	prenom  TEXT NOT NULL);";
	public final static String CREATE_BOOKS_TABLE_REQUEST = "CREATE TABLE IF NOT EXISTS " + DB_TABLENAME_LIVRES
			+ "(	id             INTEGER PRIMARY KEY ,	annee          INTEGER NOT NULL ,	prenom_auteur  TEXT NOT NULL ,	nom_auteur     TEXT NOT NULL ,	titre          TEXT NOT NULL ,	editeur        TEXT NOT NULL ,	date_sortie    NUMERIC  ,	date_retour    NUMERIC  ,	id_usager     INTEGER) ;";

	private final static String DROP_IF_EXISTS_STATEMENT = "DROP TABLE IF EXISTS ";
	public final static String DROP_LIVRES = DROP_IF_EXISTS_STATEMENT + DB_TABLENAME_LIVRES;
	public final static String DROP_USAGERS = DROP_IF_EXISTS_STATEMENT + DB_TABLENAME_USAGERS;

	public final static String SCHEMA_USERS_ID = "id";
	public final static String SCHEMA_USERS_NOM = "nom";
	public final static String SCHEMA_USERS_PRENOM = "prenom";

	public final static String SCHEMA_BOOKS_ID = "id";
	public final static String SCHEMA_BOOKS_TITRE = "titre";
	public final static String SCHEMA_BOOKS_ANNEE = "annee";
	public final static String SCHEMA_BOOKS_AUTEUR_NOM = "nom_auteur";
	public final static String SCHEMA_BOOKS_AUTEUR_PRENOM = "prenom_auteur";
	public final static String SCHEMA_BOOKS_EDITEUR = "editeur";
	public final static String SCHEMA_BOOKS_DATE_SORTIE = "date_sortie";
	public final static String SCHEMA_BOOKS_DATE_RETOUR = "date_retour";
	public final static String SCHEMA_BOOKS_ID_USAGER = "id_usager";

}
