package org.example.springassignment.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Seller extends BaseEntity {@Id
    private String sID;//점장 ID
    private String sName;//점장 이름
    private String sPW;//점장 PW
}