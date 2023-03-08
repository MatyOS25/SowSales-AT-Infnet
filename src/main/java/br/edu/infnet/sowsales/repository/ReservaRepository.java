package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.Reserva;
import br.edu.infnet.sowsales.model.domain.User;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class ReservaRepository {
    private static Integer id = 1;
    private static Map<Integer,Reserva> mappedEntity = new HashMap<Integer, Reserva>();
    public static boolean add(Reserva entity){
        try{
            entity.setId(id++);
            mappedEntity.put(entity.getId(),entity);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public static Reserva remove(Integer key){
      return mappedEntity.remove(key);  
    }
    public static Collection<Reserva> returnList(){
        return  mappedEntity.values();
    }
}
