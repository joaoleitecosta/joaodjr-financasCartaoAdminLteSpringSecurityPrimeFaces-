package conecta.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity
@Table(name = "parcela")
public class Parcela implements Serializable, AbstractEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_parcela", updatable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false, updatable = false)
    private Date data;

    @Column(nullable = false, length = 2, updatable = false)
    private Integer numero;

    @Column(nullable = false, precision = 10, scale = 2, updatable = false)
    private BigDecimal valor;

    @Column(name = "valor_pago", precision = 10, scale = 2)
    private BigDecimal valorPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_cod_situacao")
    private Situacao situacao;

    @ManyToOne
    @JoinColumn(name = "fk_cod_divida", nullable = false)
    private Divida divida;


    public String getDataFormatada() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(this.data);
    }

}
