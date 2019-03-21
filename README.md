# web-test-jpa-rest

Needed to run:

- Payara
- MySQL8 + Connector/J

Payara configuration

- add <connector/J>.jar to payara in %payara_dir%\glassfish\domains\{yourdomain}\lib
- Setup payara connection pool (important settings below for *local install*)
  - datasource: com.mysql.cj.jdbc.MysqlDataSource
  - servername: localhost
  - databasename: *schema name*
  - port: 3306
  - user
  - password
  - **useSLL = false**
  - **useTimezone = true**
  - **serverTimezone = CET**
- create jdbc resource in payara
- make sure persistence unit has name of jdbc resource

profit
