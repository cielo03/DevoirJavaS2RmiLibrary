package devoirs2.java.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class Profile implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(length = 30)
        private String libelle;

        @OneToMany(mappedBy = "profile")
        private List<Utilisateur> users;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLibelle() {
            return libelle;
        }

        public void setLibelle(String libelle) {
            this.libelle = libelle;
        }

        public List<Utilisateur> getUsers() {
            return users;
        }

        public void setRues(List<Utilisateur> users) {
            this.users = users;
        }

        @Override
        public String toString() {
            return libelle;
        }

}
