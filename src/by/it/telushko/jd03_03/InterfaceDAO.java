package by.it.telushko.jd03_03;

import java.util.List;

/**
 * Created by Владимир on 10.04.2016.
 */
public interface InterfaceDAO <TYPE> {
    //READ чтение отдельной сущности
    TYPE read(int id);
    //CREATE,UPDATE,DELETE обновление сущности
    boolean create(TYPE entity);
    boolean update(TYPE entity);
    boolean delete(TYPE entity);

    //READ - чтение всех элементов по условию
    List<TYPE> getAll(String WhereAndOrder);
    //и другие необходимые системе операции
}
