package net.devstudy.myphotos.common.resource;

import java.io.IOException;
import java.io.InputStream;
import javax.enterprise.inject.Vetoed;

@Vetoed
public interface ResourceLoader {

    boolean isSupport(String resourceName);

    InputStream getInputStream(String resourceName) throws IOException;
}
