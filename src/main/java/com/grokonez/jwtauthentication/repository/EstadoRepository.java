package com.grokonez.jwtauthentication.repository;
import java.util.List;

import com.grokonez.jwtauthentication.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

    @Query(value = "select NEW com.grokonez.jwtauthentication.model.Estado(c.idestado, c.estado) from Estado c order by c.idestado")
    List<Estado> findAll(Long idestado);
}