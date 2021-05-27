package com.tallerback.repositories;



import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.tallerback.entity.TipoUsuario;


@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Long>{
	
}
