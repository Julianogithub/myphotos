package net.devstudy;

import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import net.devstudy.myphotos.common.annotation.cdi.Property;

@Singleton
@Startup

public class Test {
    
    @Inject
    @Property("myphotos.host")
    private String host;
    
    @Inject
    @Property("classpath:application.properties")
    private Properties properies;
    
    @PostConstruct
    private void postConstruct(){
        System.out.println("----------host=" + host +", properies" + properies);
    }
}
