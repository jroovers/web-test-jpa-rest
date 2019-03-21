package test.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Jeroen Roovers
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedQuery(name = "Puppy.findAll", query = "Select p from Puppy p")
public class Puppy implements Serializable {
    
    // some changes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @ManyToOne
    private Person owner;
}
