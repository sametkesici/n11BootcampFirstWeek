package entity;

import java.util.List;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * id
 * adi
 * fiyat
 * kayitTarihi
 * KategoriId
 */
@Entity
@Table(
        name = "URUN"
)
@Getter
@Setter
@ToString
public class Urun {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 50, name = "ADI")
    private String adi;

    @Column(name = "FIYAT" , precision = 19, scale = 2)
    private BigDecimal fiyat;

    @Column(name = "KAYIT_TARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kayitTarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KATEGORI_ID",
            foreignKey = @ForeignKey(name = "FK_URUN_KATEGORI_ID")
    )
    private Kategori kategori;


}
