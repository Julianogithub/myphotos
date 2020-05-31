package net.devstudy.myphotos.common.producer;

import java.util.Properties;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import net.devstudy.myphotos.common.annotation.cdi.PropertiesSource;

@Dependent
public class PropertiesSourceProducer extends AbstractPropertiesLoader {

    @Produces
    @PropertiesSource("")
    private Properties loadProperties(InjectionPoint injectionPoint) {
        Properties properties = new Properties();
        PropertiesSource propertiesSource = injectionPoint.getAnnotated().getAnnotation(PropertiesSource.class);
        loadProperties(properties, propertiesSource.value());
        return properties;
    }
}
