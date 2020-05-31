package net.devstudy.myphotos.common.cdi.extension;

import java.lang.annotation.Annotation;
import java.util.Set;
import java.util.logging.Logger;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;

/**
  * https://docs.jboss.org/weld/reference/latest/en-US/html/extend.html
  **/
public class PrintAllDiscoveredBeansExtension implements Extension {

    private final Logger logger = Logger.getLogger(getClass().getName());

    <T> void processAnnotatedType(@Observes ProcessAnnotatedType<T> processAnnotatedType, BeanManager bm) {
        String className = processAnnotatedType.getAnnotatedType().getJavaClass().getName();
        if (className.startsWith("net.devstudy")) {
            Set<Annotation> annotations = processAnnotatedType.getAnnotatedType().getAnnotations();
            logger.info(String.format("Discovered bean of %s with annotations: %s", className, annotations));
        }
    }
}
