/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec.project.domain;

/**
 *
 * @author antti
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Account extends AbstractPersistable<Long> {

    @Column(unique = true)
    private String username;
    private String password;
    private boolean status;
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
    this.password = password;
    }
        
    public String getPassword() {
        return password;
    }
    
    public void setStatus(boolean status) {
    this.status = status;
    }
        
    public boolean getStatus() {
    return status;
    }
}