package net.devstudy.myphotos.exception;

public class ConfigException extends ApplicationException {

    public ConfigException(String string) {
        super(string);
    }

    public ConfigException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }
    
}
