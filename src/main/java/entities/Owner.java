package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @Column(name = "owner_ID", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "owner_name", length = 45)
    private String ownerName;

    @Size(max = 45)
    @Column(name = "owner_adress", length = 45)
    private String ownerAdress;

    @Size(max = 45)
    @Column(name = "owner_phonenum", length = 45)
    private String ownerPhonenum;

    @Size(max = 45)
    @Column(name = "ownercol", length = 45)
    private String ownercol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAdress() {
        return ownerAdress;
    }

    public void setOwnerAdress(String ownerAdress) {
        this.ownerAdress = ownerAdress;
    }

    public String getOwnerPhonenum() {
        return ownerPhonenum;
    }

    public void setOwnerPhonenum(String ownerPhonenum) {
        this.ownerPhonenum = ownerPhonenum;
    }

    public String getOwnercol() {
        return ownercol;
    }

    public void setOwnercol(String ownercol) {
        this.ownercol = ownercol;
    }

}