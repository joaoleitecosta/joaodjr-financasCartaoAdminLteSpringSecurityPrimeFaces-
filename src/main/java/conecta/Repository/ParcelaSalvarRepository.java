package conecta.Repository;

import conecta.model.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelaSalvarRepository extends JpaRepository<Parcela, Long> {
	
	/*
	 * @Query(value = "DELETE Parcela p WHERE p.divida.id =:idDivida") void
	 * deleteParcelaByDividaId(@Param(value="idDivida")Long idDivida);
	 */
}
