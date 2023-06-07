package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Address;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Модель человека
 */
@lombok.experimental.SuperBuilder

@Schema(name = "Person", description = "Модель человека")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-30T12:28:23.573805+03:00[Europe/Moscow]")
public class Person {

  private String surname;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  private Integer height;

  @Valid
  private List<@Valid Address> address;

  public Person surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Фамилия
   * @return surname
  */
  
  @Schema(name = "surname", description = "Фамилия", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Имя
   * @return name
  */
  
  @Schema(name = "name", description = "Имя", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Дата рождения
   * @return birthDate
  */
  @Valid 
  @Schema(name = "birthDate", description = "Дата рождения", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Person height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Рост
   * @return height
  */
  
  @Schema(name = "height", description = "Рост", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Person address(List<@Valid Address> address) {
    this.address = address;
    return this;
  }

  public Person addAddressItem(Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Адреса проживание и прописки
   * @return address
  */
  @Valid 
  @Schema(name = "address", description = "Адреса проживание и прописки", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public List<@Valid Address> getAddress() {
    return address;
  }

  public void setAddress(List<@Valid Address> address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.surname, person.surname) &&
        Objects.equals(this.name, person.name) &&
        Objects.equals(this.birthDate, person.birthDate) &&
        Objects.equals(this.height, person.height) &&
        Objects.equals(this.address, person.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, name, birthDate, height, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

