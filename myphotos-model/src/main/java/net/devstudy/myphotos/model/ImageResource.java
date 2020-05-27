package net.devstudy.myphotos.model;

import javax.validation.Path;

public interface ImageResource extends AutoCloseable {

    Path getTempPath();

    @Override
    void close();
    
}
