package com.modulo25.dao.generics;

import com.modulo25.annotation.TipoChave;
import com.modulo25.domain.Persistente;
import com.modulo25.exception.TipoChaveNaoEncontradaException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {

    private SingletonMap singletonMap;

    public  abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO() {
        this.singletonMap = SingletonMap.getInstance();
    }

    public Long getChave(T entity) throws TipoChaveNaoEncontradaException {
        Field[] fields = entity.getClass().getDeclaredFields();
        Long returnValue = null;
        for (Field field : fields) {
            if (field.isAnnotationPresent(TipoChave.class)) {
                TipoChave tipoChave = field.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                try {
                    Method method = entity.getClass().getMethod(nomeMetodo);
                    returnValue = (Long) method.invoke(entity);
                    return returnValue;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    throw  new TipoChaveNaoEncontradaException("Chave principal do objeto " + entity.getClass() );
                }
            }
        }
        if (returnValue == null) {
            String msg = "Chave principal do objeto " + entity.getClass() + " não encontrada ";
            System.out.println("****** ERRO ******");
            throw new TipoChaveNaoEncontradaException(msg);
        }
        return null;
    }
}
