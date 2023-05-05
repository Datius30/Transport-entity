package Entity;


import jakarta.persistence.*;

@Entity
@Table(name="Sales")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    public Transport(String name,String description){
        this .name=name;
        this.description=description;

    }

    public Long getId(){
        return id;
    }

    public String getDescription(){
        return description;

    }

    public void setName(String name) {

        this.name = name;
    }
    public void setDescription(String description){
        this.description=description;
    }
}



