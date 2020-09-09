package devoirs2.java.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
public class TypeClient implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(length = 30)
        private String libelle;

        @OneToMany(mappedBy = "typeClient")
        private List<Client> clients;

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

        public List<Client> getClients() {
            return clients;
        }

        public void setClients(List<Client> clients) {
            this.clients = clients;
        }

        @Override
        public String toString() {
            return libelle;
        }

    }
