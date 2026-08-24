package co.simplon.basicauth.entity;

import jakarta.persistence.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;


@Entity
    @Table(name = "role")
public class RoleEntity  implements GrantedAuthority {

    @Id
    private String authority;

    public RoleEntity(){
    }

    @Override
    public @Nullable String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
