package com.sixtyone.asyncmessasingapp.configuration.resourceproperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "sixty-one.data")
@Getter
@Setter
@ToString
public class CassandraDataConfigProperties implements InitializingBean {


    private String username  ;
    private String password  ;
    private String contactPoints  ;
    private String keySpace  ;
    private int port;
    private String schemaAction ;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PROPS"+this.toString());
    }

}
