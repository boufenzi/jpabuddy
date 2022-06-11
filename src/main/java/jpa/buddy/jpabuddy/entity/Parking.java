package jpa.buddy.jpabuddy.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "parking")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "price", nullable = false)
    private Double price;

    @OneToMany(mappedBy = "parking", cascade = CascadeType.PERSIST, orphanRemoval = true)
    @ToString.Exclude
    private Set<Car> cars = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Parking parking = (Parking) o;
        return id != null && Objects.equals(id, parking.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}