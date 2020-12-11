
package com.G3M4E5.Redflix88.repositorios;

import com.G3M4E5.Redflix88.modelos.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Roberto Londoño
 */
@Repository
public interface SeriesRepositorio extends JpaRepository<Series, String>{
    
}
