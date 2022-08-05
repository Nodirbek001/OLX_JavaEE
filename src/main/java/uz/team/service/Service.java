package uz.team.service;

public abstract class Service<R> {
    protected final R dao;

    protected Service(R dao) {
        this.dao = dao;
    }
}
