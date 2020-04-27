package org.example.pojo;

import lombok.*;

import java.util.Objects;

/**
 * @Author: aixiaolin
 * @Date: 2020-04-27 0:38
 * @Description:
 */
@Getter
@Setter@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    private String name;
    private String role;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Guest guest = (Guest) o;
        return Objects.equals(name, guest.name) &&
                Objects.equals(role, guest.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
}
