package br.com.projetocrud.projetocrud.dto;


import java.util.Objects;

public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String cpf;

    public UserDto() {
    }

    public UserDto(Long id, String name, String email, String phone, String cpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) && Objects.equals(name, userDto.name) && Objects.equals(email, userDto.email) && Objects.equals(phone, userDto.phone) && Objects.equals(cpf, userDto.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone, cpf);
    }
}
