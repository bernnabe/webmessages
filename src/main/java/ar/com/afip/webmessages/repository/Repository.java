package ar.com.afip.webmessages.repository;

public interface Repository<T> {
    T find(String arg);
}
