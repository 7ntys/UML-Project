package repository;

public interface IRepository<T,Id> {
    public void create(T t);
    public T read(Id id);
    public void update(T t);
    public boolean delete(Id id);
}
