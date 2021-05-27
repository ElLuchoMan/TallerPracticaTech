package com.tallerback.repositories;


import org.springframework.data.jpa.repository.*;

import com.talllerback.models.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Long>{
	
}
