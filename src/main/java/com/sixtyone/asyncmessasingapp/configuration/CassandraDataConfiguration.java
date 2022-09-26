package com.sixtyone.asyncmessasingapp.configuration;

import com.sixtyone.asyncmessasingapp.configuration.resourceproperties.CassandraDataConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(CassandraDataConfigProperties.class)
public class CassandraDataConfiguration extends AbstractCassandraConfiguration {

    @Value("${sixty-one.data.contact-points}")
    private String contactPoint;

    private CassandraDataConfigProperties properties;

    @PostConstruct
    public void init () {
        System.out.println("are properties injected? "+ !(properties == null) );
    }


    @Override
    protected String getKeyspaceName() {
        return properties.getKeySpace();
    }

    @Override
    protected String getContactPoints() {
        return properties.getContactPoints();
    }

    @Override
    protected int getPort() {
        System.out.println("PORT:"+properties.getPort());
        return properties.getPort();
    }

    @Override
    public SchemaAction getSchemaAction() {
        SchemaAction schemaAction =	Enum.valueOf(SchemaAction.class,properties.getSchemaAction());
        return schemaAction;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.sixtyone.asyncmessasingapp.model"};
    }

    @Autowired
    public void setProperties(CassandraDataConfigProperties properties) {
        System.out.println("Contact point:"+contactPoint);
        this.properties = properties;
    }


}
