In order to make this project work, you need to put the following content in the `/src/main/resources/META-INF/persistence.xml` file and create it if needed. 

``` xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
             http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd"
             version="2.2">
    <persistence-unit name="demo-PU">
      <class>dev.pedrolobo.jpademo.domain.Product</class>
        <properties>

            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/
              db_online_shopping?
              createDatabaseIfNotExist=true
              &amp;useTimezone=true
              &amp;serverTimezone=UTC" />

            <property name="javax.persistence.jdbc.user" value="jpa_user" />
            <property name="javax.persistence.jdbc.password" value="secret" />
            <property name="javax.persistence.jdbc.driver"
                      value="com.mysql.cj.jdbc.Driver" />

            <property
                    name="javax.persistence.schema-generation.database.action"
                    value="drop-and-create"/>

            <property name="hibernate.dialect"
                      value="org.hibernate.dialect.MySQL8Dialect" />

            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.format_sql" value="true" />

        </properties>
    </persistence-unit>
</persistence>
```
Then, create MySQL username, password and database using the same properties names available in the `persistence.xml` file.

To run this project, use the command below:

```bash
./gradlew run
```
