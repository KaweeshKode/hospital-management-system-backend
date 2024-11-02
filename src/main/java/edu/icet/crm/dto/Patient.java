package edu.icet.crm.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {
    private Integer id;
    private String name;
    private String nic;
    private String address;
    private String age;
    private String gender;
    private String contact;
    private String category;
    private String allergies;
    private String bloodGroup;
    private String note;
}
