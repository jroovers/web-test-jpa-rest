package test.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Jeroen Roovers
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@NamedQuery(name = "Person.findAll", query = "Select p from Person p")
@XmlRootElement
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @XmlElement(required = true)
    private String name;
    private Integer age;

    @OneToMany(mappedBy = "owner")
    private List<Puppy> puppies;

}
